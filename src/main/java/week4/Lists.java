package week4;

import java.util.ArrayList;
import java.util.List;

public class Lists {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();//we are making and Sting data
        arrayList.add("HEllo");//need to add data
        arrayList.add("World");
        arrayList.add("Abdimajid");
        arrayList.add("MCTC");
        for (String s : arrayList) {
            System.out.println(s);// need to print the data
            System.out.println(s.toUpperCase());//we are making the data uppercase
            System.out.println(s.length());// we need the to see if the is data to print in []
        }
        System.out.println(arrayList);
    }
}
