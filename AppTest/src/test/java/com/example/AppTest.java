package com.example;

import org.junit.jupiter.api.Test;
import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class AppTest {
    App app = new App();

    @Test
    public void testSum() {
        assertThat(app.sum(6, 4)).isEqualTo(10);
        assertThat(app.sum(0, 0)).isZero();
        assertThat(app.sum(-6, 6)).isZero();
    }

    @Test
    public void testDivide() {
        assertThat(app.divide(4, 3)).isEqualTo("1.33");
        assertThat(app.divide(0, 1)).isEqualTo("0");
        assertThat(app.divide(1, 0)).isEqualTo("NaN");
    }

    @Test
    public void testReturnTwoChars() {
        assertThat(app.returnTwoChars("qwerty")).isEqualTo("qw");
        assertThat(app.returnTwoChars("VA")).isEqualTo("VA");
        assertThat(app.returnTwoChars("V")).isEqualTo("V");
        assertThat(app.returnTwoChars("")).isEmpty();
        assertThatThrownBy(() -> app.returnTwoChars(null)).isInstanceOf(NullPointerException.class).hasMessage("Input cannot be null");
    }


    @Test
    public void testDiv() {
        assertThat(app.div(Double.valueOf(4), Double.valueOf(3))).isEqualTo(Double.valueOf("1.33"));
        assertThat(app.div(Double.valueOf(99), Double.valueOf(3))).isEqualTo(Double.valueOf("33"));
        assertThat(app.div(null, Double.valueOf(3))).isNull();
        assertThat(app.div(Double.valueOf(3), null)).isNull();
        assertThat(app.div(Double.valueOf(3), Double.valueOf(0))).isNull();
    }
}
