public class Book extends LibraryItem {
    private String genre;

    public Book(String title, String author, int year, String isbn, String genre) {
        super(title, author, year, isbn);
        this.genre = genre;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Genre: %s\n", genre);
    }

    @Override
    public void checkOut() {
        System.out.println("Book checked out");
    }

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
