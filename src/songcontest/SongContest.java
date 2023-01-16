package songcontest;


import java.util.*;

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
        System.out.println("a nyertes: " + winner.getName() + " (" + winner.getPoint() + ")");
        System.out.println("--------------------csökkenó sorrend--------------------------------------------");
        Arrays.sort(registration.authors);
        registration.writeAuthors();
        try {
            Thread.sleep(2000L);
            searchAuthorByMajor();
        } catch (InterruptedException e) {
            System.out.println(e);
        }

    }

    private Author searchWinner() {
        Author winner = null;
        int max = 0;
        for (Author author : registration.authors) {
            if (author.getPoint() > max) {
                max = author.getPoint();
                winner = author;
            }
        }
        return winner;
    }

    private void searchAuthorByMajor() {
        ArrayList<Author> list = new ArrayList<>();
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Adja meg a kifejezést: ");
            String text = scanner.nextLine();
            for (Author author : registration.authors) {
                if (author.getMajor().equals(text)) {
                    list.add(author);
                }
            }
        } catch (NullPointerException e) {
            System.out.println(e.getMessage());
        }
        if(list.size()>0){
            System.out.println();
        for(Author a : list){
            System.out.println(a.getName()+" | "+a.getMajor());
        }
        }else {
            System.out.println();
            System.out.println("nincs találat");
        }
    }
}
