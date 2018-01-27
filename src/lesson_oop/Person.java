package lesson_oop;

public class Person {

    /* public String getName() {
         return "Sergey";
     }
 }
 */
    Pet pet;

    public Person(Pet pet) {
        this.pet = pet;
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    String name;
    int age;

    public Person() {

    }

    String getName() {
        return name;
    }
    void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }
}
