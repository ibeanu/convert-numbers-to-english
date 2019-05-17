package com.ibctec.numberconverter.model;

public class TeenConverter {

    public StringBuilder convert(StringBuilder builder, int number) {

        switch (number) {
            case 1:
                builder.append("Eleven ");
                break;
            case 2:
                builder.append("Twelve");
                break;
            case 3:
                builder.append("Thirteen");
                break;
            case 4:
                builder.append("Fourteen");
                break;
            case 5:
                builder.append("Fifteen");
                break;
            case 6:
                builder.append("Sixteen");
                break;

            case 7:
                builder.append("Seventeen");
                break;

            case 8:
                builder.append("Eighteen");
                break;
            case 9:
                builder.append("Nineteen");
                break;
            default: builder.append("Ten ");
        }
        return builder;
    }
}
