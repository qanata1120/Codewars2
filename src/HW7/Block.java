package HW7;

public class Block {
    private int width;
    private int length;
    private int height;

    Block (int[] arr) {
        this.width = arr[0];
        this.length = arr[1];
        this.height = arr[2];
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getVolume(){
        return getWidth() * getLength() * getHeight();
    }
    public int getSurfaceArea() {
        return 2 * getWidth() * getLength() + 2 * getWidth() * getHeight() + 2 * getHeight() * getLength();
    }
}
