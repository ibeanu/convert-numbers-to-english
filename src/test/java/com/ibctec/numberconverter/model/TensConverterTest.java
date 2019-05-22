package com.ibctec.numberconverter.model;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TensConverterTest {
    @Test
    public void testTen() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TensConverter().convert(1, 0, builder);

        assertThat(result.toString().trim(), is("Ten"));
    }
    @Test
    public void testTwenty() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TensConverter().convert(2, 0, builder);

        assertThat(result.toString().trim(), is("Twenty"));
    }
    @Test
    public void testThirty() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TensConverter().convert(3, 0, builder);

        assertThat(result.toString().trim(), is("Thirty"));
    }
    @Test
    public void testForty() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TensConverter().convert(4, 0, builder);

        assertThat(result.toString().trim(), is("Forty"));
    }
    @Test
    public void testFifty() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TensConverter().convert(5, 0, builder);

        assertThat(result.toString().trim(), is("Fifty"));
    }
    @Test
    public void testSixty() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TensConverter().convert(6, 0, builder);

        assertThat(result.toString().trim(), is("Sixty"));
    }
    @Test
    public void testSeventy() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TensConverter().convert(7, 0, builder);

        assertThat(result.toString().trim(), is("Seventy"));
    }
    @Test
    public void testEiughty() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TensConverter().convert(8, 0, builder);

        assertThat(result.toString().trim(), is("Eighty"));
    }
    @Test
    public void testNinety() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TensConverter().convert(9, 0, builder);

        assertThat(result.toString().trim(), is("Ninety"));
    }

}