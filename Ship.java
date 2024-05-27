/**

 * Project: LAB1
 * Purpose Details: SHIP DEFINITION
 * Course: IST 242
 * Author: KADIN
 * Date Developed: 5/24
 * Last Date Changed:
 * Revision:

 */




// Defining fuel, name, and health

    public class Ship {
        private String name;
        private int health;
        private int fuel;

        public Ship(String name, int health, int fuel) {
            this.name = name;
            this.health = health;
            this.fuel = fuel;
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

        public int getFuel() {
            return fuel;
        }

        public void setFuel(int fuel) {
            this.fuel = fuel;
        }

        @Override
        public String toString() {
            return "Ship{" +
                    "name='" + name + '\'' +
                    ", health=" + health +
                    ", fuel=" + fuel +
                    '}';
        }
    }


