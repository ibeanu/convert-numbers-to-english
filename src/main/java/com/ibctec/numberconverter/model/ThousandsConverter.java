package com.ibctec.numberconverter.model;

import com.ibctec.numberconverter.util.ConverterUtil;

public class ThousandsConverter {
    public StringBuilder convert(int thousand, int hundred, int ten, int one, StringBuilder builder) {

        switch (thousand) {
            case 1:
                builder = doConversion(thousand, hundred, ten, one, builder, "One Thousand ");
                break;
            case 2:
                builder = doConversion(thousand, hundred, ten, one, builder, "Two Thousand ");
                break;
            case 3:
                builder = doConversion(thousand, hundred, ten, one, builder, "Three Thousand ");
                break;
            case 4:
                builder = doConversion(thousand, hundred, ten, one, builder, "Four Thousand ");
                break;
            case 5:
                builder = doConversion(thousand, hundred, ten, one, builder, "Five Thousand ");
                break;
            case 6:
                builder = doConversion(thousand, hundred, ten, one, builder, "Six Thousand ");
                break;
            case 7:
                builder = doConversion(thousand, hundred, ten, one, builder, "Seven Thousand ");
                break;
            case 8:
                builder = doConversion(thousand, hundred, ten, one, builder, "Eight Thousand ");
                break;
            case 9:
                builder = doConversion(thousand, hundred, ten, one, builder, "Nine Thousand ");
                break;
        }
        return builder;
    }

    private StringBuilder doConversion(int thousand, int hundred, int ten, int one, StringBuilder builder, String s) {
        builder.append(s);
        ConverterUtil.checkValues(builder, thousand, hundred, ten, one);
        builder = new HundredsConverter().convert(hundred, ten, one, builder);
        return builder;
    }
}
