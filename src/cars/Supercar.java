package cars;

public class Supercar extends PassengerCar {

    public Supercar(String master, String model, int maxSpeed) {
        super(master, model, maxSpeed); //inheritance
    }

    public boolean hasSpoiler() {
        return true;
    }

    public boolean fasterThanSpeedOfSound(){
        return this.getMaxSpeed() > 1235;//inheritance
    }
}
