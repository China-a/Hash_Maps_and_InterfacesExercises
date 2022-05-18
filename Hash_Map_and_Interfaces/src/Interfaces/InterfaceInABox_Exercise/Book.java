package Interfaces.InterfaceInABox_Exercise;

public class Book implements Packable{
    @Override
    public Double weight() {
        return this.weight;
    }

    private String bookAuthor;
    private String bookTitle;
    private Double weight;

    public Book(String bookAuthor, String bookTitle, Double weight) {
        this.bookAuthor = bookAuthor;
        this.bookTitle = bookTitle;
        this.weight = weight;
    }

    public String getbookAuthor() {
        return bookAuthor;
    }

    public String getBookTitle() {
        return bookTitle;
    }
//    public Double getWeight() {
//        return weight;
//    }

    @Override
    public String toString() {
        return getbookAuthor() + ": " + getBookTitle();
    }
}
