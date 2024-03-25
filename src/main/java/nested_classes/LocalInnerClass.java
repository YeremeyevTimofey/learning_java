package nested_classes;

/**
 * Local inner class - это классы созданные в блоках кода, таких как: метод, конструктор. Может быть использован для
 * лучшей инкапсуляции, т.к область видимости такого объекта - это блок в котором он находится.
 * - Может обращаться к private элементам внешнего класса
 * - Не имеет модификаторы доступа, так же не может быть static, автоматически им и является т.к. видимость только в блоке кода.
 * - Может обращаться к элементам своего блока, при условии, что они final или effectively final
 * (Элемент не изменялся с момента инициализации в блоке кода) Пример num1 и num2 в классе Math.
 */
public class LocalInnerClass {
    public static void main(String[] args) {
        Math mathInterface = new Math(5, 2);
        mathInterface.dividing();
        mathInterface.multiplying();
    }
}

class Math {

    private final int num1;
    private final int num2;

    public Math(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void multiplying() {

        class Multiplying{
            public int getIntResult() {
                return num1 * num2;
            }

            public long getLongResult() {
                return (long) num1 * num2;
            }
        }
        Multiplying m = new Multiplying();
        System.out.println(
                "Результат умножения без остатка: " + m.getIntResult() + "\n" +
                "Результат умножения с остатком: " + m.getLongResult()
        );

    }

    public void dividing() {

        class Dividing {
            public int getMainResult() {
                return num1/num2;
            }

            public int getRemainder() {
                return num1%num2;
            }
        }
        Dividing d = new Dividing();
        System.out.println(
                "Результат деления без остатка: " + d.getMainResult() + "\n" +
                "Остаток от деления : " + d.getRemainder()
        );

    }
}