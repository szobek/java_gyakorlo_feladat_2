package songcontest;

import olimpic.Player;

import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class Registration {
    private final String regFile = "D:\\project\\java\\gyakorlo_feladatok\\gyakorlo_feladat_2\\src\\songcontest\\reg.txt";
    private final String DELIMITER = "[|]";
    public Author[] authors;


    public Registration() {
        readFileFromTxt();
    }

    public void readFileFromTxt() {
        List<String> lines;

        try {
            lines = Files.readAllLines(Paths.get(regFile), StandardCharsets.UTF_8);
            authors = new Author[lines.size()];
            createAuthor(lines);
        } catch (IOException e) {
            System.out.println(e);
            System.out.println("Hiba reg közben");

        }

    }

    private void createAuthor(List lines) {
        for (int i = 0; i < lines.size(); i++) {
            String all = lines.get(i).toString();
            String[] playerData = all.split(DELIMITER);
            authors[i] = new Author(playerData[0], playerData[1], i + 1);
        }


    }

    public void writeAuthors() {
        for (Author people : authors) {
            System.out.println("Név: " + people.getName() + " | szak: " + people.getMajor() + " | rajtszám: " + people.getStartNumber()+" | pont: "+people.getPoint());
        }
    }

}
