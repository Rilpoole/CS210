import java.util.ArrayList;

public class LibraryApp {
    public static void main(String[] args) {
        ArrayList<LibraryItem> items = new ArrayList<LibraryItem>();

        Book book = new Book("The C Programming Language", "K and R", 1988, "978-0131103627", "Programming Languages");
        items.add(book);

        Magazine magazine = new Magazine("MAD Magazine", "William Gaines", 1952, "0024-9319", 1);
        items.add(magazine);

        Dvd dvd = new Dvd("The Complete Monty Python's Flying Circus", "BBC", 1972, "B00004ZEU5", 1479);
        items.add(dvd);

        System.out.print("*** ITEMS ***\n\n");
        int cartID = 1;
        for (LibraryItem item : items) {
            System.out.printf("ITEM: %d/%d\n", cartID++, items.size());
            item.print();
            System.out.println();
        }
        System.out.print("*** *** ***\n");
    } 
}
