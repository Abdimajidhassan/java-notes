package week4;


import java.util.ArrayList;
import java.util.List;


import static input.InputUtils.stringInput;

public class userinput {
    public static void main(String[] args) {
        List<String> todolist = new ArrayList<>();//need to make a data asking the user  info

        while (true){
            String data = stringInput("Type a task you need to do , or enter to quit");//use a string to ask the user for info
            if (data.isEmpty()){//if info not found then break
                break;
            }
            if (containsIgnoreCase(todolist, data)){//need to make sure no same data is added cap or not
                System.out.println("you already added to the list");
            }else {
                todolist.add(data);
            }

        }
        System.out.println("thank you, here are all of your tasks you entered;");

        for (String input: todolist) {//connecting Strings
            System.out.println(input);
        }
        System.out.println("you have " + todolist.size() + " tasks");
        }
        public static boolean containsIgnoreCase(List<String> list, String data) {
        for (String item: list) {//creat a psv for the uppercase
            if (item.equalsIgnoreCase(data)) {
                return true;
            }
        }
        return false;
        }
}

