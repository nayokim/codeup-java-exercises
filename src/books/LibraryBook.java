package books;

public class LibraryBook {

    //fields
    private String title;
    private String author;
    private int yearOfPublication;
    private String publisher;

    //constructor 1 - empty
    public LibraryBook() {
    }

    //constructor 2 - title and author
    public LibraryBook(String title, String author) {
        this.title = title;
        this.author = author;
    }

    //constructor 3 - title, author, publication
    public LibraryBook(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
    }

    //constructor 4 - title, author, year of pub, publisher
    public LibraryBook(String title, String author, int yearOfPublication, String publisher) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        this.publisher = publisher;
    }

    //method to get the title
    public String getTitle() {
        return title;
    }

    //method to assign the title
    public void setTitle(String title) {
        this.title = title;
    }

    //method to get the author
    public String getAuthor() {
        return author;
    }

    //method to set the author
    public void setAuthor(String author) {
        this.author = author;
    }

    //method to get the year of pub
    public int getYearOfPublication() {
        return yearOfPublication;
    }

    //method to set the year of pub
    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    //method to get the publisher
    public String getPublisher() {
        return publisher;
    }

    //method to set the publisher
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
}