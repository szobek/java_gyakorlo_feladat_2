package football;

public class Player {
    private String name;
    private int regNum;

    private int goal;
    private boolean play;
    private int match;
    private int salary;
    private Long training;
    private final int baseSalary=200_000;

    public Player(String name, int regNum) {
        this.name = name;
        this.regNum = regNum;

        match=0;
        training=0L;
    }

    public void edz(int workoutTime){
        training+=workoutTime+1000;
    }

    public void playGame(){
        if(play)
            match++;
    }

    public void countSalary(){
        salary=baseSalary+(goal*10_000)+((training.intValue()/1000)*2000);
    }

    public void setGoal(boolean kick) {
        if(kick)
            goal++;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }

    public void setMatch(int match) {
        this.match = match;
    }

    public int getSalary() {
        countSalary();
        return salary;
    }

}
