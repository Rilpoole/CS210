public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int year, String isbn, String genre) {
        super(title, author, year, isbn);
        this.genre = genre;
    }

    /**
     * Prints the book details to the standard output.
     */
    @Override
    public void print() {
        super.print();
        System.out.printf("Genre: %s\n", genre);
    }

    /**
     * Checks out the book.
     */
    @Override
    public void checkOut() {
        System.out.println("Book checked out");
    }

    /**
     * Returns the book.
     */
    @Override
    public void returnItem() {
        System.out.println("Book returned");
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }
}
