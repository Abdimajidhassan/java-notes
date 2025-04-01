package week6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class helloreading {
    public static void main(String[] args) throws IOException {
        //FileReader Reader = new FileReader("hello.txt");
        BufferedReader bufferedReader = new BufferedReader(new FileReader("hello.txt"));
        String line;//2 ways of doing it
        //String line = bufferedReader.readLine();
        while ((line =bufferedReader.readLine()) !=  null){
            System.out.println(line);
            //line = bufferedReader.readLine();
        }

        //System.out.println(bufferedReader.readLine());
       // System.out.println(bufferedReader.readLine());
       // System.out.println(bufferedReader.readLine());
       // System.out.println(bufferedReader.readLine());
       // System.out.println(bufferedReader.readLine());
        //System.out.println(bufferedReader.readLine());
       // System.out.println(bufferedReader.readLine());
        bufferedReader.close();
    }
}
