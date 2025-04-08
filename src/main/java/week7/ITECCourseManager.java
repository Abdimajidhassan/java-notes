package week7;

import java.util.ArrayList;

public class ITECCourseManager {
    public static void main(String[] args) {
        ITECcourse maintenanceCourse = new ITECcourse();
        maintenanceCourse.name = "Microcomputer Systems Maintenance";
        maintenanceCourse.code = 1310;
        //ArrayList<String> maintenanceCourseStudentList = new ArrayList<>();
        maintenanceCourse.maxStudents = 20;

        maintenanceCourse.addStudents("John Smith");
        maintenanceCourse.addStudents("Jane Doe");
        maintenanceCourse.addStudents("Jane Smith");

        maintenanceCourse.writeCourseInfo();

        ITECcourse datacomCourse = new ITECcourse();
        datacomCourse.name = "Data Communications";
        datacomCourse.code = 1425;
        datacomCourse.maxStudents = 30;

        datacomCourse.addStudents("John Smih");
        datacomCourse.addStudents("Jne Doe");
        datacomCourse.addStudents("Jan Smith");

        datacomCourse.writeCourseInfo();


    }
}
