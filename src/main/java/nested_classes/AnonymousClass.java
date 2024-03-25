package nested_classes;

/**
 *  AnonymousClass(Анонимный класс) - это класс без имени, где одновременно создается его объект и наделяется какими-то
 * свойствами и методами. Чаще всего используется для быстрого и разового использования, например: переопределение методов.
 * - Не имеет конструктора
 * - Может обращаться даже к private элментам внешенего класса
 * - Имеет краткую форму написания в виде Lambda expressions
 *
 */
public class AnonymousClass {
    private String result = "Результат операции: ";
    private int x = 10;

    public static void main(String[] args) {

        AnonymousClass anonymousClass = new AnonymousClass();

        MathInterface m = new MathInterface() {
            @Override
            public int doMultiplying(int value1, int value2) {
                return value1*value2;
            }

            @Override
            public int doDividing(int value1, int value2) {
                return value1/value2;
            }
        };

        MathClass m2 = new MathClass() {
            @Override
            int doMultiplying(int a, int b) {
                return + anonymousClass.x + super.doMultiplying(a, b);
            }

            @Override
            int doDividing(int a, int b) {
                return anonymousClass.x + super.doDividing(a, b);
            }
        };

        System.out.println(anonymousClass.result + m.doMultiplying(3, 6));
        System.out.println(anonymousClass.result + m2.doMultiplying(3,6));
    }


}

class MathClass {
    int doMultiplying(int a, int b) {
        return a*b;
    }

    int doDividing(int a, int b) {
        return a/b;
    }
}

interface MathInterface {
    int doMultiplying(int value1, int value2);
    int doDividing(int value1, int value2);
}