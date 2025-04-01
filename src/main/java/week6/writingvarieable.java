package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class writingvarieable {
    public static void main(String[] args)throws IOException {
        int classCode = 2454;
        double averageEnrillent = 22.16;
        String Classname = "Java";

        FileWriter Writer = new FileWriter("java.txt");
        BufferedWriter bufferWriter = new BufferedWriter(Writer);
        bufferWriter.write("The class code is " + classCode + "\n");
        bufferWriter.write("The average enrollment is " + averageEnrillent + " students.\n");
        bufferWriter.write("The name of the class is " + Classname + "\n");
        bufferWriter.close();

    }
}
