package com.ibctec.numberconverter.model;

public class OnesConverter {

    public StringBuilder convert(StringBuilder builder, int number) {

        switch (number) {
            case 1:
               builder.append("One ");
                break;
            case 2:
                builder.append("Two ");
                break;
            case 3:
                builder.append("Three ");
                break;
            case 4:
                builder.append("Four ");
                break;
            case 5:
                builder.append("Five ");
                break;
            case 6:
                builder.append("Six ");
                break;
            case 7:
                builder.append("Seven ");
                break;
            case 8:
                builder.append("Eight ");
                break;
            case 9:
                builder.append("Nine ");
                break;
        }
        return builder;
    }
}
