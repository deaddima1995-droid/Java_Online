package by.dmitry.course.classes.object.task9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Library {
    private final List<Book> library = new ArrayList<>();

    public void addToLibrary(Book book) {
        library.add(book);
    }

    public void addToLibrary(Book... books) {
        Collections.addAll(library, books);
    }

    public void deleteBook(Book book) {
        library.remove(book);
    }

    public void clearLibrary() {
        library.clear();
    }

    public List<Book> getBookListFromAuthor(String author) {
        return new ArrayList<>(library.stream().filter(book -> book.getAuthors().equals(author)).toList());
    }

    public List<Book> getBookListFromPublishing(String publishing) {
        return new ArrayList<>(library.stream().filter(book -> book.getPublishing().equals(publishing)).toList());
    }

    public List<Book> getBookListAfterYear(int year) {
        return new ArrayList<>(library.stream().filter(book -> book.getYear() >= year).toList());
    }

    @Override
    public String toString() {
        return "Library{" +
                "library=" + library +
                '}';
    }
}
