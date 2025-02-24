package week2;

import java.util.Arrays;

import static input.InputUtils.stringInput;

public class textbook {
    public static void main(String[] args) {
        String[] textBook = new String[5];


        for (int number= 0 ; number < textBook.length ; number++) {

            String bookName = stringInput("please enter name of textbook");
            textBook[number] = bookName;
        }
        System.out.println("thank you; Here the data you entered");
        System.out.println(Arrays.toString(textBook));
    }
}
