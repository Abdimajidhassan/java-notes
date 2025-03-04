package week4;

import java.util.ArrayList;
import java.util.List;

public class Removing {
    public static void main(String[] args) {
        List<String> classNames = new ArrayList<>();//we need to work on removing /adding data
        classNames.add("Proggraming Logic");//need to add the info for the program
        classNames.add("Web Client Server");
        classNames.add("Project Management");
        classNames.add("Software Engineering");

        System.out.println(classNames);//print the Strings

        boolean wasremoved = classNames.remove("Software Engineering");//need to remove one string
        System.out.println(classNames + " " + wasremoved);

        classNames.remove(0);// int type
        System.out.println(classNames);

        classNames.set(1, "system Analysis");//we are replaced set 1 with system
        System.out.println(classNames);

        String search = "Web Client Server";//we need to search a string to see if its in the data Array

        if (classNames.contains(search)) {
            System.out.println("the list contains " + search);//same
        }else {
            System.out.println("the list does not contain " + search);
        }
        System.out.println(classNames.size());//need to see the size of the data

        classNames.clear();//Diffrent ways of checking if class has data
        System.out.println(classNames);
        System.out.println(classNames.size());
    }

}
