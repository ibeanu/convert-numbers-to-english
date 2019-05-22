package com.ibctec.numberconverter.model;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class HundredsConverterTest {

    @Test
    public void testOneHundred() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new HundredsConverter().convert(1, 0, 0, builder);

        assertThat(result.toString().trim(), is("One Hundred"));
    }
    @Test
    public void testTwoHundred() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new HundredsConverter().convert(2, 0, 0, builder);

        assertThat(result.toString().trim(), is("Two Hundred"));
    }

    @Test
    public void testThreeHundred() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new HundredsConverter().convert(3, 0, 0, builder);

        assertThat(result.toString().trim(), is("Three Hundred"));
    }

    @Test
    public void testFourHundred() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new HundredsConverter().convert(4, 0, 0, builder);

        assertThat(result.toString().trim(), is("Four Hundred"));
    }

    @Test
    public void testFiveHundred() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new HundredsConverter().convert(5, 0, 0, builder);

        assertThat(result.toString().trim(), is("Five Hundred"));
    }

    @Test
    public void testSixHundred() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new HundredsConverter().convert(6, 0, 0, builder);

        assertThat(result.toString().trim(), is("Six Hundred"));
    }
    @Test
    public void testSevenHundred() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new HundredsConverter().convert(7, 0, 0, builder);

        assertThat(result.toString().trim(), is("Seven Hundred"));
    }

    @Test
    public void testEightHundred() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new HundredsConverter().convert(8, 0, 0, builder);

        assertThat(result.toString().trim(), is("Eight Hundred"));
    }

    @Test
    public void testNineHundred() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new HundredsConverter().convert(9, 0, 0, builder);

        assertThat(result.toString().trim(), is("Nine Hundred"));
    }


}