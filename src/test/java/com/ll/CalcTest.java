package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalcTest {
    @Test
    @DisplayName("Calc의 run메서드는 int를 리턴한다.")
    void t1() {
        int rs = Calc.run("5");
    }

    @Test
    @DisplayName("10 + 10 = 20")
    void t2() {
        int rs  = Calc.run("10 + 10");
        assertThat(rs).isEqualTo(20);
    }

    @Test
    @DisplayName("10 - 10 = 0")
    void t3() {
        int rs  = Calc.run("10 - 10");
        assertThat(rs).isEqualTo(0);
    }

    @Test
    @DisplayName("10 * 10 = 100")
    void t4() {
        int rs  = Calc.run("10 * 10");
        assertThat(rs).isEqualTo(100);
    }

    @Test
    @DisplayName("10 / 10 = 1")
    void t5() {
        int rs  = Calc.run("10 / 10");
        assertThat(rs).isEqualTo(1);
    }

    @Test
    @DisplayName("10 + 20  = 30")
    void t6() {
        int rs  = Calc.run("10 + 20");
        assertThat(rs).isEqualTo(30);
    }

    @Test
    @DisplayName("20 - 10  = 10")
    void t7() {
        int rs  = Calc.run("20 - 10");
        assertThat(rs).isEqualTo(10);
    }

    @Test
    @DisplayName("100 / 10  = 10")
    void t8() {
        int rs  = Calc.run("100 / 10");
        assertThat(rs).isEqualTo(10);
    }

    @Test
    @DisplayName("(10 + 10)  = 20")
    void t9() {
        int rs  = Calc.run("(10 + 10)");
        assertThat(rs).isEqualTo(20);
    }
}