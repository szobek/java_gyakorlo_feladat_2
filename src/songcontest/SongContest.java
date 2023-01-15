package songcontest;


import java.util.Random;

public class SongContest {
    public void start() {
        Registration registration = new Registration();
        registration.writeAuthors();
        for (int i = 0; i < registration.authors.length; i++) {
            int point = new Random().nextInt(50);
            registration.authors[i].setPoint(point);
        }
        registration.writeAuthors();
    }
}
