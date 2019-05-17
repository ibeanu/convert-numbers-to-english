package com.ibctec.numberconverter.model;

public class MillionConverter {
    public StringBuilder convert(int million, int hundred, int ten, int one, StringBuilder builder) {
        switch (million) {
            case 1:
                builder = doTenConversion(one, ten, hundred, builder, "One Million ");
                break;
            case 2:
                builder = doTenConversion(one, ten, hundred, builder, "Two Million ");
                break;
            case 3:
                builder = doTenConversion(one, ten, hundred, builder, "Three Million ");
                break;
            case 4:
                builder = doTenConversion(one, ten, hundred,  builder, "Four Million ");
                break;
            case 5:
                builder = doTenConversion(one, ten, hundred, builder, "Five Million ");
                break;
            case 6:
                builder = doTenConversion(one, ten, hundred,  builder, "Six Million ");
                break;
            case 7:
                builder = doTenConversion(one, ten, hundred, builder, "Seven Million ");
            case 8:
                builder = doTenConversion(one, ten, hundred, builder, "Eight Million ");
                break;
            case 9:
                builder = doTenConversion(one, ten, hundred,  builder, "Nine Million ");
                break;
            default:
                builder = doTenConversion(one, ten, hundred, builder, "Ten Million ");
                break;
        }
        return builder;
    }
    private StringBuilder doTenConversion(int one, int ten, int hundred, StringBuilder builder, String s) {
        builder.append(s);
     //   ConverterUtil.checkValues(builder, hundred, ten, one);
        builder = new HundredsConverter().convert(hundred, ten, one, builder);
        return builder;
    }

}
