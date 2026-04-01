package amazon.learn.week2.arrayList.Task3and4and5;

public class Intern extends Employee {

    public Intern(String name, String lastName, int salary, double workHours) {
        super(name, lastName, salary, workHours);
    }



    @Override
    public int getSalary() {
        return super.getSalary();
    }

    @Override
    public int setSalary(int salary) {
        if (salary > 0 && salary <= 20000) {
            super.setSalary(salary);
        } else {
            System.out.println("Please enter a valid salary. Intern salary cannot exceed 20,000.");
        }
        return salary;
    }

    @Override
    public String toString() {
        return "Our Intern " + getName() + " " + getLastName() + " works " + getWorkHours() + " hours a week and has a salary of: " + getSalary() + "$";
    }
}
