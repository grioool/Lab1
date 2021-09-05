package by.jwd.classes.task15;

import java.util.Comparator;

public class Book {

    private String title;
    private String author;
    private int price;
    private static int edition;

    public String getTitle() {
        return title;
    }

    public int getPrice() {
        return price;
    }

    public String getAuthor() {
        return author;
    }

    Comparator<Book> comparatorByTitle = Comparator.comparing(Book::getTitle);
    Comparator<Book> comparatorByTitleAndAuthor = comparatorByTitle.thenComparing(Book::getAuthor);
    Comparator<Book> comparatorByAuthorAndTitle = Comparator.comparing(Book::getAuthor).thenComparing(Book::getTitle);
    Comparator<Book> getComparatorByAuthorAndTitleAndPrice = comparatorByAuthorAndTitle.thenComparing(Book::getPrice);

}