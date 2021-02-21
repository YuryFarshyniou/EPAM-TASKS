package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_3.by.yurachel.ag_and_com_3.entity;

import java.util.ArrayList;
import java.util.List;

public class Region {
    private String regionName;
    private City regionCenterName;
    private List<District> districtList;

    {
        districtList = new ArrayList<>();
    }

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

    public List<District> getDistrictList() {
        return districtList;
    }

    public void setDistrictList(List<District> districtList) {
        this.districtList = districtList;
    }

    public Region(String regionName, City regionCenterName) {
        this.regionName = regionName;
        this.regionCenterName = regionCenterName;

    }

    // Объединяем районы в области.

    public void addDistrict(District district) {
        districtList.add(district);
    }

    // Находим площадь области.

    public double regionSquare() {
        double regionSquare = 0;
        for (District district : districtList) {
            regionSquare += district.getDistrictSquare();
        }
        return regionSquare;
    }

    public String toString() {
        return "Region. " + "regionName: " + regionName + ", regionCenterName: " + regionCenterName;
    }
}
