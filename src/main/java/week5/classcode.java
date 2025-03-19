package week5;

import java.util.HashMap;
import java.util.Map;

public class classcode {
    public static void main(String[] args) {
        Map<Integer, String> classCode= new HashMap<>();
        classCode.put(2545, "java");//using code to help us get ifo and itec code in for classed
        classCode.put(1425, "Datacom");
        classCode.put(2560, "Web");
        classCode.put(2417, "Android");


        for (Integer classkey: classCode.keySet()){// use int for the numbers class.key set for the info together.
            String className = classCode.get(classkey);
            System.out.println("Itec" + classkey + " " + className);


        }
        System.out.println("i am taking " + classCode.size() + " classes");
        int searchCode= 2417;
        if (classCode.containsKey(searchCode)) {
            System.out.println("this class is found in the hashmap. the class name is " + classCode.get(searchCode));
        }else {
            System.out.println("this class is not found in the hashmap. the class name is " + searchCode    );
        }
        int searchCode2= 2545;
        String className = classCode.get(searchCode2);
        if (className == null) {
            System.out.println(searchCode2 + " Not found " );
        }else {
            System.out.println("This clas is found in the hashmap. the class name is " + className);
        }
    }
}
