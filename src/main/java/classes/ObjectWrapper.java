package classes;

import java.io.IOException;
import java.io.InputStreamReader;

public class ObjectWrapper {
    /**
     * System.in - статическая переменная класса System, хранящая объект класса InputStream. Тот в свою очередь
     * представляет поток информации(например ввод с клавиатуры), который мы можем считывать. При помощи метода read(),
     * можно получить количество байт, которое занимает написанный символ + число перевода строки. Чтобы работа
     * метода read(), была более удобной и понятной принято использовать объекты обертки(дектораторы).
     * Как правило это класс, в параметре конструктора принимающий объект другого, как то меняющий его поведение.
     * Живым примером 
     *
     */
    public static void main(String[] args) throws IOException {
//        while(true) {
//            int byteIn = System.in.read();
//            System.out.println(byteIn);
//        }

// Декоратор:
        InputStreamReader inputSymbols = new InputStreamReader(System.in);
        while (true) {
            int symbolIn = inputSymbols.read();
            System.out.println((char) symbolIn);
        }
    }
}
