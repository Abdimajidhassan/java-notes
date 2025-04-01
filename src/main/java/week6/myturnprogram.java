package week6;

import java.io.*;

public class myturnprogram {
    public static void main(String[] args) throws IOException {
        //FileWriter Writer = new FileWriter("mine.txt");
        BufferedWriter bufferWriter = new BufferedWriter(new FileWriter("mine.txt"));
        String name = "abdimajid";
        String color = "Green";
        int classcode = 2545;
        bufferWriter.write(name + "\n");
        bufferWriter.write(color + "\n");
        bufferWriter.write(classcode + "\n");
        bufferWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader("mine.txt"));
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            System.out.println(line);

        }
        bufferedReader.close();
    }
}
