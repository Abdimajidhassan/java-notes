package week6;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class montharray {
    public static void main(String[] args) throws IOException {
        String filename = "newmonth.txt";
        List<String> monthname = List.of("Jan", "Feb", "Mar");
        BufferedWriter writer = new BufferedWriter(new FileWriter(filename));

        for (int i = 0; i < monthname.size(); i++) {
            writer.write(monthname.get(i) + "\n");
        }
        writer.close();

    }
}
