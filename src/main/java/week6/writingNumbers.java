package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingNumbers {
    public static void main(String[] args) throws IOException {

        int data1 = 67;
        int data2 = 65;
        int data3 = 84;

        double number = 12.34;
        FileWriter Writer = new FileWriter("numbers.txt");
        BufferedWriter bufferWriter = new BufferedWriter(Writer);

        bufferWriter.write(data1 + "\n");
        bufferWriter.write(data2 + "\n");
        bufferWriter.write(data3 + "\n");
        bufferWriter.write(number + "\n");
        bufferWriter.write("test");
        bufferWriter.close();

    }
}
