package by.dmitry.course.classes.compose.task3;

import java.util.*;

public class District {
    private final City mainCity;
    private final Set<City> otherCity = new HashSet<>();
    private final int districtArea;

    public District(City centerOfDistrict, City... cities) {
        this.mainCity = centerOfDistrict;
        otherCity.addAll(Arrays.asList(cities));
        this.districtArea = mainCity.getArea() + getAreaFromOtherCities();
    }

    public City getMainCity() {
        return mainCity;
    }

    public Set<City> getOtherCity() {
        return otherCity;
    }

    public int getDistrictArea() {
        return districtArea;
    }

    private int getAreaFromOtherCities() {
        int out = 0;
        for (City city : otherCity) {
            out += city.getArea();
        }
        return out;
    }

    @Override
    public String toString() {
        return "\nОбласть {" +
                "\n\tОбластной центр -" + mainCity +
                ", \n\tдругие города -" + otherCity +
                ", площадь области -" + districtArea +
                '}';
    }
}
