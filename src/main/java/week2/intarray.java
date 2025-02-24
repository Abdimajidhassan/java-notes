package week2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class intarray {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 4;
        numbers[1] = 9;
        numbers[2] = 100;

        String[] classsNames = {"Java", "c#", "web", "Android", "ISO"};
        //classsNames[0] = "Java";
        //classsNames[1] = "Python";
        //classsNames[2] = "C#";
        System.out.println("One of the second year classes is " + classsNames[2]);

        int numberOfClasses = classsNames.length;
        System.out.println("there are " + numberOfClasses + " classes");

        for (int x=0; x<classsNames.length; x++){
            System.out.println("A class Name is " + classsNames[x]);
        }

        System.out.println(Arrays.toString(classsNames));
    }


}
