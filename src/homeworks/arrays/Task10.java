package homeworks.arrays;

public class Task10 {

        public static void main(String[] args) {
            String[][] array = {{"Привет", "всем", "кто"}, {"изучает", "язык", "программирования"}, {"java"}};
            int count = 0;

            for (int i = 0; i < array.length; i++) {
                for (int j = 0; j < array[i].length; j++) {
                    if (array[i][j].indexOf("е") == -1) {
                        count++;
                    }
                }
            }
            System.out.println(count);
        }

}
