package capstone;

import static org.mockito.Mockito.*;

import org.junit.Before;
import org.junit.Test;
import java.util.concurrent.ExecutorService;

public class ChargingStationTest {

    private ChargingStation chargingStation;
    private EnergyManagement mockEnergyManagement;
    private CarQueue mockCarQueue;
    private ChargingStationGUI mockGui;
    private ExecutorService mockExecutorService;

    @Before
    public void setUp() {
        mockEnergyManagement = mock(EnergyManagement.class);
        mockCarQueue = mock(CarQueue.class);
        mockGui = mock(ChargingStationGUI.class);
        mockExecutorService = mock(ExecutorService.class);
//        chargingStation = new ChargingStation(mockEnergyManagement, mockCarQueue, mockGui);
        chargingStation = new ChargingStation(mockEnergyManagement, mockCarQueue, mockGui, mockExecutorService);

    }

    @Test
    public void testStartChargingProcessSubmitsTasksForEachSlot() {
        chargingStation.startChargingProcess();
        // Assuming there are 3 slots in the ChargingStation
        verify(mockExecutorService, times(3)).submit(any(Runnable.class));
    }
}
