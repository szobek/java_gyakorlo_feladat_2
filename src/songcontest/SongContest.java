package songcontest;


import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Random;

public class SongContest {
        Registration registration = new Registration();
    public void start() {
        registration.writeAuthors();
        for (int i = 0; i < registration.authors.length; i++) {
            int point = new Random().nextInt(150);
            registration.authors[i].setPoint(point);
        }
        System.out.println("----------------------------------------------------------------");
        registration.writeAuthors();
        System.out.println("----------------------------------------------------------------");
        Author winner = searchWinner();
        System.out.println("a nyertes: "+winner.getName()+" (" +winner.getPoint()+")");
        System.out.println("----------------------------------------------------------------");
        Arrays.sort(registration.authors);
        registration.writeAuthors();
    }
    public Author searchWinner(){
        Author winner=null;
        int max=0;
        for (Author author: registration.authors){
            if(author.getPoint()>max){
                max=author.getPoint();
                winner=author;
            }
        }
        return winner;
    }
}
