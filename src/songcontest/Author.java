package songcontest;

public class Author {
    private String name;
    private String major;
    private int startNumber;
    private int point;

    public Author(String name, String major, int startNumber) {
        this.name = name;
        this.major = major;
        this.startNumber = startNumber;
        this.point=0;
    }

    public String getName() {
        return name;
    }

    public String getMajor() {
        return major;
    }

    public int getStartNumber() {
        return startNumber;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }
}
