/**
 * on this principle(with using assertEquals method) test classes for other classes can be constructed
 */
package test;

import cars.PassengerCar;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class TestPassengerCar {
    private PassengerCar car;

    @Before
    public void setUp() {
        car = new PassengerCar("Name", "car", 1200);
    }

    @Test
    public void getQuantityWheelShouldReturn4(){
        assertEquals(car.getQuantityWheel(),4);
    }

    @Test
    public void getMasterShouldReturnName(){
        assertEquals(car.getMaster(),"Name");
    }
    @Test
    public void getSoundShouldReturnViu(){
        assertEquals(car.getSound(),"Viu-viu");
    }
    @Test
    public void getTypeShouldReturnPassenger(){
        assertEquals(car.getType(),"Passenger");
    }
    @Test
    public void getModelShouldReturnCar(){
        assertEquals(car.getModel(),"car");
    }
    @Test
    public void setMaxSpeedShouldSet1200(){
        assertEquals(car.getMaxSpeed(),1200);
    }
    @Test
    public void getMaxSpeedShouldReturn100(){
        car.setMaxSpeed(100);
        assertEquals(car.getMaxSpeed(),100);
    }
}
