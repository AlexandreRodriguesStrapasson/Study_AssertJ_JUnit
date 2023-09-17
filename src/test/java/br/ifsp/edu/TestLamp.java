package br.ifsp.edu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestLamp {
    Lamp lamp = new Lamp();

    @Test
    @DisplayName("Should return 2 if FB is turn on")
    void shouldReturn2IfFbIsTurnOn() {
        turnOnAndDownTheLamps(false, false, false, true);
        lamp.switchStateOfLamps();
        assertThat(lamp.cont).isEqualTo(2);
    }

    @Test
    @DisplayName("Should return 1 if FA and FB is turn on")
    void shouldReturn1IfFaAndFbIsTurnOn() {
        turnOnAndDownTheLamps(false, false, true, true);
        lamp.switchStateOfLamps();
        assertThat(lamp.cont).isEqualTo(1);
    }

    private void turnOnAndDownTheLamps(boolean ia, boolean ib, boolean fa, boolean fb) {
        lamp.initialStateOfLampA = ia;
        lamp.initialStateOfLampB = ib;
        lamp.finalStateOfLampA = fa;
        lamp.finalStateOfLampB = fb;
    }
}
