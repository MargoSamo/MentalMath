package com.mariasamoilova;

import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class MathServiceTest {

    @Test
    public void shouldExitWhenTypeExit() {
        // Given
        MathService mathService  = new MathService();

        // When
        Result result = mathService.evaluate("exit");

        // Then
        assertThat(result.type).isEqualTo(ResultType.EXIT);
    }
}
