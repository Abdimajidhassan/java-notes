package week1;

import static input.InputUtils.stringInput;

public class Departmentcode {
    public static void main(String[] args) {


        String departmentCode = stringInput("enter demartment code");//user input

        // check for valid code itec

        if (departmentCode.length() == 4) {// need to tell that the lenght cant be more than 4
            System.out.println("the code is valid");
            departmentCode= departmentCode.toUpperCase();//
            System.out.println("the code is " + departmentCode);
        }else {
            System.out.println("the code is not valid");
        }
    }
}
