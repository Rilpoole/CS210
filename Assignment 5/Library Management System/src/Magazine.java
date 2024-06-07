public class Magazine extends LibraryItem {
    private int issueNumber = 0;

    public Magazine(String title, String author, int year, String isbn, int issueNumber) {
        super(title, author, year, isbn);
        this.issueNumber = issueNumber;
    }

    /**
     * Pritns the magazine details
     */
    @Override
    public void print() {
        super.print();
        System.out.printf("IssueNumber: %s\n", issueNumber);
    }

    /**
     * Checks out the magazine
     */
    @Override
    public void checkOut() {
        System.out.println("Magazine checked out");
    }

    /**
     * Returns the item
     */
    @Override
    public void returnItem() {
        System.out.println("Magazine returned");
    }

    public int getIssueNumber() {
        return issueNumber;
    }

    public void setIssueNumber(int issueNumber) {
        this.issueNumber = issueNumber;
    }
}
