package week4;

import java.util.ArrayList;
import java.util.List;

public class Addinglists {
    public static void main(String[] args) {
        List<Integer> classcode= new ArrayList<>();
        classcode.add(1545);//adding classs numbers
        classcode.add(1150);
        classcode.add(1250);
        classcode.add(0, 1425);//picking which the order to replace/change
        classcode.add(2, 1100);
        System.out.println(classcode);//print class code
        System.out.println(classcode.size());//need the size of class


        for (int classCodes : classcode ) {
            System.out.println("Itec " + classCodes);//need to make if itec 1112
        }
    }
}
