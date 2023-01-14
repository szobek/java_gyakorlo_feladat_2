import olimpic.Registration;

import java.util.Random;

public class Game {


    public void start() {
        Random r = new Random();
        Registration registration = new Registration();
        try {
            Thread.sleep(2000L);
        } catch (InterruptedException e) {
            System.out.println("Hiba sleep közben");
        }
        int index = r.nextInt(registration.players.length);
        registration.players[index].setMedal(1);
        System.out.println("*********************************************************************************");
        registration.writePlayers();
    }
}
