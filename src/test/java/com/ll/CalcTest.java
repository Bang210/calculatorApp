package com.ll;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class CalcTest {
    @Test
    @DisplayName("Calc의 run메서드는 int를 리턴한다.")
    void t1() {
        int rs = Calc.run("abcd");
    }
}