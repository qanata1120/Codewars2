package HW7;

//https://www.codewars.com/kata/playing-with-cubes-i/train/java
//Create a public class called Cube without a constructor which gets one single private integer variable Side,
//a getter GetSide() and a setter SetSide(int num) method for this property. Actually, getter and setter methods are
//not the common way to write this code in C#. In the next kata of this series, we gonna refactor the code and make
//it a bit more professional...
//There's no need to check for negative values!
//initialise the side to 0.
/*public class test {
    public static void main(String[] args) {

        Cube block1 = new Cube();
        block1.setSide(2);

        Cube block2 = new Cube();
        block2.setSide(0);
    }
}*/

//https://www.codewars.com/kata/building-blocks/train/java
//Write a class Block that creates a block (Duh..)
//
//##Requirements
//
//The constructor should take an array as an argument, this will contain 3 integers of the form
//[width, length, height] from which the Block should be created.
//Define these methods:
//
//`getWidth()` return the width of the `Block`
//
//`getLength()` return the length of the `Block`
//
//`getHeight()` return the height of the `Block`
//
//`getVolume()` return the volume of the `Block`
//
//`getSurfaceArea()` return the surface area of the `Block`
//##Examples
//
//    Block b = new Block(new int[]{2,4,6}) -> creates a `Block` object with a width of `2` a length of `4` and a height of `6`
//    b.getWidth() // -> 2
//
//    b.getLength() // -> 4
//
//    b.getHeight() // -> 6
//
//    b.getVolume() // -> 48
//
//    b.getSurfaceArea() // -> 88
//Note: no error checking is needed

public class test {
    public static void main(String[] args) {
        Block b = new Block(new int[]{2,4,6});
        System.out.println(b.getVolume());
        System.out.println(b.getSurfaceArea());
    }
}
