package week4;

import java.util.ArrayList;
import java.util.List;

public class removingjava {
    public static void main(String[] args) {
            List<String> className = new ArrayList<>();
            className.add("Proggraming Logic");
            className.add("Web Client Server");
            className.add("Project Management");
            className.add("Software Engineering");

            for (String name : className) {
                System.out.println(name);
                //className.remove(0); error
            }

        System.out.println();

            for (int i = 0; i < className.size(); i++) {
                //index if need to know index/data
                System.out.println(className.get(i));
                //className.remove(0);
            }
        System.out.println();
            while (!className.isEmpty()) {
                String name = className.remove(0);
                System.out.println(name);
            }
        System.out.println(className);


        }
}
