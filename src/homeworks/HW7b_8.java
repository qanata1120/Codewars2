package homeworks;


//Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
//
//The output should be two capital letters with a dot separating them.
//
//It should look like this:
//
//Sam Harris => S.H
//
//Patrick Feeney => P.F

/*public class HW7b_8 {

    public static String abbrevName(String name) {
// String str = "Hi Sergey";
//String[] arr = str.split("e");
//System.out.println(Arrays.toString(arr));
        String name1 = "";
        for (int i = 0; i < name.length(); i++) {
            name1 = name.charAt(0) + "." + name.charAt((name.indexOf(" ") + 1));
        }
        return name1.toUpperCase();
    }
    public static void main(String[] args) {
        System.out.println(abbrevName("Sam Harris"));
        System.out.println(abbrevName("Patrick Feenan"));
        System.out.println(abbrevName("Evan Cole"));
        System.out.println(abbrevName("P Favuzzi"));
        System.out.println(abbrevName("David Mendieta"));

    }
}*/

//All of the animals are having a feast! Each animal is bringing one dish. There is just one rule: the dish must start
//and end with the same letters as the animal's name. For example, the great blue heron is bringing garlic naan and the
//chickadee is bringing chocolate cake.
//Write a function feast that takes the animal's name and dish as arguments and returns true or false to indicate
//whether the beast is allowed to bring the dish to the feast.
///
//Assume that beast and dish are always lowercase strings, and that each has at least two letters. beast and dish may
//contain hyphens and spaces, but these will not appear at the beginning or end of the string. They will not contain numerals.

/*public class HW7b_8 {

    public static boolean feast(String beast, String dish) {
        return (beast.charAt(0) == dish.charAt(0) &&
                beast.charAt(beast.length() - 1) == dish.charAt(dish.length() - 1));

    }
    public static void main(String[] args) {

        System.out.println(feast("great blue heron","garlic nann"));
        System.out.println(feast("chickadee","chocolate cake"));
        System.out.println(feast("brown bear","bear claw"));

    }
}*/

//Triple Trouble
//Create a function that will return a string that combines all of the letters of the three inputed strings in groups.
//Taking the first letter of all of the inputs and grouping them next to each other. Do this for every letter, see example below!
////
// E.g. Input: "aa", "bb" , "cc" => Output: "abcabc"
//Note: You can expect all of the inputs to be the same length.

/*public class HW7b_8 {

    public static String tripleTrouble(String one, String two, String three) {

       String result = "";
       for ( int i = 0; i < one.length(); i++) {
        result += one.charAt(i);
        result += two.charAt(i);
        result += three.charAt(i);
          // or  result += "" + one.charAt(i) + two.charAt(i) + three.charAt(i);
       }
       return result;
    }

    public static void main(String[] args) {
        System.out.println(tripleTrouble("this", "test", "lock"));
        System.out.println(tripleTrouble("aa","bb","cc"));
        System.out.println(tripleTrouble("Bm", "aa", "tn"));
        System.out.println(tripleTrouble("LLh","euo","xtr"));
    }
}*/

//When provided with a letter, return its position in the alphabet.
//
//Input :: "a"
//
//Ouput :: "Position of alphabet: 1"
//
//This kata is meant for beginners. Rank and upvote to bring it out of beta

/*public class HW7b_8 {
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
    }*/
public class HW7b_8 {
    public static void main(String[]args) {
        int[] arr = {-6, -91, 1011, -100, 84, -22, 0, 1, 473};
        int max = 0;
        int[] arr2 = {};
        for (int i = 0; i < arr.length; i++)  {
            if (arr[i] > -10 && arr[i] < 10) {
                arr2[i] = new int[i];
                System.out.println(arr2[i]);
            }
        }
        int sum = 0;
        for (int i = 0; i < arr2.length; i++)  {
            sum += arr2[i];
            System.out.println(sum);
        }

    }}

