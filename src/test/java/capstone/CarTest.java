package capstone;

//import static org.junit.jupiter.api.Assertions.*;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CarTest {

    @Test
    public void testCarConstructorAndLicensePlate() {
        String licensePlate = "ABC123";
        Car car = new Car(licensePlate);
        assertEquals("The license plate should match the constructor argument", licensePlate, car.getLicensePlate());
    }
}
