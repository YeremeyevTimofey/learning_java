package nested_classes;

public class NestedClasses {
    /**
     * Nested classes(Вложенные классы) - используются для тесной привязки внешнего и внутреннего класса. В большинстве
     * случаев это неотемлемая составляющая целого объекта(Автомобиль/Колесо). Существует 4 вида:
     * - Обычные nested классы
     * - Static inner классы
     * - Local классы
     * - Anonymous классы
     */

// Вложенный класс
    class Nested{}

// Static inner класс
    static class StaticNested {}

// Класс вложенный в метод
    void classMethod() {
        class C {}
        Nested nestedClass = new Nested();
        C c = new C();
    }

}
