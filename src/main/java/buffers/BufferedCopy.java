package buffers;

import java.io.*;

public class BufferedCopy {
    public static void main(String[] args) throws IOException {
        try(
                BufferedReader reader = new BufferedReader(
                        new FileReader("test2.txt"));
                BufferedWriter writer = new BufferedWriter(
                        new FileWriter("test3.txt"))
        ) {
            int character;
            while ((character = reader.read()) != -1) {
                writer.write(character);
            }
            System.out.println("Done!");
        }
    }
}
