import java.util.ArrayList;
import java.util.List;

public class LibraryManagementSystem {
    public static void main(String[] args) {
        Book book = new Book("Jorge", "Biografia do Jorge 2", 1955, "Terror");
        Magazine magazine = new Magazine("Mauricio de Souza", "Turma da Mônica Jovem: Sexta Legal", 2000, 741);
        DigitalMedia midia = new DigitalMedia("MC GW", "Magia Astral", 2025, "mp3");

        List<LibraryItem> libraryItems = new ArrayList<>();
        libraryItems.add(book);
        libraryItems.add(magazine);
        libraryItems.add(midia);

        for (LibraryItem item : libraryItems) {
            item.displayInfo();
            item.borrow();
            item.returnItem();
            System.out.println("----------------------------------------");
        }

        for (LibraryItem item : libraryItems) {
            if (item instanceof Book) {
                book.readSample();
            } else if (item instanceof Magazine) {
                magazine.flipPages();
            } else if (item instanceof DigitalMedia) {
                midia.play();
            }
        }
    }
}
