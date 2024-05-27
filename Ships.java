/**

 * Project: LAB1
 * Purpose Details: RUN THE GAME
 * Course: IST 242
 * Author: KADIN WOLFE
 * Date Developed: 5/23/24
 * Last Date Changed:
 * Revision:

 */


class Player {

        private String name;
        private int health;


    public Player(String oakescruiser) {
    }

    public void Player(String name, int health) {
            this.name = name;
            this.health = health;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getHealth() {
            return health;
        }

        public void setHealth(int health) {
            this.health = health;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", health=" + health +
                    '}';
        }
    }


