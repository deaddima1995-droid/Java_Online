package by.dmitry.course.classes.compose.task3;

public class City {
    private final String name;
    private final int area;

    public City(String name, Region region) {
        this.name = name;
        this.area = region.getArea();
    }

    public String getName() {
        return name;
    }

    public int getArea() {
        return area;
    }

    @Override
    public String toString() {
        return "Город {" +
                name + '\'' +
                ",Площадь район -" + area +
                '}';
    }
}
