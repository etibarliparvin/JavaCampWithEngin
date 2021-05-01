package main.day3;

public class InstructorManager extends UserManager{

    public void addCourse(Instructor instructor){
        System.out.println("Courser has been added: " + instructor.getId() + " " + instructor.getName() + " " + instructor.getSurname());
    }
}
