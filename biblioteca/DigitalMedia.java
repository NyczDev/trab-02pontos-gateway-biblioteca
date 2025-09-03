public class DigitalMedia extends LibraryItem {
    public String fileFormat;

    public DigitalMedia(String author, String title, int publicationYear, String fileFormat) {
        super(title, author, publicationYear);
        this.fileFormat = fileFormat;
    }


    public void play() {
        System.out.println("Reproduzindo a mídia " + getTitle());
    }

    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Formato de Arquivo: " + this.fileFormat);
    }



}
