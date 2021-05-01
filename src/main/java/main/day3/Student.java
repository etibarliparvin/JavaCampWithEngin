package main.day3;

import java.util.Arrays;

public class Student extends User{

    private int[] courseId;

    public Student() {
    }

    public Student(int[] courseId) {
        this.courseId = courseId;
    }

    public Student(int id, String name, String surname, String email, String password, int[] courseId) {
        super(id, name, surname, email, password);
        this.courseId = courseId;
    }

    public int[] getCourseId() {
        return courseId;
    }

    public Student setCourseId(int[] courseId) {
        this.courseId = courseId;
        return this;
    }

    @Override
    public String toString() {
        return "Student{" +
                "courseId=" + Arrays.toString(courseId) +
                "} " + super.toString();
    }
}
