package homeworks.startCode;

public class Tas10Boolean {

    //https://www.codewars.com/kata/55f8a9c06c018a0d6e000132/train/java
    //regex validate pin code
    //ATM machines allow 4 or 6 digit PIN codes and PIN codes cannot contain anything
    // but exactly 4 digits or exactly 6 digits.
    //
    //If the function is passed a valid PIN string, return true, else return false.
    //
    //Examples
    //"1234"   -->  true
    //"12345"  -->  false
    //"a234"   -->  false

    public static boolean validatePin(String pin) {
        if (pin == null || pin.length() != 4 && pin.length() != 6) {
            return false;
        }
        for (int i = 0; i < pin.length(); i++) {
            if (!Character.isDigit(pin.charAt(i))) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        //validPins
        System.out.println(validatePin("1234"));
        System.out.println(validatePin("0000"));
        System.out.println(validatePin("1111"));
        System.out.println(validatePin("123456"));
        System.out.println(validatePin("098765"));
        System.out.println(validatePin("000000"));
        System.out.println(validatePin("090909"));


        //nonDigitCharacters
        System.out.println(validatePin("a234"));
        System.out.println(validatePin(".234"));

        //invalidLengths
        System.out.println(validatePin("1"));
        System.out.println(validatePin("12"));
        System.out.println(validatePin("123"));
        System.out.println(validatePin("12345"));
        System.out.println(validatePin("1234567"));
        System.out.println(validatePin("-1234"));
        System.out.println(validatePin("1.234"));
        System.out.println(validatePin("00000000"));
    }
}

