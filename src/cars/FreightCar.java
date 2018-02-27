package cars;

public class FreightCar extends AbstractCar {

    private String model;  //encapsulation
    private int carrying;  //encapsulation
    private int quantityWheels = 6;  //encapsulation

    public FreightCar(String master, String model) {
        super(master);
        this.model = model;
    }
// overloading
    public FreightCar(String master, String model, int carrying) {
        super(master);
        this.model = model;
        this.carrying = carrying;
    }

    public String getMaster(){
        return super.master;
    }

    @Override // переопределение
    public int getQuantityWheel() {
        return quantityWheels;
    }

    @Override // переопределение
    public String getSound() {
        return "Fa-Fa";
    }

    @Override // переопределение
    public String getType() {
        return "Freight";
    }

    @Override // переопределение
    public String getModel() {
        return model;
    }

    @Override // переопределение
    public String toString() {
        return "Car: " + model + "; Master: "+super.master;
    }

    public int getCarrying(){
        return carrying;
    }

    public void setCarrying(int carrying){
        this.carrying = carrying;
    }

    public void setQuantityWheel(int quantityWheels){
        this.quantityWheels = quantityWheels;
    }
}
