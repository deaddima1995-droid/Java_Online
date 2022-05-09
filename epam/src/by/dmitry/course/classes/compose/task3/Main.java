package by.dmitry.course.classes.compose.task3;

public class Main {

    public static void main(String[] args) {
        District minsk = new District(
                new City("Минск", new Region(100)),
                new City("Смолевичи", new Region(15)),
                new City("Фаниполь", new Region(10))
        );
        District brest = new District(
                new City("Брест", new Region(90)),
                new City("Барановичи", new Region(40))
        );
        District mogilev = new District(
                new City("Могилев", new Region(90)),
                new City("Бобруйск", new Region(50)),
                new City("Осиповичи", new Region(11))
        );

        Country belarus = new Country("Беларусь", minsk, brest, mogilev);

        System.out.println(belarus);
        System.out.println(belarus.getCapital());
        System.out.println(belarus.getCountDistrict());
        System.out.println(belarus.getCommonArea());
        System.out.println(belarus.getCentralCitiesFromDistricts());
    }
}
