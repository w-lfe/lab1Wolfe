/**

 * Project: LAB1
 * Purpose Details: OBSTACLE
 * Course: IST 242
 * Author: KADIN
 * Date Developed: 5/24
 * Last Date Changed:
 * Revision:

 */





public abstract class Obstacle {
    private int x;
    private int y;
    private int size;

    //Paramaters and dimenstions of obstacles

    public Obstacle(int x, int y, int size) {
        this.x = x;
        this.y = y;
        this.size = size;
    }

    // Getters and Setters
    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Obstacle{" +
                "x=" + x +
                ", y=" + y +
                ", size=" + size +
                '}';
    }
}

