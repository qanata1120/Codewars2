package homeworks.hashset;

import java.util.HashSet;
import java.util.Set;

public class TwoStringsSameLetters {
    //Дано две строки. Нужно вывести true если все символы из второй строки присутствуют в первой.
    //
    //Например,  строка 1 "tan", строка 2 "ant" - будет true.
    //Второй пример: 1 "day", 2 "may" - будет false.
    //Третий пример: 1 "tenth", 2 "ent" - будет true.

    public static boolean checkChars(String first, String second){
       if (first.length() < second.length()) {
           String temp = first;
           first = second;
           second = temp;
       }
        Set<Character> abc = new HashSet<>();
       for (int i = 0; i < first.length(); i++) {
           abc.add(first.charAt(i));
       }
        for (int i = 0; i < second.length(); i++){
            if(!abc.contains(second.charAt(i))){
                return false;
            }
        }
        return true;
    }

    public static void main (String[] args){
        System.out.println(checkChars("tan", "man"));
        System.out.println(checkChars("tan", "ant"));
        System.out.println(checkChars("then", "man"));
        System.out.println(checkChars("tan", "tanning"));
        System.out.println(checkChars("123", "321"));
        System.out.println(checkChars("1234", "12"));
        System.out.println(checkChars("12", "1234"));
        System.out.println(checkChars("12", "342"));
    }
}
