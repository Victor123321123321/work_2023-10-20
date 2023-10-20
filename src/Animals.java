
public class Animals {
    protected int speed;
    private String name;
    public void setName(String NewName) {
        this.name = NewName;
    }
    public void setSpeed(int NewSpeed) {
        this.speed = NewSpeed;
    }

    public String getName() {
        return this.name;
    }
    public int getSpeed() {
        return this.speed;
    }

    public String getName(String str) {
        return str + " " + this.name;
    }
}
