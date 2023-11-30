public class Main {

    public static void main(String[] args) {
        System.out.println("Задание Объекты и классы");
        Author author1 = new Author("Джек", "Лондон");
        Author author2 = new Author("Стивен", "Кинг");
        Book book1 = new Book("Мартин Иден", author1, 1909);
        Book book2 = new Book("Бессонница", author2, 1994);
        System.out.println("Название книги: " + book1.getTitle());
        System.out.println("Автор: " + author1.getFirstName() + " " + author1.getLastName());
        System.out.println("Год издания: " + book1.getYearPublication());
        System.out.println("Название книги: " + book2.getTitle());
        System.out.println("Автор: " + author2.getFirstName() + " " + author2.getLastName());
        System.out.println("Год издания: " + book2.getYearPublication());
        book1.setYearPublication(2017);
        System.out.println("Год выпуска нового издания: " + book1.getYearPublication() + ". Книги: " + book1.getTitle());
    }
}