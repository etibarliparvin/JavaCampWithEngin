package main.day3;

public class StudentManager extends UserManager{

    public void completeCouser(Student student, int couserId){
        System.out.println("Your courser has been completed successfully: " + student.getId() + " " + student.getName() + " " + student.getSurname());
        System.out.println("Congratulations!");
    }
}
