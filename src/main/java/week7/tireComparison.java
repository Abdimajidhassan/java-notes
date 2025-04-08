package week7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static input.InputUtils.*;

public class tireComparison {
    public static void main(String[] args) {
      //  tire example = new tire("bridgestone", 40, 10000);
      //  System.out.println("$" + example.priceper1000miles());
      //  System.out.println(example);
      //  System.out.println(example.costForSet());
        List<tire> tireList = new ArrayList<>();
        do {
            tire tire = gettireInfo();
            tireList.add(tire);


        }while(yesNoInput("more tire to add to compare"));
        Collections.sort(tireList);

        printReporttable(tireList);
    }

    private static void printReporttable(List<tire> tireList) {
        for (tire tiree : tireList) {

            //System.out.println(tiree);
            System.out.println(tiree + "cost per set of 4 is $" + tiree.costForSet());
        }
    }

    private static tire gettireInfo() {
        String name = stringInput("enter name of tire?");
        double price = positiveDoubleInput("enterprice of " + name + "?");
        int mileWarranty = positiveIntInput("enter number of miles per warranty?");

        tire tire = new tire(name, price, mileWarranty);
        return tire;
    }
}
