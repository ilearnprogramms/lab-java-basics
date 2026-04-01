package amazon.learn.week2.arrayList.Task3and4and5;

public class Employee {

    private String name;
    private String lastName;
    private double workHours;
    private int salary;

    public Employee(String name, String lastName, int salary, double workHours) {
        this.name = name;
        this.salary = salary;
        this.workHours = workHours;
        this.lastName = lastName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public int setSalary(int salary) {
        this.salary = salary;
        return salary;
    }

    public double getWorkHours() {
        return workHours;
    }

    public void setWorkHours(double workHours) {
        this.workHours = workHours;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @Override
    public String toString() {
        return "Our Employee " + name + " " + lastName + " works " + workHours + " hours a week and has a salary of: " + salary + "$";
    }
}
