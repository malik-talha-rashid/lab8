package Lab8_Assignment1;

public class Tape extends Publication{
    private int playTime;

    public Tape(String title, int price, int playTime) {
        super(title, price);
        this.playTime = playTime;
    }

    public void setPlayTime(int pT) {
        this.playTime = pT;
    }

    public int getPlayTime() {
        return this.playTime;
    }

    public void display() {
        super.display();
        System.out.println("Play Time: " + this.getPlayTime() + " minutes");
    }

}
