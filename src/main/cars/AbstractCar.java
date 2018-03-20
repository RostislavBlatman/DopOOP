package main.cars;

public abstract class AbstractCar {

    protected String master;

    protected AbstractCar(String master) {
        this.master = master;
    }

    public abstract int getQuantityWheel();

    public abstract String getSound();

    public abstract String getType();

    public abstract String getModel();

    public abstract String getMaster();

}
