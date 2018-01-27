package homeworks.oop_abstaction_inreritance;

import javax.xml.namespace.QName;

public class Person {
    String name;
    int age;
    char gender;

    public String getName() {
        if (gender == 'F'){
            return "Mrs. " + name;
        } else {
            return "Mr. " + name;
        }
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }
}
