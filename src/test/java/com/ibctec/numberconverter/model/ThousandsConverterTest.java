package com.ibctec.numberconverter.model;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class ThousandsConverterTest {

    @Test
    public void testOneThousand() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new ThousandsConverter().convert(1, 0, 0, 0, builder);

        assertThat(result.toString().trim(), is("One Thousand"));
    }

    @Test
    public void testTwoThousand() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new ThousandsConverter().convert(2, 0, 0, 0, builder);

        assertThat(result.toString().trim(), is("Two Thousand"));
    }

}