package exercise2;

public class Book {
    String authorName, bookTitle;
    int publicationYear, copy; 
    double sellPrice;
    
    public Book(String authorName, String bookTitle, int publicationYear, int copy, double sellPrice) {
        this.authorName = authorName;
        this.bookTitle = bookTitle;
        this.publicationYear = publicationYear;
        this.copy = copy;
        this.sellPrice = sellPrice;
    }

    public Book(String authorName2, String bookTitle2 ) {
        this.authorName = authorName2;
        this.bookTitle = bookTitle2;
    }
    

    public Book(String bookTitle3) {
        this.bookTitle = bookTitle3;
    }
    

    void showBookInfo() {
        System.out.println("Author name: " + authorName);
        System.out.println("Book title: " + bookTitle);
        System.out.println("Publication year: " + publicationYear);
        System.out.println("Copy: " + copy);
        System.out.println("Sell price: " + sellPrice);
    }
}
