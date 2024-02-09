package capstone;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import org.junit.Before;
import org.junit.Test;

public class CarQueueTest {

    private CarQueue carQueue;
    private ChargingStationGUI mockGui;



    @Before
    public void setUp() {
        mockGui = mock(ChargingStationGUI.class);
        carQueue = new CarQueue(mockGui);
        while (carQueue.getNextCar() != null);
    }

    @Test
    public void testAddCar() {
        Car car = new Car("777AAA");
        Car car2 = new Car("177AAA");
        Car car3 = new Car("277AAA");
        Car car4 = new Car("377AAA");
        Car car5 = new Car("477AAA");
        Car car6 = new Car("077AAA");

        carQueue.addCar(car);
        carQueue.addCar(car2);
        carQueue.addCar(car3);
        carQueue.addCar(car4);
        carQueue.addCar(car5);
        carQueue.addCar(car6);

        assertEquals("Queue size should be 1 after adding a car", 6, carQueue.getQueueSize());
        verify(mockGui).updateQueue(0); // Verify GUI is updated with new queue size
    }

    @Test
    public void testGetNextCarFromEmptyQueue() {
        assertNull("getNextCar should return null for an empty queue", carQueue.getNextCar());
    }

    @Test
    public void testGetNextCar() {
        Car car = new Car("AAA700");
        carQueue.addCar(car);
        Car retrievedCar = carQueue.getNextCar();
        assertEquals("Retrieved car should be the same as the one added", car, retrievedCar);
    }
}
