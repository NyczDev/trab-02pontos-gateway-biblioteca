public abstract class LibraryItem implements Borrowable {
    public String title;
    public String author;
    public int publicationYear;
    public boolean isBorrowed;

    public LibraryItem(String title, String author, int publicationYear) { 
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
        this.isBorrowed = false;
    }

    public void displayInfo() {
        System.out.println("Título: " + this.title);
        System.out.println("Autor: " + this.author);
        System.out.println("Ano de Publicação: " + this.publicationYear);
        System.out.println("Status: " + (isBorrowed ? "Emprestado" : "Disponível"));
    }

    @Override
    public void borrow() {
        if (!isBorrowed) {
            this.isBorrowed = true;
            System.out.println("O item '" + this.title + "' foi emprestado com sucesso.");
        }
        else {
            System.out.println("O item '" + this.title + "' não está disponível, pois já foi emprestado.");
        }
    }


    @Override
    public void returnItem() {
        if (isBorrowed) {
            this.isBorrowed = false;
            System.out.println("O item '" + this.title + "' foi devolvido com sucesso.");
        } else {
            System.out.println("O item '" + this.title + "' já está disponível na biblioteca.");
        }
    }

    public String getTitle() {
        return title;
    }

}


