package main.cars;

public class PassengerCar extends AbstractCar {

    private String model; //encapsulation
    private int maxSpeed; //encapsulation

    public PassengerCar(String master, String model) {
        super(master);
        this.model = model;
    }
    //overloading
    public PassengerCar(String master, String model, int maxSpeed) {
        super(master);
        this.model = model;
        this.maxSpeed = maxSpeed;
    }

    @Override // переопределение
    public int getQuantityWheel() {
        return 4;
    }

    @Override // переопределение
    public String getSound() {
        return "Viu-viu";
    }

    @Override // переопределение
    public String getType() {
        return "Passenger";
    }

    @Override // переопределение
    public String getModel() {
        return model ;
    }

    @Override // переопределение
    public String getMaster() {
        return super.master;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed(){
        return maxSpeed;
    }
}
