package Lab8_Assignment1;

import java.io.PrintStream;

public class Publication {
    private String title;
    private int price;

    public Publication(String title, int price) {
        this.title = title;
        this.price = price;
    }

    public void setTitle(String t) {
        this.title = t;
    }

    public void setPrice(int p) {
        this.price = p;
    }

    public String getTitle() {
        return this.title;
    }

    public int getPrice() {
        return this.price;
    }

    public void display() {
        PrintStream var10000 = System.out;
        String var10001 = this.getTitle();
        var10000.println("\nBook title: " + var10001 + "\t\tPrice: " + this.getPrice());
    }
}

