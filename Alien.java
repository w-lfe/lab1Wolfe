/**

 * Project: LAB1
 * Purpose Details: RUN THE GAME
 * Course: IST 242
 * Author: KADIN WOLFE
 * Date Developed: 5/22/24
 * Last Date Changed:
 * Revision:

 */




    public class Alien extends Enemy {
        public Alien(String name, int health) {
            super(name, health);
        }

        @Override
        public String toString() {
            return "Alien{" +
                    "name='" + getName() + '\'' +
                    ", health=" + getHealth() +
                    '}';
        }
    }

