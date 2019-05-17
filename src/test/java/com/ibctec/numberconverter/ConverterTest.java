package com.ibctec.numberconverter;



import com.ibctec.numberconverter.model.Converter;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ConverterTest {

    @Autowired
    private Converter converter;

    @Test
    public void testConvertOnesToWords() {
        String words = converter.toWords("1");
        assertThat(words, is("One" ));

        words = converter.toWords("6");
        assertThat(words, is("Six" ));

        words = converter.toWords("10");
        assertThat(words, is("Ten" ));
    }

    @Test
    public void testConvertTeensToWords() {
        String words = converter.toWords("11");
        assertThat(words, is("Eleven" ));

        words = converter.toWords("16");
        assertThat(words, is("Sixteen" ));

        words = converter.toWords("19");
        assertThat(words, is("Nineteen" ));
    }

    @Test
    public void testConvertTensToWords() {
        String words = converter.toWords("20");
        assertThat(words, is("Twenty" ));

        words = converter.toWords("21");
        assertThat(words, is("Twenty One" ));

        words = converter.toWords("30");
        assertThat(words, is("Thirty" ));

        words = converter.toWords("34");
        assertThat(words, is("Thirty Four" ));

        words = converter.toWords("90");
        assertThat(words, is("Ninety" ));

        words = converter.toWords("99");
        assertThat(words, is("Ninety Nine" ));
    }

    @Test
    public void testConvertHundredsToWords() {
        String words = converter.toWords("100");
        assertThat(words, is("One Hundred" ));

        words = converter.toWords("111");
        assertThat(words, is("One Hundred And Eleven" ));

        words = converter.toWords("222");
        assertThat(words, is("Two Hundred And Twenty Two" ));

        words = converter.toWords("999");
        assertThat(words, is("Nine Hundred And Ninety Nine" ));
    }

    @Test
    public void testConvertThousandsToWords() {
        String words = converter.toWords("1000");
        assertThat(words, is("One Thousand" ));

        words = converter.toWords("1100");
        assertThat(words, is("One Thousand One Hundred" ));

        words = converter.toWords("1121");
        assertThat(words, is("One Thousand One Hundred And Twenty One" ));

        words = converter.toWords("9987");
        assertThat(words, is("Nine Thousand Nine Hundred And Eighty Seven" ));

        words = converter.toWords("1001");
        assertThat(words, is("One Thousand And One" ));

        //Tens of Thousands
        words = converter.toWords("10000");
        assertThat(words, is("Ten Thousand" ));

        words = converter.toWords("11000");
        assertThat(words, is("Eleven Thousand" ));

        words = converter.toWords("10999");
        assertThat(words, is("Ten Thousand Nine Hundred And Ninety Nine" ));

        //Hundreds Of Thoudsands

        words = converter.toWords("100000");
        assertThat(words, is("One Hundred Thousand" ));

        words = converter.toWords("110010");
        assertThat(words, is("One Hundred And Ten Thousand And Ten" ));

        words = converter.toWords("999999");
        assertThat(words, is("Nine Hundred And Ninety Nine Thousand Nine Hundred And Ninety Nine" ));

    }

    @Test
    public void testConvertMillionToWords() {
        String words = converter.toWords("1000000");
        assertThat(words, is("One Million" ));

        words = converter.toWords("1001001");
        assertThat(words, is("One Million One Thousand And One" ));

        words = converter.toWords("4110000");
        assertThat(words, is("Four Million One Hundred And Ten Thousand" ));

        words = converter.toWords("9999999");
        assertThat(words, is("Nine Million Nine Hundred And Ninety Nine Thousand Nine Hundred And Ninety Nine" ));

        //Tens of Million

        words = converter.toWords("11000000");
        assertThat(words, is("Eleven Million" ));

        words = converter.toWords("99999999");
        assertThat(words, is("Ninety Nine Million Nine Hundred And Ninety Nine Thousand Nine Hundred And Ninety Nine" ));

        // Hundreds of Million

        words = converter.toWords("999999999");
        assertThat(words, is("Nine Hundred And Ninety Nine Million Nine Hundred And Ninety Nine Thousand Nine Hundred And Ninety Nine" ));

        words = converter.toWords("56945781");
        assertThat(words, is("Fifty Six Million Nine Hundred And Forty Five Thousand Seven Hundred And Eighty One" ));
    }
}