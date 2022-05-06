package by.dmitry.course.classes.object.task9;

public class Main {

    public static void main(String[] args) {
        Library library = new Library();
        Book[] books = {
                new Book("1984", "Джордж Оруэлл", "АСТ", 2019, 320, 18.10, Binding.HARDCOVER),
                new Book("Гарри Поттер и философский камень", "Джоан Роулинг", "Махаон", 2016, 432, 28.82, Binding.HARDCOVER),
                new Book("1984. Скотный двор", "Джордж Оруэлл", "АСТ", 2017, 368, 16.80, Binding.SOFTCOVER),
                new Book("Гарри Поттер и Тайная комната", "Джоан Роулинг", "Махаон", 2019, 480, 28.82, Binding.HARDCOVER),
                new Book("Дюна", "Фрэнк Герберт", "АСТ", 2021, 704, 31.58, Binding.SOFTCOVER)
        };
        library.addToLibrary(books);
        System.out.println(library);
        System.out.println(library.getBookListFromAuthor("Джордж Оруэлл") + "\n");
        System.out.println(library.getBookListFromPublishing("АСТ") + "\n");
        System.out.println(library.getBookListAfterYear(2019) + "\n");
    }
}
