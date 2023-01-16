package football;

import songcontest.Author;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Registration {
    private final String regFile = "D:\\project\\java\\gyakorlo_feladatok\\gyakorlo_feladat_2\\src\\football\\reg.txt";

    private final String DELIMITER = "[|]";

    public Player[] players;

    public Registration() {
        readFileFromTxt();
    }

    public void readFileFromTxt() {
        List<String> lines;

        try {
            lines = Files.readAllLines(Paths.get(regFile), StandardCharsets.UTF_8);
            players = new Player[lines.size()];
            createPlayers(lines);
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Hiba reg közben");

        }

    }

    private void createPlayers(List lines) {
        for (int i = 0; i < lines.size(); i++) {
            String all = lines.get(i).toString();
            String[] playerData = all.split(DELIMITER);
            players[i] = new Player(playerData[0], Integer.parseInt(playerData[1]), i + 1);
        }
for (Player player:players){
    System.out.println(player.getName());
}

    }
}
