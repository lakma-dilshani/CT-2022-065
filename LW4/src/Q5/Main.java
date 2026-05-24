package Q5;

import java.util.concurrent.Callable;

public class Main {
    public static void main(String[] args) {
        Lecturer lecturer = new Lecturer();
        lecturer.setLectureName("Dr.Amila Jeewandara");
        lecturer.setCourseTeaching("Project In Technology");

        Course course = new Course();
        course.setCourseName("Project in technology");
        course.setCourseCode("CTEC22061");
        course.setLecturer(lecturer);

        Student student = new Student();
        student.setStudentName("Hashini");
        student.setDegreeName("BICT");
        student.setCourseFollowing("Project in technology");

        System.out.println("Course Name:" + course.getCourseName());
        System.out.println("Course Code:" + course.getCourseCode());

        System.out.println("Lecturer Name:" + course.getLecturer().getLectureName());

        System.out.println("Student Name:" + student.getStudentName());
        System.out.println("Degree Name:" + student.getDegreeName());
        System.out.println("Course Following:" + student.getCourseFollowing());

    }
}
