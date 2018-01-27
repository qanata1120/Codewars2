package homeworks.oop_incapsulation_polymorphism;
//Tasks#D
//Задача №1
//
//Необходимо создать класс Employee со следующими методами:
//getBaseSalary - получить базовую ставку
//setBaseSalary
//getName - получить имя
//setName
//getSalary - получить зарплату
/*public class Test {
    public static void main(String[] args) {
        Employee a = new Employee();
        a.setName("Devin");
        a.setBaseSalary(5000);

        int salaryKoeficient = 10;
        System.out.println(a.getSalary(5000, 10));



    }

}????*/
//Задача №2
//
//Необходимо создать класс Worker где метод getSalary будет возвращать базовую ставку.
//
//Необходимо создать класс Manager в который нужно добавить следующие методы:
//getNumberOfSubordinates - получить количество подчиненных
//setNumberOfSubordinates
//
// в классе, метод getSalary будет возвращать значение по формуле -
// <базовая ставка> * (<количество подчиненных> / 100 * 3). Если количество подчиненных 0, то результат как у обычного рабочего.
//Необходимо создать класс Director с теми же методами, что и Manager, но метод getSalary должен возвращать результат
//по формуле - <базовая ставка> * (<количество подчиненных> / 100 * 9). Если количество подчиненных 0, то результат как у обычного рабочего.
//Для всех классов из этой задачи должен быть переопределен базовый метод equals, чтобы можно было сравнивать объекты этих классов.