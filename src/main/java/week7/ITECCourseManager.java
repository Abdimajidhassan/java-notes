package week7;

import java.util.ArrayList;

public class ITECCourseManager {
    public static void main(String[] args) {
        ITECcourse maintenanceCourse = new ITECcourse("Microcomputer Systems Maintenance", 1310, 20);
        //maintenanceCourse.name = "Microcomputer Systems Maintenance";
        //maintenanceCourse.code = 1310;
        //ArrayList<String> maintenanceCourseStudentList = new ArrayList<>();
        //maintenanceCourse.maxStudents = 20;

        maintenanceCourse.addStudents("John Smith");
        maintenanceCourse.addStudents("Jane Doe");
        maintenanceCourse.addStudents("Jane Smith");
        maintenanceCourse.removeStudent("John Smith");
        maintenanceCourse.removeStudent("Jappp");

        maintenanceCourse.writeCourseInfo();

        ITECcourse datacomCourse = new ITECcourse("Data Communications",1425, 30);
        //datacomCourse.name = "Data Communications";
        //datacomCourse.code = 1425;
        //datacomCourse.maxStudents = 30;

        datacomCourse.addStudents("John Smih");
        datacomCourse.addStudents("Jne Doe");
        datacomCourse.addStudents("Jan Smith");

        datacomCourse.writeCourseInfo();

        System.out.println();

        ITECcourse softwareCourse = new ITECcourse(" Software Development Projects ",2903, 24);
        softwareCourse.addStudents("Gus");
        softwareCourse.addStudents("harry");
        softwareCourse.addStudents("izzy");
        softwareCourse.addStudents("Jane Doe");

        int totalEnrolled = softwareCourse.getNumberofStudents();
        System.out.println("The software development class has " + softwareCourse.getName()
                + totalEnrolled + " students");
        System.out.println("Itec " + softwareCourse.getCode() + " " + softwareCourse.getName());

        softwareCourse.setMaxStudents(30);
        softwareCourse.writeCourseInfo();

        ITECcourse smallCourse = new ITECcourse(" made up course ",1234, 3);
        smallCourse.addStudents("molly");
        smallCourse.addStudents("Doe");
        smallCourse.addStudents("Abdi");
        smallCourse.removeStudent("Abdi");
        smallCourse.addStudents("Hassan");
        smallCourse.writeCourseInfo();




    }
}
