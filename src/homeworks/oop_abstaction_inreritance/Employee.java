package homeworks.oop_abstaction_inreritance;

public class Employee extends Person {
    int salary;

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }

    public boolean isSameName(Employee employee) {
        return getName().equals(employee.getName());
        }
    }

