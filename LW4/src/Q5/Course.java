package Q5;

import javax.naming.Name;

public class Course {
    private String courseName;
    private String courseCode;

    private Lecturer lecturer;

    public String getCourseName(){
        return courseName;
    }
    public String getCourseCode(){
        return courseCode;
    }
    public Lecturer getLecturer(){
        return lecturer;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public void setLecturer(Lecturer lecturer) {
        this.lecturer = lecturer;
    }
}

