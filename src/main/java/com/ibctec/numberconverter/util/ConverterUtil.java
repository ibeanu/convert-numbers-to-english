package com.ibctec.numberconverter.util;

import com.ibctec.numberconverter.model.HundredsConverter;
import com.ibctec.numberconverter.model.OnesConverter;
import com.ibctec.numberconverter.model.TensConverter;
import com.ibctec.numberconverter.model.ThousandsConverter;

public class ConverterUtil {

    public static void checkValues(StringBuilder builder,int hundred, int tenValue, int oneValue) {
        if ((oneValue > 0 || tenValue > 0) && hundred > 0 ) {
            builder.append("And ");
        }
    }

    public static void checkValues(StringBuilder builder, int thousand, int hundred, int tenValue, int oneValue) {
       if ((oneValue > 0 || tenValue > 0) && hundred == 0 && thousand !=0 ) {
            builder.append("And ");
        }
    }

    public static void addAnd(StringBuilder builder, int hundred, int ten, int one) {
        if (hundred == 0 && (ten !=0 || one != 0)) {
            builder.append("And ");
        }

    }

    public static  StringBuilder doHundredsConversion(StringBuilder builder, int tensThousand, int onsThousand, int hundredThousand) {
        builder = new HundredsConverter()
                .convert(hundredThousand, tensThousand, onsThousand, builder);
        return builder;
    }

    public static StringBuilder doTensConversion(StringBuilder builder, int tensThousand, int onsThousand) {
        builder = new TensConverter()
                .convert(tensThousand, onsThousand, builder);
        return builder;
    }

    public static StringBuilder doThousandConversion(StringBuilder builder, int ten, int one, int hundred, int thousand) {
        builder = new ThousandsConverter()
                .convert(thousand, hundred, ten, one, builder);
        return builder;
    }

    public static StringBuilder doOnesConversion(char[] numbers, StringBuilder builder) {
        builder = new OnesConverter()
                .convert(builder, getIntValue(0, numbers));
        return builder;
    }

    public static int getIntValue(int i, char[] numbers) {
        return Integer.parseInt(String.valueOf((numbers[i])));
    }

}
