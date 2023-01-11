import football.Player;

public class Main {
    public static void main(String[] args) {

        Player player = new Player("Pista",222);
        player.edz(100);
        player.setPlay(true);
        player.setGoal(true);
        System.out.println("A fizu: "+player.getSalary());
    }
}