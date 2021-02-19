package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.agAndCom_3;

public class RunnerState {
    public static void main(String[] args) {
        Region[] regions;
        District[] mogilevskiyRegion;
        District[] minskiRegion;
        City[] minskiyDistrict;
        City[] baranovicheskiyDistrict;
        City[] mogilevskiyDistrict;
        City[] bobruiskiyDistrict;
        State state = new State(new City("Minsk"), regions = new Region[2], "Belarus");

        regions[0] = new Region("Mohilevskai", new City("Mogilev"), mogilevskiyRegion = new District[2]);

        mogilevskiyRegion[0] = new District("Mogilevskiy", new City("Mogilev"), 123.7, mogilevskiyDistrict = new City[2]);

        mogilevskiyDistrict[0] = new City("Mogilev");
        mogilevskiyDistrict[1] = new City("Sklov");

        mogilevskiyRegion[1] = new District("Babruiskiy", new City("Bobruisk"), 56.8, bobruiskiyDistrict = new City[2]);

        bobruiskiyDistrict[0] = new City("Bobruisk");
        bobruiskiyDistrict[1] = new City("Orsha");

        regions[1] = new Region("Minskai", new City("Minsk"), minskiRegion = new District[2]);

        minskiRegion[0] = new District("Minkiy", new City("Minsk"), 345.1, minskiyDistrict = new City[2]);

        minskiyDistrict[0] = new City("Minsk");
        minskiyDistrict[1] = new City("Starue dorogi");

        minskiRegion[1] = new District("Baranovicheskiy", new City("Baranovichi"), 170.9, baranovicheskiyDistrict = new City[2]);

        baranovicheskiyDistrict[0] = new City("Baranovichi");
        baranovicheskiyDistrict[1] = new City("Prugany");

        state.capital();
        state.amountOFRegions();
        System.out.println("The square of " + state.getStateName() + " is " + state.stateSquare());
        state.regionCenters();

    }
}
