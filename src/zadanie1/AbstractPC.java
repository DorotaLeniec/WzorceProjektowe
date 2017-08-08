package zadanie1;

/**
 * Created by RENT on 2017-08-08.
 */
public abstract class AbstractPC {

    public AbstractPC(String name, ComputerBrand brand, int cpuPower, double gpuPower, boolean isOverlocked) {
        this.name = name;
        this.brand = brand;
        this.cpuPower = cpuPower;
        this.gpuPower = gpuPower;
        this.isOverlocked = isOverlocked;
    }

    protected String name;
    protected ComputerBrand brand;
    protected int cpuPower;
    protected double gpuPower;
    protected boolean isOverlocked;

    public ComputerBrand getBrand() {
        return brand;
    }

    public void setBrand(ComputerBrand brand) {
        this.brand = brand;
    }

    public int getCpuPower() {
        return cpuPower;
    }

    public void setCpuPower(int cpuPower) {
        this.cpuPower = cpuPower;
    }

    public double getGpuPower() {
        return gpuPower;
    }

    public void setGpuPower(double gpuPower) {
        this.gpuPower = gpuPower;
    }

    public boolean isOverlocked() {
        return isOverlocked;
    }

    public void setOverlocked(boolean overlocked) {
        isOverlocked = overlocked;
    }

    public String getName() {

        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
