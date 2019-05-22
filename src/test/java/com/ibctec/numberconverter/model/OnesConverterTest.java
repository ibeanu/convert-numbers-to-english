package com.ibctec.numberconverter.model;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class OnesConverterTest {
    @Test
    public void testOne() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new OnesConverter().convert(builder, 1);

        assertThat(result.toString().trim(), is("One"));
    }
    @Test
    public void testTwo() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new OnesConverter().convert(builder, 2);

        assertThat(result.toString().trim(), is("Two"));
    }
    @Test
    public void testThree() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new OnesConverter().convert(builder, 3);

        assertThat(result.toString().trim(), is("Three"));
    }
    @Test
    public void testFour() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new OnesConverter().convert(builder, 4);

        assertThat(result.toString().trim(), is("Four"));
    }
    @Test
    public void testFive() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new OnesConverter().convert(builder, 5);
        assertThat(result.toString().trim(), is("Five"));
    }
    @Test
    public void testSix() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new OnesConverter().convert(builder, 6);

        assertThat(result.toString().trim(), is("Six"));
    }
    @Test
    public void testSeven() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new OnesConverter().convert(builder, 7);

        assertThat(result.toString().trim(), is("Seven"));
    }
    @Test
    public void testEight() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new OnesConverter().convert(builder, 8);

        assertThat(result.toString().trim(), is("Eight"));
    }
    @Test
    public void testNine() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new OnesConverter().convert(builder, 9);

        assertThat(result.toString().trim(), is("Nine"));
    }

}