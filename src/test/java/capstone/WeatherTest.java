package capstone;

import static org.mockito.Mockito.*;
import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

public class WeatherTest {

    private Weather weather;
    private ChargingStationGUI mockGui;

    @Before
    public void setUp() {
        mockGui = mock(ChargingStationGUI.class);
        weather = new Weather(mockGui);
    }

    @Test
    public void testIsSunnyInitially() {
        assertTrue("Weather should initially be sunny", weather.isSunny());
    }
}
