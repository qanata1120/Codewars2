package lesson_oop;

public class Staff extends Person {
    int salary;

    public Staff(Pet pet) {
        super(pet);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
