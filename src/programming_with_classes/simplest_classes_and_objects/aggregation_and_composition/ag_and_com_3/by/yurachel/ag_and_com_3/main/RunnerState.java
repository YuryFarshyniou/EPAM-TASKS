package programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_3.by.yurachel.ag_and_com_3.main;

import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_3.by.yurachel.ag_and_com_3.entity.City;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_3.by.yurachel.ag_and_com_3.entity.District;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_3.by.yurachel.ag_and_com_3.entity.Region;
import programming_with_classes.simplest_classes_and_objects.aggregation_and_composition.ag_and_com_3.by.yurachel.ag_and_com_3.entity.State;

public class RunnerState {
    public static void main(String[] args) {

        District minskiyDistrict = new District("Minkiy", new City("Minsk"), 345.1);
        District baranovicheskiyDistrict = new District("Baranovicheskiy", new City("Baranovichi"), 170.9);
        District mogilevskiyDistrict = new District("Mogilevskiy", new City("Mogilev"), 123.7);
        District bobruiskiyDistrict = new District("Babruiskiy", new City("Bobruisk"), 56.8);
        Region minskiRegion = new Region("Minskai", new City("Minsk"));
        Region mogilevskiyRegion = new Region("Mohilevskai", new City("Mogilev"));
        State state = new State(new City("Minsk"), "Belarus");

        minskiyDistrict.addCity("Minsk");
        minskiyDistrict.addCity("Starue dorogi");
        baranovicheskiyDistrict.addCity("Baranovichi");
        baranovicheskiyDistrict.addCity("Prugany");
        mogilevskiyDistrict.addCity("Mogilev");
        mogilevskiyDistrict.addCity("Sklov");
        bobruiskiyDistrict.addCity("Bobruisk");
        bobruiskiyDistrict.addCity("Orsha");

        minskiRegion.addDistrict(minskiyDistrict);
        minskiRegion.addDistrict(baranovicheskiyDistrict);
        mogilevskiyRegion.addDistrict(mogilevskiyDistrict);
        mogilevskiyRegion.addDistrict(bobruiskiyDistrict);

        state.addRegion(minskiRegion);
        state.addRegion(mogilevskiyRegion);

        state.capital();
        state.amountOFRegions();

        System.out.println("The square of " + state.getStateName() + " is " + state.stateSquare());
        state.regionCenters();

    }
}
