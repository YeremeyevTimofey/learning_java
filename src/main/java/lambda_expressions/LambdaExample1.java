package lambda_expressions;

/**
 * Lambda expressions(Лямбда выражения) - аналог анонимных классов для короткой записи непереисползуемого кода. Повышает
 * читаемость и скорость написания кода. Главной особенностью является добавление функционального стиля с возможностью
 * написания функции в параментрах другой функции, как описано в примере ниже.
 */
public class LambdaExample1 {
    static void def(Lambda lambda) {
        System.out.println(lambda.length("HelloWorld"));
    }

    public static void main(String[] args) {
        def(
                (String string) -> {
                    return string.length();
                });
    }
}

interface Lambda {
    int length(String string);
}
