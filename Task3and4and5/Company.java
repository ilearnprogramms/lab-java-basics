package amazon.learn.week2.arrayList.Task3and4and5;

import java.util.ArrayList;

public class Company {

    ArrayList<Employee> employees;

    public static void main(String[] args) {

        Company ironhack = new Company();
        ironhack.employees = new ArrayList<>();

        ironhack.employees.add(new Employee("Jack", "Catman", 32500, 30));
        ironhack.employees.add(new Employee("Mark", "Dogman", 34500, 30));
        ironhack.employees.add(new Employee("Jenny", "Mouseman", 45000, 40));
        ironhack.employees.add(new Employee("Celine", "Zebraman", 45000, 40));
        ironhack.employees.add(new Employee("Maria", "Rabbitman", 42500, 40));
        ironhack.employees.add(new Employee("Murasaki", "Snakeman", 32500, 30));
        ironhack.employees.add(new Intern("Joe", "Giraffeman", 15000, 10));
        ironhack.employees.add(new Intern("Ellie", "Lionman", 15000, 10));
        ironhack.employees.add(new Employee("Marco", "Tigerman", 32500, 30));
        ironhack.employees.add(new Employee("Saya", "Hamsteraman", 34500, 30));

        ironhack.employees.forEach(System.out::println);
        System.out.println();

        for (Employee emp : ironhack.employees) {
            if (emp instanceof Intern) {
                emp.setSalary(25000);
            }
        }
    }
}


