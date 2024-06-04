public class Dvd extends LibraryItem {
    private int duration_min = 0;

    public Dvd(String title, String author, int year, String isbn, int duration_min) {
        super(title, author, year, isbn);
        this.duration_min = duration_min;
    }

    @Override
    public void print() {
        super.print();
        System.out.printf("Duration: %s\n", duration_min);
    }

    @Override
    public void checkOut() {
        System.out.println("DVD checked out");
    }

    @Override
    public void returnItem() {
        System.out.println("DVD returned");
    }

    public int getDuration_min() {
        return duration_min;
    }

    public void setDuration_min(int duration_min) {
        this.duration_min = duration_min;
    } 
}
