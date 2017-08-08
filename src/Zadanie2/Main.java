package Zadanie2;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by RENT on 2017-08-08.
 */
public class Main {

    public static void main(String[] args) {

        Bike tandem = BikeFactory.createBikeInianaTandem();
        Bike cross = BikeFactory.createBikeKross();
        Bike merida = BikeFactory.createBikeMerida();
        Bike felt = BikeFactory.createBikeFelt();
        Bike goetzTandem = BikeFactory.createBikeGoetzTandem();

        System.out.println(tandem);
        System.out.println(cross);
        System.out.println(merida);
        System.out.println(felt);
        System.out.println(goetzTandem);
    }
}
