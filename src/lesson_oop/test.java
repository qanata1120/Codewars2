package lesson_oop;
/*public class test {

           /* public static void main(String[] args) {
                int a = 1;
                int b = 2;
                int c = 3;
                double d = 2.5;
                long e = 5;
                double result1 = d*a; //2.5
                long result2 = e/a; //5
                int result3 = b+c+2*b;
                double age = result1+result2+result3+d;
                int t = (int) age;    //19
                //double z = (double) t;
            String name = "Nata";
            String lastName = "lia";
            String interests = "nature, active leisure, traveling, learning and trying new things.";
            System.out.println(name +lastName + " " +"loves" + " " + interests);
            System.out.println("She is not " + t + " anymore.");
                System.out.println("\"To be, or not to be?\"" + " - " + "said Hamlet");
            }
        }*/
//     \n in the end of statement will start next statement from a new ln

/*public class HW7b_8 {
    public static void main(String[] args){
        oop.Person a = new oop.Person();
        String str = a.getName();
        System.out.println(str);

    }}*/

public class test {
        public static void main(String[] args){
            Pet petCat = new Pet();
            petCat.setName("Barsik");
            Pet petDog = new Pet();
            petDog.setName("Snoop");

            Person a = new Person();
            a.name = "Sergey";
            a.age = 30;
            a.setPet(petCat);
           // a.setSalary(100000); // red because its oop.Person, not Staff

            System.out.println(a.getName());
            Person b = new Person();
            b.name = "Anna";
            b.age = 28;
            b.setPet(petDog);

            System.out.println(a.name);
            System.out.println(a.age);
            System.out.println(a.age == b.age);

            System.out.println(b.getName());
        }}