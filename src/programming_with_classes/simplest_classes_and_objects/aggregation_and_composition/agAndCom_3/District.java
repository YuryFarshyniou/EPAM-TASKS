package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_3;

public class District {
    private String districtName;
    private City districtCenterName;
    private double districtSquare;
    private City[] amountOfCitiesInThisDistrict;

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

    public City[] getAmountOfCitiesInThisDistrict() {
        return amountOfCitiesInThisDistrict;
    }

    public void setAmountOfCitiesInThisDistrict(City[] amountOfCitiesInThisDistrict) {
        this.amountOfCitiesInThisDistrict = amountOfCitiesInThisDistrict;
    }

    public District(String districtName, City districtCenterName, double districtSquare, City[] amountOfCitiesInThisDistrict) {
        this.districtName = districtName;
        this.districtCenterName = districtCenterName;
        this.districtSquare = districtSquare;
        this.amountOfCitiesInThisDistrict = amountOfCitiesInThisDistrict;
    }
}
