package br.ifsp.edu;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.*;

public class TestLamp {
    Lamp lamp = new Lamp();

    @Test
    @DisplayName("Should return 2 if FB is turn on")
    void shouldReturn2IfFbIsTurnOn() {
        lamp.IA = false;
        lamp.IB = false;
        lamp.FA = false;
        lamp.FB = true;
        lamp.switchStateOfLamps();
        assertThat(lamp.cont).isEqualTo(2);
    }

    @Test
    @DisplayName("Should return 1 if FA and FB is turn on")
    void shouldReturn1IfFaAndFbIsTurnOn() {
        lamp.IA = false;
        lamp.IB = false;
        lamp.FA = true;
        lamp.FB = true;
        lamp.switchStateOfLamps();
        assertThat(lamp.cont).isEqualTo(1);
    }

}
