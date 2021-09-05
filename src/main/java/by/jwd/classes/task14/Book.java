package by.jwd.classes.task14;

public class Book implements Comparable<Book>{
    private String title;
    private String author;
    private int price;
    private static int edition;
    private Integer isbn;

    @Override
    public Object clone() throws CloneNotSupportedException {
        Book clone = (Book) super.clone();

        clone.title = this.title;
        clone.author = this.author;
        clone.price = this.price;
        return clone;
    }

    @Override
    public int compareTo(Book o) {
        int result = this.isbn.compareTo(o.isbn);
        return result;
    }
}