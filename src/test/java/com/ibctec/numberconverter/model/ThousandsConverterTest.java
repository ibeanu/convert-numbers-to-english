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
    @Test
    public void testThreeThousand() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new ThousandsConverter().convert(3, 0, 0, 0, builder);

        assertThat(result.toString().trim(), is("Three Thousand"));
    }
    @Test
    public void testFourThousand() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new ThousandsConverter().convert(4, 0, 0, 0, builder);

        assertThat(result.toString().trim(), is("Four Thousand"));
    }
    @Test
    public void testFiveThousand() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new ThousandsConverter().convert(5, 0, 0, 0, builder);

        assertThat(result.toString().trim(), is("Five Thousand"));
    }
    @Test
    public void testSixThousand() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new ThousandsConverter().convert(6, 0, 0, 0, builder);

        assertThat(result.toString().trim(), is("Six Thousand"));
    }
    @Test
    public void testSevenThousand() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new ThousandsConverter().convert(7, 0, 0, 0, builder);

        assertThat(result.toString().trim(), is("Seven Thousand"));
    }
    @Test
    public void testEightThousand() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new ThousandsConverter().convert(8, 0, 0, 0, builder);

        assertThat(result.toString().trim(), is("Eight Thousand"));
    }
    @Test
    public void testNineThousand() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new ThousandsConverter().convert(9, 0, 0, 0, builder);

        assertThat(result.toString().trim(), is("Nine Thousand"));
    }
    @Test
    public void testTenThousand() {
        StringBuilder builder = new StringBuilder();
        StringBuilder result = new ThousandsConverter().convert(10, 0, 0, 0, builder);

        assertThat(result.toString().trim(), is("Ten Thousand"));
    }

}