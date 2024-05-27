
    public abstract class Enemy {
        private String name;
        private int health;


        //parameters for the enemies including health, and name
        public Enemy(String name, int health) {
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
            return "Enemy{" +
                    "name='" + name + '\'' +
                    ", health=" + health +
                    '}';
        }
    }

