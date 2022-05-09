package by.dmitry.course.classes.compose.task3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Country {
    private final String name;
    private final District mainDistrict;
    private final Set<District> districts = new HashSet<>();
    private final int commonArea;

    public Country(String name, District mainDistrict, District... otherDistrict) {
        this.name = name;
        this.mainDistrict = mainDistrict;
        districts.addAll(Arrays.asList(otherDistrict));
        this.commonArea = mainDistrict.getDistrictArea() + getCommonAreaFromDistrict();
    }

    public String getCapital() {
        return mainDistrict.getMainCity().getName();
    }

    public int getCountDistrict() {
        return districts.size() + 1;
    }

    public String getCentralCitiesFromDistricts() {
        String out = "";
        out = out.concat(mainDistrict.getMainCity().getName() + " ");
        for (District district: districts) {
            out = out.concat(district.getMainCity().getName() + " ");
        }
        return out;
    }

    public String getName() {
        return name;
    }

    public District getMainDistrict() {
        return mainDistrict;
    }

    public Set<District> getDistricts() {
        return districts;
    }

    public int getCommonArea() {
        return commonArea;
    }

    private int getCommonAreaFromDistrict() {
        int out = 0;
        for (District district: districts) {
           out += district.getDistrictArea();
        }
        return out;
    }

    @Override
    public String toString() {
        return "Страна {" +
                "Название -'" + name + '\'' +
                ", \nСтолица -" + mainDistrict.getMainCity() +
                ", Общая площадь -" + commonArea +
                ", \nЦентральная область -" + mainDistrict +
                ", \nОстальные области -" + districts +
                '}';
    }
}
