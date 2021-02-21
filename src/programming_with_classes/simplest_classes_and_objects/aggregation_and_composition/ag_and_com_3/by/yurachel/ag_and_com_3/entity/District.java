package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_3.by.yurachel.ag_and_com_3.entity;

import java.util.ArrayList;
import java.util.List;

public class District {
    private String districtName;
    private City districtCenterName;
    private double districtSquare;
    private List<City> citiesInThisDistrict;

    {
        citiesInThisDistrict = new ArrayList<>();
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City getDistrictCenterName() {
        return districtCenterName;
    }

    public void setDistrictCenterName(City districtCenterName) {
        this.districtCenterName = districtCenterName;
    }

    public double getDistrictSquare() {
        return districtSquare;
    }

    public void setDistrictSquare(double districtSquare) {
        this.districtSquare = districtSquare;
    }

    public List<City> getCitiesInThisDistrict() {
        return citiesInThisDistrict;
    }

    public void setCitiesInThisDistrict(List<City> citiesInThisDistrict) {
        this.citiesInThisDistrict = citiesInThisDistrict;
    }

    public District(String districtName, City districtCenterName, double districtSquare) {
        this.districtName = districtName;
        this.districtCenterName = districtCenterName;
        this.districtSquare = districtSquare;
    }

    // Добавляем город в район.

    public void addCity(String cityName) {
        citiesInThisDistrict.add(new City(cityName));
    }

    public String toString() {
        return "District. " + "districtName: " + districtName + ", districtCenterName: " + districtCenterName +
                ", districtSquare: " + districtSquare;
    }
}
