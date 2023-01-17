package football;


import java.util.Random;

public class Football {
    public void start(){
    Registration registration = new Registration();
        int randomIndex= new Random().nextInt(registration.players.length);
    registration.players[randomIndex].setPlay(true);
    registration.players[randomIndex].setGoal();
    registration.players[randomIndex].setGoal();
    int salary=registration.players[randomIndex].countSalary();
        System.out.println(registration.players[randomIndex].getName()+" fizuja: "+salary+" gólok: "+registration.players[randomIndex].getGoal());
    }
}
