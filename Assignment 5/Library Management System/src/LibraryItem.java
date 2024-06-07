public class LibraryItem {
    private String title = "";
    private String author = "";
    private int year = 0;
    private String isbn = "";

    public LibraryItem(String title, String author, int year, String isbn) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isbn = isbn;
    }

    /**
     * Prints the item details to the standard output
     */
    public void print() {
        System.out.printf("Title: %s\n", title);
        System.out.printf("Year: %s\n", year);
        System.out.printf("Author: %s\n", author);
        System.out.printf("ISBN: %s\n", isbn);
    }

    /**
     * Checks out the item
     */
    public void checkOut() {
        System.out.println("Item checked out");
    }

    /**
     * Returns the item
     */
    public void returnItem() {
        System.out.println("Item returned");
    }

    public String getAuthor() {
        return author;
    }

    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
