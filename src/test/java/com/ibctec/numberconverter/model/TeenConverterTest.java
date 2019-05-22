package com.ibctec.numberconverter.model;

import org.junit.Test;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.*;

public class TeenConverterTest {
    @Test
    public void testEleven() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TeenConverter().convert(builder, 1);

        assertThat(result.toString().trim(), is("Eleven"));
    }
    @Test
    public void testTwelve() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TeenConverter().convert(builder, 2);

        assertThat(result.toString().trim(), is("Twelve"));
    }

    @Test
    public void testThirteen() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TeenConverter().convert(builder, 3);

        assertThat(result.toString().trim(), is("Thirteen"));
    }
    @Test
    public void testFourteen() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TeenConverter().convert(builder, 4);

        assertThat(result.toString().trim(), is("Fourteen"));
    }
    @Test
    public void testFifteen() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TeenConverter().convert(builder, 5);

        assertThat(result.toString().trim(), is("Fifteen"));
    }
    @Test
    public void testSixteen() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TeenConverter().convert(builder, 6);

        assertThat(result.toString().trim(), is("Sixteen"));
    }
    @Test
    public void testSeventeen() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TeenConverter().convert(builder, 7);

        assertThat(result.toString().trim(), is("Seventeen"));
    }
    @Test
    public void testEighteen() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TeenConverter().convert(builder, 8);

        assertThat(result.toString().trim(), is("Eighteen"));
    }
    @Test
    public void testNineteen() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new TeenConverter().convert(builder, 9);

        assertThat(result.toString().trim(), is("Nineteen"));
    }

}