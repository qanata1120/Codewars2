package codewars.Arrays;

public class Task4 {
    //When provided with a letter, return its position in the alphabet.
//
//Input :: "a"
//
//Ouput :: "Position of alphabet: 1"
//
//This kata is meant for beginners. Rank and upvote to bring it out of beta


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
