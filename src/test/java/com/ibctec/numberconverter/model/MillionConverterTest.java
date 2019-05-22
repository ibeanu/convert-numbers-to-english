package com.ibctec.numberconverter.model;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class MillionConverterTest {

    @Test
    public void testOneMillion() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new MillionConverter().convert(1, 0, 0, 0,  builder);

        assertThat(result.toString().trim(), is("One Million"));
    }
    @Test
    public void testTwoMillion() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new MillionConverter().convert(2, 0, 0, 0,  builder);

        assertThat(result.toString().trim(), is("Two Million"));
    }
    @Test
    public void testThreeMillion() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new MillionConverter().convert(3, 0, 0, 0,  builder);

        assertThat(result.toString().trim(), is("Three Million"));
    }
    @Test
    public void testFourMillion() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new MillionConverter().convert(4, 0, 0, 0,  builder);

        assertThat(result.toString().trim(), is("Four Million"));
    }
    @Test
    public void testFiveMillion() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new MillionConverter().convert(5, 0, 0, 0,  builder);

        assertThat(result.toString().trim(), is("Five Million"));
    }
    @Test
    public void testSixMillion() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new MillionConverter().convert(6, 0, 0, 0,  builder);

        assertThat(result.toString().trim(), is("Six Million"));
    }
    @Test
    public void testSevenMillion() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new MillionConverter().convert(7, 0, 0, 0,  builder);

        assertThat(result.toString().trim(), is("Seven Million"));
    }
    @Test
    public void testEightMillion() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new MillionConverter().convert(8, 0, 0, 0,  builder);

        assertThat(result.toString().trim(), is("Eight Million"));
    }
    @Test
    public void testNineMillion() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new MillionConverter().convert(9, 0, 0, 0,  builder);

        assertThat(result.toString().trim(), is("Nine Million"));
    }
    @Test
    public void testTenMillion() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new MillionConverter().convert(10, 0, 0, 0,  builder);

        assertThat(result.toString().trim(), is("Ten Million"));
    }
}