package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_3.by.yurachel.ag_and_com_3.entity;


import java.util.ArrayList;
import java.util.List;

public class State {
    private String stateName;
    private City capital;
    private List<Region> regionList;

    {
        regionList = new ArrayList<>();
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public List<Region> getRegionList() {
        return regionList;
    }

    public void setRegionList(List<Region> regionList) {
        this.regionList = regionList;
    }

    public State(City capital, String stateName) {
        this.capital = capital;
        this.stateName = stateName;
    }

    // Объединить области в страну.

    public void addRegion(Region region) {
        regionList.add(region);
    }

    // Вывести на консоль столицу.

    public void capital() {
        System.out.println("The capital of " + stateName + " is " + capital.getCityName());
    }

    // Вывести количество областей.

    public void amountOFRegions() {
        System.out.println("The amount of regions in " + stateName + " is " + regionList.size());
    }

    // Вывести площадь.

    public double stateSquare() {
        double stateSquare = 0;
        for (Region region : regionList) {
            stateSquare += region.regionSquare();
        }
        return stateSquare;
    }

    // Вывести областные центры.

    public void regionCenters() {
        for (Region region : regionList) {
            System.out.println("The region center is " + region.getRegionCenterName().getCityName());
        }
    }

    public String toString() {
        return "State. " + "stateName: " + stateName + ", capital: " + capital;
    }
}
