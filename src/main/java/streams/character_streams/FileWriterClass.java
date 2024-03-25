package streams.character_streams;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter - класс, реализующий возможность записи чего то в файл, имеющий мноэество конструкторов для реализзации.
 * При вызове метода write, может автоматически кастить элементы в int.
 * Параметр assert позволяет дополнять файл без полной перезаписи.
 */
public class FileWriterClass {
    public static void main(String[] args) throws IOException {
        String rubai = """
                            Рубаи
                Много лет размышлял над жизнью земной
                Непонятного нет для меня под луной
                Мне известно, что для меня ничего не известно
                Вот последняя правда, открытая мной
                """;
        String enfOfRubai = "\nКонец стихотворения";
        try (FileWriter writer = new FileWriter("test2.txt")) {
//            for (int i = 0; i < rubai.length(); i++) {
//                writer.write(rubai.charAt(i));
//            }
            writer.write(rubai);
            System.out.println("Done!");
        } catch (IOException e) {
            throw new RuntimeException();
        }
    }
}
