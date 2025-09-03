public class Magazine extends LibraryItem {
    public int issueNumber;

    public Magazine(String author, String title, int publicationYear, int issueNumber) {
        super(title, author, publicationYear);
        this.issueNumber = issueNumber;
    }


    public void flipPages() {
        System.out.println("Folheando páginas da revista " + getTitle());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Número de edição: " + this.issueNumber);
    }



}
