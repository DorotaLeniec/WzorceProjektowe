package zadanie1;

/**
 * Created by RENT on 2017-08-08.
 */
public abstract class AbstractFactory {

    public static AbstractPC createAsusPC111(){
        return new AsusPC("ASUS 111",ComputerBrand.ASSUS,100,90,false);
    }
}
