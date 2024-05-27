/**

 * Project: LAB1
 * Purpose Details: RUN THE GAME
 * Course: IST 242
 * Author: KADIN WOLFE
 * Date Developed: 5/23/24
 * Last Date Changed:
 * Revision:

 */






public class Asteroid extends Obstacle {
        public Asteroid(int x, int y, int size) {
            super(x, y, size);
        }
// using the coordination between the asteroid class and obstacle class

        @Override
        public String toString() {
            return "Asteroid{" +
                    "x=" + getX() +
                    ", y=" + getY() +
                    ", size=" + getSize() +
                    '}';
        }
    }


