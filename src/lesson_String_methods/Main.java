/*package homework5;

public class Main {
    public static void main (String[] args){
        String name = "Homework";
        String name1 = name.replace("H", "_");
            System.out.println(name1);
}}*\
/*
public class Main {
    public static void main (String[] args){
        String a = "";
        for (;a.length()<10;){
            a =a + "+";
        }
        System.out.println(a);
}}*\
 */
/*public class Main {
    public static void main (String[] args){
        String str = "Homework";
        char char1 = 'e';
        char char2 = '_';
        String result = str.replace(char1, char2);
        System.out.println(result);
        System.out.println(result.length());
}}
*\
 */
/*
public class Main {
    public static void main (String[] args){
        String str = "Homework";
        String result = str.replace('o', '_');
        System.out.println(result);
        System.out.println(result.length());
        System.out.println(result.indexOf('H'));
        System.out.println(result.indexOf('o'));
        System.out.println(result.indexOf('k'));
        System.out.println(result.indexOf('w'));
        System.out.println(result.indexOf('_'));
    }}*\

 */
/*
public class Main {
    public static void main (String[] args){
        String bank_acc = "123456789123456789";
        String new_bank_acc = bank_acc.replace('1', '2');
        System.out.println(new_bank_acc);
    }
    }
  */
/*
public class Main {
    public static void main (String[] args){
        String str = "Homework";
        String result = str.substring(4); //method substring returns part of the string from-to
        System.out.println(result);
        System.out.println(str.substring(0, 4));

    }}*/

/*public class Main {
    public static void main (String[] args){
        String str = "HomeWork";
        String result = str.toLowerCase();
        System.out.println(result);
        System.out.println(result.indexOf("w"));
        System.out.println(result.indexOf("work"));
    }}*/
/*
public class Main {
    public static void main (String[] args){
        String str = "Homework";
        System.out.print(str.charAt(6));

    }}
    */
/*public class Main {
    public static void main (String[] args){
        String str = "Homework";
        System.out.println(str.indexOf("m") != -1);  //mean we have letter 'm' in the string
    }}*//*
public class Main {
    public static void main (String[] args){
        String str = "Homework";
        int index = str.indexOf("m");
           if (index != -1) {
        //if (str.indexOf("m") != -1){  other option how to write
               System.out.println("letter is in the string with position " + index);
            } else {
                System.out.println("no letter in the string");
            }
            System.out.println(index == 0);  //checking which position letter has, first?
    }}*//*
public class Main {
    public static void main (String[] args){
        String str = "Homework";
        if (str.contains("work")) {
            System.out.println("string contains work at " + str.indexOf("w"));
        } else {
            System.out.println("string not contains work");
        }
    }
    }*/
/*
public class Main {
    public static void main (String[] args){
        String str = "Homework";
        System.out.println(str.contains("8"));  //output False or True
    }}*/
/*
public class Main {
    public static void main (String[] args){
        String str = "Homework";
        String result = str.substring(0, 4) + " " + str.substring(5);
        System.out.println(result);
    }}*/
/*
public class Main {
    public static void main (String[] args){
        String str = "Hello";
        for (int i = 0; i < str.length();i++) {
            System.out.println(str.charAt(i));
        }
    }
    }*/
    /*output:
H
e
l
l
o
     */
/*
public class Main {
    public static void main (String[] args) {
        String str = "Hello";
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'l') {
                count++;
            }
        }
        System.out.println(count);
    }}*/
/*
public class Main {
    public static void main (String[] args) {
    String str = "Hello";
    System.out.println(str.indexOf("ll"));   //output is a number of position of first letter
    }
}*/
/*
public class Main {
    public static void main (String[] args) {
    String str = "Hellollo";
    System.out.println(str.indexOf("l", 4));  //output:number of positin on lettere after 4th position
    }
}*/
/*
public class Main {
    public static void main (String[] args) {
        String str = "Hellolo";
        int i = str.indexOf("l");
        while (i != -1) {
            System.out.println(i);
            i = str.indexOf("l", i+1);
         }  //output indexes of "l" starting from the beginning of the string
    }
}*/
/*
public class Main {
    public static void main(String[] args) {
        String str = "Hellol";
        int i = str.lastIndexOf("l");
        while (i != -1) {
            System.out.println(i);
            i = str.lastIndexOf("l", i-1);
        }  //output indexes of "l" starting from the end of the string
    }
}*/