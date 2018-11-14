package XO;

public class Player {
    private String name;
    private Mark mark;

    public Player(String name, Mark mark) {
        this.name = name;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public Mark getMark() {
        return mark;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMark(Mark mark) {
        this.mark = mark;
    }
}
