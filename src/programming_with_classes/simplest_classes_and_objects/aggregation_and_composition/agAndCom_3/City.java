package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_3;

public class City {
    private String cityName;

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public City(String cityName) {
        this.cityName = cityName;
    }
}
