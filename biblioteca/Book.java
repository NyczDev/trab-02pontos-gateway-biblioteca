public class Book extends LibraryItem {
    public String genre;

    public Book(String author, String title, int publicationYear, String genre) {
        super(title, author, publicationYear);
        this.genre = genre;
    }


    public void readSample() {
        System.out.println("Amostra do livro " + getTitle() + " lida.");
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Gênero: " + this.genre);
    }



}
