package week7;

import java.util.ArrayList;
import java.util.List;

public class ITECcourse {
    String name;
    int code;
    List<String> students;
    int maxStudents;

    void  addStudents (String studentName) {
        if( students == null ) {
            students = new ArrayList<>();

        }
        students.add(studentName);
    }
    void writeCourseInfo(){
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled: ");
        for(String s : students) {
            System.out.println(s);
        }
        System.out.println("there are " + getNumberofStudents() + "students enroled");
        System.out.println("The max number of students that can enroll in this course is " + maxStudents);
    }
    int getNumberofStudents() {
        return students.size();
    }

}
