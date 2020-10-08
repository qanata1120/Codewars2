package codewars.Arrays;

public class Task4_LetterPositionInAlphabet {

//When provided with a letter, return its position in the alphabet.
//
//Input :: "a"
//
//Ouput :: "Position of alphabet: 1"


    public static String position(char alphabet) {

        for (int i = 'a'; i < 'z'; i++){
            return "Position of alphabet: " + (alphabet - 'a' + 1); //or return "Position of alphabet: " + ((int) alphabet - 96);
        }                                                         //or  return "Position of alphabet: " + (alphabet-'a'+1);
        return "";
    }

    public static void main(String[] args) {
        System.out.println(position('a'));
        System.out.println(position('z'));
        System.out.println(position('e'));
    }
}
