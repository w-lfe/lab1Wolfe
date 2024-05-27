
    public class PowerUp {
        private String name;
        private String effect;

        public PowerUp(String name, String effect) {
            this.name = name;
            this.effect = effect;
        }

        // Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getEffect() {
            return effect;
        }

        public void setEffect(String effect) {
            this.effect = effect;
        }

        @Override
        public String toString() {
            return "PowerUp{" +
                    "name='" + name + '\'' +
                    ", effect='" + effect + '\'' +
                    '}';
        }
    }


