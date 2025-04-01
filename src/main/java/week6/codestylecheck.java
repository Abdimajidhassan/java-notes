package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class codestylecheck {
    public static void main(String[] args) {
        String filename = "readNumberFromfile.java";
        int maxlinelenghth = 100;
       try (
           BufferedReader reader = new BufferedReader(new FileReader("readNumberFromfile.java"))){;
           boolean linetoolong = false;
           String line = reader.readLine();
           int linecounter = 1;
           while (line != null) {
               if (line.length() > maxlinelenghth) {
                   System.out.println("the line" + linecounter + "is too long");
                   System.out.println(line);
                   linetoolong = true;

               }
               linecounter++;
               line = reader.readLine();
               {

               }
               if (linetoolong) {
                   System.out.println("the line is too long");
               }else {
                   System.out.println("the line is too short");
               }

           }
       }
       catch (IOException e){
           System.out.println("error reading file " + filename + " because " + e);
       }

    }
}