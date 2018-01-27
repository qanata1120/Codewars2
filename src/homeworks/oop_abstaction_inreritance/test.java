package homeworks.oop_abstaction_inreritance;

import org.w3c.dom.ls.LSOutput;

import static homeworks.oop_abstaction_inreritance.Salary.getSum;

//Задача №1
//
//Необходимо создать класс Person с полями: имя, возраст, пол. Класс должен иметь метод - getName, метод возвращает
//имя с префиксом “Mr. ” если пол указан как мужской и префикс “Mrs. ” если женский.
/*public class test {
    public static void main(String[] args){
    Person a = new Person();
    a.name = "Nata";
    a.age = 23;
    a.gender = 'f';
    System.out.println(a.getName());

    Person b = new Person();
    b.name = "Grigoriy";
    b.age = 65;
    b.gender = 'm';
        System.out.println(b.getName());

}}*/

//Задача №2
//
//Необходимо создать класс Employee с полями: Person (из предыдущего задания), зарплата. Класс должен иметь метод
//isSameName(Employee employee) который возвращает true, если у сотрудника у которого был вызван метод и сотрудника
//который был передан как параметр, одинаковое имя.

/*public class test {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.name = "Vahi";

        Employee b = new Employee();
        b.name = "Vahi";

        Employee c = new Employee();
        c.name = "Vahtang";

        System.out.println(a.isSameName(b));
        System.out.println(b.isSameName(c));
        System.out.println(c.isSameName(a));

    }
}*/

//Задача №3
//
//Необходимо создать класс Salary с единственным методом - getSum(Employee[] employeeArray), метод должен возвращать
//сумму зарплат всех сотрудников из массива переданного в качестве параметра вызова метода.

public class test {
    public static void main(String[] agrs) {

        Employee a = new Employee();
        a.setSalary(1000);

        Employee b = new Employee();
        b.setSalary(2000);


        Employee c = new Employee();
        c.setSalary(3000);

        Employee[] arr = {a, b,c};
        System.out.println(Salary.getSum(arr));
    }
}