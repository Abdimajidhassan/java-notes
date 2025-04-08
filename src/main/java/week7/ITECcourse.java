package week7;

import java.util.ArrayList;
import java.util.List;

public class ITECcourse {
    private String name;
    private int code;
    private List<String> students;
    private int maxStudents;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public int getMaxStudents() {
        return maxStudents;
    }

    public void setMaxStudents(int maxStudents) {
        if (maxStudents < 0) {
            return;
        }
        this.maxStudents = maxStudents;
    }

    public ITECcourse(String courseName, int courseCode, int courseMaxStudents) {
        name = courseName;
        code = courseCode;
        maxStudents = courseMaxStudents;
        students = new ArrayList<>();
    }

   public void  addStudents (String studentName) {
        if (students.size() == maxStudents) {
            System.out.println("Course is full, cant add " + studentName);
        }else {
            students.add(studentName);
        }

    }
    public void writeCourseInfo(){
        System.out.println("Course Name: " + name);
        System.out.println("Course Code: " + code);
        System.out.println("Students enrolled: ");
        for(String s : students) {
            System.out.println(s);
        }
        System.out.println("there are " + getNumberofStudents() + " students enroled");
        System.out.println("The max number of students that can enroll in this course is " + maxStudents);
    }
    public int getNumberofStudents() {
        return students.size();
    }
   public void removeStudent(String studentName) {
        if(students.contains(studentName)) {
            students.remove(studentName);
            System.out.println(studentName + " was un-enrolled from this course  " + name);
        }else {
            System.out.println(studentName + " was not fount in  " + name);
        }
    }

}
