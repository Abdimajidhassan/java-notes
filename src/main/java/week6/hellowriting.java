package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class hellowriting {
    public static void main(String[] args) throws IOException {
        FileWriter writer = new FileWriter("hello.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(writer);

        bufferedWriter.write("hello:\n");
        bufferedWriter.write("MORE here\n");
        bufferedWriter.write("goodbye\n");

        bufferedWriter.close();
        FileWriter writer2 = new FileWriter("hello.txt",true);//appending adding data to the end
        BufferedWriter bufferedWriter2 = new BufferedWriter(writer2);

        bufferedWriter2.write("other data");
        bufferedWriter2.newLine();
        bufferedWriter2.write("hello programmers");
        bufferedWriter2.newLine();
        bufferedWriter2.write("End of file");
        bufferedWriter2.newLine();
        bufferedWriter2.close();

    }
}
