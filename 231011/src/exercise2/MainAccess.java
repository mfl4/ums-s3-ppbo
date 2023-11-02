package exercise2;

public class MainAccess {
    public static void main(String[] args) {
        Book book = new Book("John", "Java", 2019, 1, 30000);
        Book book2 = new Book("John", "Java");
        Book book3 = new Book("Java");
        Book book4 = new Book("John", "Javasd");
        Book book5 = new Book("John", "Java", 2019, 1, 30000);
        Book book6 = new Book("test");
        Book book7 = new Book("John", "Java", 2019, 1, 30000);
        Book book8 = new Book("John", "Java", 2019, 1, 30000);
        Book book9 = new Book("John", "Java", 2019, 1, 30000);
        Book book10 = new Book("John", "Java", 2019, 1, 30000);
        book.showBookInfo();
        book2.showBookInfo();
        book3.showBookInfo();
        book4.showBookInfo();
        book5.showBookInfo();
        book6.showBookInfo();
        book7.showBookInfo();
        book8.showBookInfo();
        book9.showBookInfo();
        book10.showBookInfo();
    }
}
