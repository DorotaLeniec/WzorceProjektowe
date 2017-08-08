package Zadanie2;

/**
 * Created by RENT on 2017-08-08.
 */
public abstract class BikeFactory {

    public static Bike createBikeKross(){
        return new Bike(BikeType.BICYCLE,BikeBrand.KROSS,5);
    }

    public static Bike createBikeMerida(){
        return new Bike(BikeType.BICYCLE,BikeBrand.MERIDA,6);
    }
    public static Bike createBikeInianaTandem(){
        return new Bike(BikeType.TANDEM,BikeBrand.INIANA,3);
    }
    public static Bike createBikeFelt(){
        return new Bike(BikeType.BICYCLE,BikeBrand.FELT,6);
    }
    public static Bike createBikeGoetzTandem(){
        return new Bike(BikeType.TANDEM,BikeBrand.GOETZ,1);
    }
}
