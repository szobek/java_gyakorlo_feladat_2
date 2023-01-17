package football;

public class Player {
    private String name;
    private int playNum;
    private int regNum;

    private int goal=0;
    private boolean play;

    private final int baseSalary=200_000;

    private int training=0;

    public Player(String name, int playNum, int regNum) {
        this.name = name;
        this.regNum = regNum;
        this.playNum = playNum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPlayNum() {
        return playNum;
    }

    public void setPlayNum(int playNum) {
        this.playNum = playNum;
    }

    public int getRegNum() {
        return regNum;
    }

    public void setRegNum(int regNum) {
        this.regNum = regNum;
    }

    public int getGoal() {
        return goal;
    }

    public void setGoal() {
        this.goal++;
    }

    public boolean isPlay() {
        return play;
    }

    public void setPlay(boolean play) {
        this.play = play;
    }
    public void edz(int trainingPlayer){
        training+=trainingPlayer;
    }

    /**
     * Ha játszik, akkor növelhetem a gól számot
     *
      **/
    public void goltRug(){
        if(play){
            goal++;
        }
    }
    public int countSalary(){
        return baseSalary+(training*520)+(goal*20_000);
    }
}
