package homeworks.arrays;

public class Task11 {

        public static void main(String[] args) {
            String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j].contains("кто")) {
                        count++;
                    }
                }
            }
            System.out.println(count + " \"кто\" in the string");
        }
}
