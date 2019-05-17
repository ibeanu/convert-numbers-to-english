package com.ibctec.numberconverter.model;

public class TensConverter {

    public StringBuilder convert(int tenVal, int oneVal, StringBuilder builder) {
        switch (tenVal) {
            case 1:
                builder = new TeenConverter().convert(builder, oneVal);
                break;
            case 2:
                builder = doConversion(oneVal, builder, "Twenty ");
                break;
            case 3:
                builder = doConversion(oneVal, builder, "Thirty ");
                break;
            case 4:
                builder = doConversion(oneVal, builder, "Forty ");
                break;
            case 5:
                builder = doConversion(oneVal, builder, "Fifty ");
                break;
            case 6:
                builder = doConversion(oneVal, builder, "Sixty ");
                break;
            case 7:
                builder = doConversion(oneVal, builder, "Seventy ");
                break;
            case 8:
                builder = doConversion(oneVal, builder, "Eighty ");
                break;
            case 9:
                builder = doConversion(oneVal, builder, "Ninety ");
                break;
            default:
                builder = doConversion(oneVal, builder, "");
                break;
        }
        return builder;
    }

    private StringBuilder doConversion(int oneVal, StringBuilder builder, String s) {
        builder.append(s);
        builder = new OnesConverter().convert(builder, oneVal);
        return builder;
    }
}