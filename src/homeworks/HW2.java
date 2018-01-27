
    /*Задача №1

    Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
    a == b - если переменные равны
    a < b - если переменная a меньше b
    a > b - если переменная b меньше a
    */
 /*
 public class HW2 {
 public static void main(String[] args) {
        int a = 10;
        int b = 20;
        if (a == b) {
            System.out.println("a = b");
        } else {
            if (a < b) {
                System.out.println("a < b");
            } else {
                System.out.println("a > b");
            }
        }
    }
}*/

/*Задача №2

Необходимо создать две целочисленные переменные (a, b), присвоить произвольные значения переменным на ваш выбор и вывести следующие строки:
maybe a and b are even - если сумма переменных четная
some variable is odd - если сумма переменных нечетная
*/
 /*
 public class HW2 {
 public static void main(String[] args){
        int a = 100;
        int b = 53;
        if ((a + b)%2 == 0) {
            System.out.println("maybe a and b are even");
        } else {
            System.out.println("some variable is odd");
        }
    }
}*/


/*Задача №3

Необходимо создать целочисленную переменную, присвоить произвольное значение переменной на ваш выбор и вывести следующие строки:
больше 10 - если переменная больше 10
меньше 100 - если переменная меньше 100
результат деления на 2 больше 20 - если это соответствует истине
значение переменной между 5 и 40 включительно - если это правда
значение переменной меньше 5 или больше 40 - если предыдущие условие ложное
*/
/*
public class HW2 {
    public static void main(String[] args) {

        int a = 15;
        if (a > 10) {
            System.out.print("больше 10\n") ;
        }
        if (a < 100) {
            System.out.print("меньше 100\n");
        }
        if (a / 2 > 20) {
            System.out.println("результат деления на 2 больше 20\n");
        }
        if (a >= 5 && a <= 40) {
            System.out.println("значение переменной между 5 и 40 включительно\n");
        } else {
            System.out.println("значение переменной меньше 5 или больше 40");
         }
    }}*/
/*Задача №1

Необходимо вывести числа от 0 до 15.
*\


/*    public class HW2 {
public static void main(String[] args) {

        for (int i = 0; i <=15; i=i+1) {
            System.out.println(i);
        }
    }}*/

/*Задача №2

Необходимо вывести все положительные степени числа 5 которые меньше 10000 (результат возведения в степень меньше 10000).
*/
 /*  public class HW2 {
        public static void main(String[] args) {
        for (int i = 5; i<=10000; i = i * 5) {  //or for (int i = 1; i<=10000; i = i * 5), then output starts from 1
            System.out.println(i);
//System.out.print(i) if we want output in one line or System.out.println(i + " ")
// if you want output in one line with space in between
        }
    }*/

/*Задача №3

        Необходимо вывести все числа кратные 4 между числами 40 и 60 включительно.
        Реализовать 2 варианта:
        использовать конструкцию if для определения кратности (цикл с шагом 1, i = i + 1);
        без использования конструкции if (шаг цикла на ваше усмотрение).
*/
/*    1)
public static void main(String[]args) {
         for (int i = 40; i >= 40 && i <=60 ; i = i + 4) {
            System.out.println(i);
         }
     }}*/

/*     //2)*/


/*     public static void main(String[]args) {
         for (int i = 40; i >= 40 && i <= 60; i = i + 1) {
             if (i % 4 == 0) {
                 System.out.print(i + " ");
             }
         }
     } }*/

 /*Task 1*
// Create a variable using digits from 0 to 5. It can be positive or negative. Practice with String and int types.
// Write a program to find if :
// It’s a 1-digit number
// It's a 2-digit number
// It's a 3-digit number
// It's a 4-digit number
// It's a 5-digit number
// The number is not between 1 & 99999 Use IF and ELSE statements.
// Don’t forget about the negative numbers! */

/*
 public class HW2 {
    public static void main(String[] args) {
        int i = 1_235_414_512;
        int b = -1234512211;
        String a = "1245314555411332451";
        if (!(i >=1 && i <= 99999)) {    //The number is not between 1 & 99999
        System.out.println(i + " is not between 1 & 99999");
         }
         if (b <= 1 || b >= 99999) {
       System.out.println(b + " is not between 1 & 99999");
   }
  // if (a <= "1" && a >= "99999");
    }}*/



    /*Task 2*
Write a program to find if the use largest Number of three number print out System.out.println("Largest number is "+largestNumber);
Must be used if then an else if find lastly else

Task 3*Create a program print only even numbers from 1 to 20 must be used while loops

Task 4
Create a program for print numbers from 10 to 1


Task 5*
Create a program to find a solution, initially find a solution on paper.
a=100; x=12; d=12; c=122;
zz1 = a == d;
zz2 = x == d;
zz3 = c >= a;
zz4 = x >= d;
zz5 = (d == c) || (x == d);
zz6 = (c > x) && (d >= x);
zz7 = (a > x) || (a > c);
zz8 = (a == c) && (d == c);
zz9 = (c == c) && (a >= a);
zz10 = (c > c) || (a <= a);
zz11 = (x > a) && (c == d);

zz12 = (c > a) && (x > d);


    public static void main(String[]args) {
    int a=100;
    int x=12;
    int d=12;
    int c=122;
    zz1 = a == d;
zz2 = x == d;
zz3 = c >= a;
zz4 = x >= d;
zz5 = (d == c) || (x == d);
zz6 = (c > x) && (d >= x);
zz7 = (a > x) || (a > c);
zz8 = (a == c) && (d == c);
zz9 = (c == c) && (a >= a);
zz10 = (c > c) || (a <= a);
zz11 = (x > a) && (c == d);

zz12 = (c > a) && (x > d);
  */

