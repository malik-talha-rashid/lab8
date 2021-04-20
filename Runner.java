package Lab8_Assignment1;

import java.util.Scanner;

public class Runner {
    public Runner() {
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Book b1 = new Book("A", 1, 1);
        Tape t1 = new Tape("B", 1, 1);
        System.out.println("\nEnter the name of the book: ");
        String bt = input.nextLine();
        b1.setTitle(bt);
        System.out.println("Enter the price of the book: ");
        b1.setPrice(input.nextInt());
        System.out.println("Enter the number of pages in the book: ");
        b1.setPageCount(input.nextInt());
        System.out.println("\nEnter the name of the audio book: ");
        String abt = input2.nextLine();
        t1.setTitle(abt);
        System.out.println("Enter the price of the audio book: ");
        t1.setPrice(input.nextInt());
        System.out.println("Enter the play time the audio book: ");
        t1.setPlayTime(input.nextInt());
        b1.display();
        t1.display();
    }

}
