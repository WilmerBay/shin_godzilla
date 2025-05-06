package Week3;

public class Book {

    private String title;
    private String author;
    private int pages;
    private int year;

    public Book(String title, String author, int pages, int year) {

        this.author = author;
        this.title = title;
        this.pages = pages;
        this.year = year;
    }

    public void describe() {
        System.out.println("This book is " + title + " written by " + author + " with " + pages + " pages." +
                " Written in the year " + year);
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public int getYear() {
        return year;
    }

}
