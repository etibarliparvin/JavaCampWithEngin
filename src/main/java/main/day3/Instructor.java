package main.day3;

public class Instructor extends User{

    private Double salary;

    public Instructor() {
    }

    public Instructor(Double salary) {
        this.salary = salary;
    }

    public Instructor(int id, String name, String surname, String email, String password, Double salary) {
        super(id, name, surname, email, password);
        this.salary = salary;
    }

    public Double getSalary() {
        return salary;
    }

    public Instructor setSalary(Double salary) {
        this.salary = salary;
        return this;
    }

    @Override
    public String toString() {
        return "Instructor{" +
                "salary=" + salary +
                "} " + super.toString();
    }
}
