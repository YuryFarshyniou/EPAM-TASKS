package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_3;

/* Создать объект класса Государство, используя классы Область, Район, Город.
Методы: вывести на консоль столицу, количество областей, площадь, областные центры. */

public class State {
    private String stateName;
    private City capital;
    private Region[] regions;

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }

    public Region[] getRegions() {
        return regions;
    }

    public void setRegions(Region[] regions) {
        this.regions = regions;
    }

    public String getStateName() {
        return stateName;
    }

    public void setStateName(String stateName) {
        this.stateName = stateName;
    }

    public State(City capital, Region[] regions, String stateName) {
        this.capital = capital;
        this.regions = regions;
        this.stateName = stateName;
    }

    // Вывести на консоль столицу.

    public void capital() {
        System.out.println("The capital of " + stateName + " is " + capital.getCityName());
    }

    // Вывести количество областей.

    public void amountOFRegions() {
        System.out.println("The amount of regions in " + stateName + " is " + regions.length);
    }

    // Вывести площадь.

    public double stateSquare() {
        double stateSquare = 0;
        for (Region region : regions) {
            stateSquare += region.regionSquare();
        }
        return stateSquare;
    }

    // Вывести областные центры.

    public void regionCenters() {
        for (Region region : regions) {
            System.out.println("The region center is " + region.getRegionCenterName().getCityName());
        }
    }
}
