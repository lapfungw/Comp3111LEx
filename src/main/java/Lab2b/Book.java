package Lab2b;

/*  COMP3111LEx\Lab2b\Book.java
    Book class for Lab2 Exercise 2 */
public class Book {
    private String chapters[];
    public static final int DEFAULT_CHAPTERS = 10;

    public Book() {
        chapters = new String[DEFAULT_CHAPTERS];
        for (int i = 0; i < chapters.length; i++) {
            chapters[i] = "n/a";
        }
    }
    public Book(String argument[]) {
        /* construct the object with an array of chapter names */
        /* PLEASE ADD YOUR CODE HERE */
        chapters = argument;
    }
    public String getChapter(int i) {
        return chapters[i];
    }
    public String[] getChapters() {
        return chapters;
    }
}
