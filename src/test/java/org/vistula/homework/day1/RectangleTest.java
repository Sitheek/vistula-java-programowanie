package org.vistula.homework.day1;

import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class RectangleTest {
    @Test
    public void shouldCorrectlyCalculateField() {
        Rectangle rectangle = new Rectangle(2,3);
        int expectedField = 6;

        int actualField = rectangle.field();

        assertThat(actualField).isEqualTo(expectedField);
    }

    @Test
    public void shouldCorrectlyCalculatePerimeter() {
        Rectangle rectangle = new Rectangle(2,3);
        int expectedPerimeter = 10;

        int actualPerimeter = rectangle.perimeter();

        assertThat(actualPerimeter).isEqualTo(expectedPerimeter);
    }
}
