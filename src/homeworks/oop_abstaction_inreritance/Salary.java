package homeworks.oop_abstaction_inreritance;

public class Salary {

    public static int getSum(Employee[] employeeArray) {
        int sum = 0;
        for (int i = 0; i < employeeArray.length; i++){
            sum += employeeArray[i].getSalary();
    }
        return sum;
    }


}
