package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_3;

public class Region {
    private String regionName;
    private City regionCenterName;
    private District[] districts;


    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public City getRegionCenterName() {
        return regionCenterName;
    }

    public void setRegionCenterName(City regionCenterName) {
        this.regionCenterName = regionCenterName;
    }

    public District[] getDistricts() {
        return districts;
    }

    public void setDistricts(District[] districts) {
        this.districts = districts;
    }

    public Region(String regionName, City regionCenterName, District[] districts) {
        this.regionName = regionName;
        this.regionCenterName = regionCenterName;
        this.districts = districts;
    }


    // Находим площадь области.

    public double regionSquare() {
        double regionSquare = 0;
        for (District district : districts) {
            regionSquare += district.getDistrictSquare();
        }
        return regionSquare;
    }
}
