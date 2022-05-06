package by.dmitry.course.classes.object.task9;

public class Book {
    private final String name;
    private final String authors;
    private final String publishing;
    private final int year;
    private final int numberOfSheets;
    private double price;
    private final Binding typeOfBinding;

    public Book(String name, String authors, String publishing, int year, int numberOfSheets, double price, Binding typeOfBinding) {
        this.name = name;
        this.authors = authors;
        this.publishing = publishing;
        this.year = year;
        this.numberOfSheets = numberOfSheets;
        this.price = price;
        this.typeOfBinding = typeOfBinding;
    }

    public String getName() {
        return name;
    }

    public String getAuthors() {
        return authors;
    }

    public String getPublishing() {
        return publishing;
    }

    public int getYear() {
        return year;
    }

    public int getNumberOfSheets() {
        return numberOfSheets;
    }

    public double getPrice() {
        return price;
    }

    public Binding getTypeOfBinding() {
        return typeOfBinding;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authors='" + authors + '\'' +
                ", publishing='" + publishing + '\'' +
                ", year=" + year +
                ", numberOfSheets=" + numberOfSheets +
                ", price=" + price +
                ", typeOfBinding=" + typeOfBinding +
                "}\n";
    }
}
