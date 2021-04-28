package main;

public class AllCourses extends Course {
    private int courseCount;

    public AllCourses() {
    }

    public AllCourses(int courseCount) {
        this.courseCount = courseCount;
    }

    public AllCourses(int id, String name, Double price, int courseCount) {
        super(id, name, price);
        this.courseCount = courseCount;
    }

    public int getCourseCount() {
        return courseCount;
    }

    public AllCourses setCourseCount(int courseCount) {
        this.courseCount = courseCount;
        return this;
    }
}
