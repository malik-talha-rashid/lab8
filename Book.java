package Lab8_Assignment1;

public class Book extends Publication{
    private int pageCount;

    public Book(String title, int price, int pageCount) {
        super(title,price);
        this.pageCount = pageCount;
    }

    public void setPageCount(int pC) {
        this.pageCount = pC;
    }

    public int getPageCount() {
        return this.pageCount;
    }

    public void display() {
        super.display();
        System.out.println("Page Count: " + this.getPageCount());
    }
}
}
