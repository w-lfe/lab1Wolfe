/**

 * Project: LAB1
 * Purpose Details: COMPILING AND RUNNING
 * Course: IST 242
 * Author: KADIN
 * Date Developed: 5/22
 * Last Date Changed:
 * Revision:

 */






    public class Game {
        private Player player;
        private Ship ship;

        public Game(Player player, Ship ship) {
            this.player = player;
            this.ship = ship;
        }

        //Getters and setters

        public Player getPlayer() {
            return player;
        }

        public void setPlayer(Player player) {
            this.player = player;
        }

        public Ship getShip() {
            return ship;
        }

        public void setShip(Ship ship) {
            this.ship = ship;
        }

        @Override
        public String toString() {
            return "Game{" +
                    "player=" + player +
                    ", ship=" + ship +
                    '}';
        }
// Getting parameters for player, ship, and enemy

        public static void main(String[] args) {
            Player player = new Player("Kadin");
            Ship ship = new Ship("OAKESCRUISER", 100, 200);
            Obstacle asteroid = new Asteroid(50, 50, 100);
            PowerUp powerUp = new PowerUp("Shield", "DEFENSE");
            Enemy alien = new Alien("MOTHERSHIP", 150);

            Game game = new Game(player, ship);

            System.out.println(game);
            System.out.println(asteroid);
            System.out.println(powerUp);
            System.out.println(alien);
        }
    }


