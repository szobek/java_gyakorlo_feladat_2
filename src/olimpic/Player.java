package olimpic;

public class Player {
    private String name;
    private String sport;
    private Integer startNumber;
    private Integer medal;

    public Player(String name, String sport, Integer startNumber) {
        this.name = name;
        this.sport = sport;
        this.startNumber = startNumber;
        medal = 0;
    }

    public String getName() {
        return name;
    }

    public String getSport() {
        return sport;
    }

    public Integer getStartNumber() {
        return startNumber;
    }

    public Integer getMedal() {
        return medal;
    }

    public void setMedal(Integer medal) {
        this.medal = medal;
    }
}
