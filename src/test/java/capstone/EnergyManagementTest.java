package capstone;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class EnergyManagementTest {

    private EnergyManagement energyManagement;
    private Weather mockWeather;
    private ChargingStationGUI mockGui;

    @Before
    public void setUp() {
        mockWeather = mock(Weather.class);
        mockGui = mock(ChargingStationGUI.class);
        energyManagement = new EnergyManagement(mockWeather, mockGui);
    }

    @Test
    public void testEnergySourceIsSolarWhenSunny() {
        when(mockWeather.isSunny()).thenReturn(true);
        String energySource = energyManagement.getCurrentEnergySource();
        assertEquals("Energy source should be Solar when it's sunny", "Solar", energySource);
    }

    @Test
    public void testEnergySourceIsGridWhenNotSunny() {
        when(mockWeather.isSunny()).thenReturn(false);
        String energySource = energyManagement.getCurrentEnergySource();
        assertEquals("Energy source should be Grid when it's not sunny", "Grid", energySource);
        verify(mockGui).updateEnergySource("Grid");
    }
}
