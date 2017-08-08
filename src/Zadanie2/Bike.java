package Zadanie2;

/**
 * Created by RENT on 2017-08-08.
 */
public class Bike {

    protected BikeType type;
    protected BikeBrand brand;
    protected int places = 1;
    protected int gears;

    public Bike(BikeType type, BikeBrand brand, int gears) {
        this.type = type;
        this.brand = brand;
        this.gears = gears;
        if(this.type == BikeType.TANDEM){
            this.places = 2;
        }
    }

    @Override
    public String toString() {
        return "Bike{" + "\n" +
                "   type=" + type + "\n" +
                "   brand=" + brand + "\n" +
                "   places=" + places + "\n" +
                "   gears=" + gears + "\n" +
                '}';
    }
}
