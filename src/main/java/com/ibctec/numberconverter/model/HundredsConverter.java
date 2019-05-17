package com.ibctec.numberconverter.model;

import com.ibctec.numberconverter.util.ConverterUtil;

public class HundredsConverter {
    public StringBuilder convert(int hundred, int ten, int one, StringBuilder builder) {
        switch (hundred) {
            case 1:
                builder = doTenConversion(one, ten, hundred, builder, "One Hundred ");
                break;
            case 2:
                builder = doTenConversion(one, ten, hundred, builder, "Two Hundred ");
                break;
            case 3:
                builder = doTenConversion(one, ten, hundred, builder, "Three Hundred ");
                break;
            case 4:
                builder = doTenConversion(one, ten, hundred, builder, "Four Hundred ");
                break;
            case 5:
                builder = doTenConversion(one, ten, hundred, builder, "Five Hundred ");
                break;
            case 6:
                builder = doTenConversion(one, ten, hundred, builder, "Six Hundred ");
                break;
            case 7:
                builder = doTenConversion(one, ten, hundred, builder, "Seven Hundred ");
                break;
            case 8:
                builder = doTenConversion(one, ten, hundred, builder, "Eight Hundred ");
                break;
            case 9:
                builder = doTenConversion(one, ten, hundred, builder, "Nine Hundred ");
                break;
            default:
                builder = doTenConversion(one, ten, hundred, builder, "");
                break;
        }
        return builder;
    }

    private StringBuilder doTenConversion(int one, int ten,int hundred,  StringBuilder builder, String s) {
        builder.append(s);
        ConverterUtil.checkValues(builder, hundred, ten, one);
        builder = new TensConverter().convert(ten, one, builder);
        return builder;
    }
}
