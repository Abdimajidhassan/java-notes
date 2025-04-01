package week6;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class writingarraylist {
    public static void main(String[] args) throws IOException {
        final String file = "ITEC_CLASSES.txt";
        List<String> classnames = List.of("Java", "Web" ,"C#");
        List<Integer> classcodes = List.of(2545, 2560, 2505);
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file));

        for (int i = 0 ;i <classnames.size(); i++) {
            String name = classnames.get(i);
            int code = classcodes.get(i);
            bufferedWriter.write("ITEC " + code + " " + name + "\n");
        }
        bufferedWriter.close();

        BufferedReader bufferedReader = new BufferedReader(new FileReader(file));
        List<String> classDescriptions = new ArrayList<>();
        String line;
        while ((line = bufferedReader.readLine()) != null) {
            classDescriptions.add(line);
            line = bufferedReader.readLine();
        }
        System.out.println("end of file reached");
        System.out.println(classDescriptions);
        bufferedReader.close();


    }
}
