/*package homeworks;


/*Homework 5 STRING METHODS
Задача №1

Дана строка:
String s = “Перестановочный алгоритм быстрого действия”;
необходимо вывести все буквы “о” из этой строки.
Для указанной строки ответ будет “ооооо” (или в столбик)*/
/*
public class HW5_String_methods {
    public static void main(String[]args){
        String s = "Перестановочный алгоритм быстрого действия";
        for (int i = 0; i < s.length();i++){
            if (s.charAt(i) == 'о' ) {
                System.out.print("о ");   // в столбик System.out.println("о ");
            }
        }
    }
}
/*
Задача №2

Дана строка:
String s = “Перевыборы выбранного президента”;
необходимо подсчитать количество букв “е” в строке.
Для указанной строки ответ будет 4.*/
/*
public class HW5_String_methods {
    public static void main(String[]args){
        String s = "Перевыборы выбранного президента";
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'е' ) {
                count++;
            }
        }
        System.out.println(count);}
}*/

/*Задача №3

Дана строка:
String s = “Посмотрите как Рите нравится ритм”;
необходимо вывести индексы начала всех подстрок - “рит”, независимо от регистра.
Для указанной строки ответ будет 6, 15, 29.
*/

/*
public class HW5_String_methods {
    public static void main (String[] args) {
        String s = "Посмотрите как Рите нравится ритм";
        String s1 = s.toLowerCase();
       // int i = s1.toLowerCase().indexOf("рит");   55 and 56 lines are the same
        int i = s1.indexOf("рит");
        while (i != -1) {
            System.out.println(i);
           // i = s1.toLowerCase().indexOf("рит", i+1);  59 and 60 are the same
            i = s1.indexOf("рит", i+1);
        }
    }
}*/
//string = "Great responsibility"
/*

public class HW5_String_methods {

    public static String string(String string) {


        for (int i = 0; i < string.length(); i++) {
            for (int j =  i + 1; j < string.length(); j++) {
                if (string.charAt(i) == string.charAt(j)) {
                    j++;
                }
            }
        }
        return ;
    }
    public static void main(String[] args) {
        System.out.println(string("Great responsibility"));
    }
}*/
/*
    String str = "beautiful beach";
    char[] carray = str.toCharArray();
      System.out.println("The string is:" + str);
              System.out.print("Duplicate Characters in above string are: ");
              for (int i = 0; i < str.length(); i++) {
        for (int j = i + 1; j < str.length(); j++) {
        if (carray[i] == carray[j]) {
        System.out.print(carray[j] + " ");
        break;*/

/*
    String string1 = "Great responsibility";
    int count;

    //Converts given string into character array
    char string[] = string1.toCharArray();

        System.out.println("Duplicate characters in a given string: ");
                //Counts each character present in the string
                for(int i=0;i<string.length;i++){
        count=1;
        for(int j=i+1;j<string.length;j++){
        if(string[i]==string[j]&&string[i]!=' '){
        count++;
        //Set string[j] to 0 to avoid printing visited character
        string[j]='0';
        }
        }
        //A character is considered as duplicate if count is greater than 1
        if(count>1&&string[i]!='0')
        System.out.println(string[i]);
        }
        }
        }*/