package com.ibctec.numberconverter.model;

import com.ibctec.numberconverter.util.ConverterUtil;
import org.springframework.stereotype.Component;

import static com.ibctec.numberconverter.util.ConverterUtil.doHundredsConversion;
import static com.ibctec.numberconverter.util.ConverterUtil.doOnesConversion;
import static com.ibctec.numberconverter.util.ConverterUtil.doTensConversion;
import static com.ibctec.numberconverter.util.ConverterUtil.doThousandConversion;
import static com.ibctec.numberconverter.util.ConverterUtil.getIntValues;

/**
 * Converts a number of strings to English words of strings
 */
@Component
public class Converter {
    /**
     * Convert numbers to english
     * @param number eg 563562
     * @return english format
     */
    public String toWords(String number) {
        char[] numbers = number.toCharArray();
        int length = numbers.length;
        StringBuilder builder = new StringBuilder();
        switch (length) {
            case 1:
                builder = doOnesConversion(numbers, builder);
                break;
            case 2:
                builder = handleTwoDigits(numbers, builder);
                break;
            case 3:
                builder = handleThreeDigits(numbers, builder);
                break;
            case 4:
                builder = handleFourDigits(numbers, builder);
                break;
            case 5:
                builder = handleFiveDigits(numbers, builder);
                break;
            case 6:
                builder = handleSixDigits(numbers, builder);
                break;
            case 7:
                builder = handleSevenDigits(numbers, builder);
                break;
            case 8:
                builder = handleEightDigits(numbers, builder);
                break;
            case 9:
                builder = handleNineDigits(numbers, builder);
                break;
        }
        return builder.toString().trim();
    }

    private StringBuilder handleTwoDigits(char[] numbers, StringBuilder builder) {
        int[] intValues = getIntValues(numbers);
        builder = doTensConversion(builder, intValues[0], intValues[1]);
        return builder;
    }

    private StringBuilder handleThreeDigits(char[] numbers, StringBuilder builder) {
        int[] intValues;
        intValues = getIntValues(numbers);
        builder = doHundredsConversion(builder, intValues[1],
                intValues[2], intValues[0]);
        return builder;
    }

    private StringBuilder handleFourDigits(char[] numbers, StringBuilder builder) {
        int[] intValues;
        intValues = getIntValues(numbers);
        builder = doThousandConversion(builder, intValues[2],
                intValues[3], intValues[1], intValues[0]);
        return builder;
    }

    private StringBuilder handleFiveDigits(char[] numbers, StringBuilder builder) {
        int[] intValues;
        intValues = getIntValues(numbers);
        builder = doTensConversion(builder, intValues[0], intValues[1]);
        builder.append("Thousand ");
        builder = doHundredsConversion(builder, intValues[3],
                intValues[4], intValues[2]);
        return builder;
    }

    private StringBuilder handleSixDigits(char[] numbers, StringBuilder builder) {
        int[] intValues;
        intValues = getIntValues(numbers);
        builder = doHundredsConversion(builder, intValues[1], intValues[2], intValues[0]);
        builder.append("Thousand ");
        ConverterUtil.addAnd(builder, intValues[3], intValues[4], intValues[5]);
        builder = doHundredsConversion(builder, intValues[4], intValues[5], intValues[3]);
        return builder;
    }

    private StringBuilder handleSevenDigits(char[] numbers, StringBuilder builder) {
        int[] intValues;
        intValues = getIntValues(numbers);
        builder = new MillionConverter()
                .convert(intValues[0], intValues[1], intValues[2], intValues[3], builder);
        if (intValues[0] > 0 && (intValues[1] > 0
                || intValues[2] > 0
                || intValues[3] > 0)) {
            builder.append("Thousand ");
        }
        ConverterUtil.addAnd(builder, intValues[4], intValues[5], intValues[6]);
        builder = doHundredsConversion(builder, intValues[5], intValues[6], intValues[4]);
        return builder;
    }

    private StringBuilder handleEightDigits(char[] numbers, StringBuilder builder) {
        int[] intValues;
        intValues = getIntValues(numbers);
        builder = doTensConversion(builder, intValues[0], intValues[1]);
        builder.append("Million ");
        builder = doHundredsConversion(builder, intValues[3], intValues[4], intValues[2]);
        if (intValues[2] > 0 || intValues[3] > 0 || intValues[4] > 0) {
            builder.append("Thousand ");
        }
        ConverterUtil.addAnd(builder, intValues[5], intValues[6], intValues[7]);
        builder = doHundredsConversion(builder, intValues[6], intValues[7], intValues[5]);
        return builder;
    }

    private StringBuilder handleNineDigits(char[] numbers, StringBuilder builder) {
        int[] intValues;
        intValues = getIntValues(numbers);
        builder = doHundredsConversion(builder, intValues[1], intValues[2], intValues[0]);
        builder.append("Million ");
        builder = doHundredsConversion(builder, intValues[4], intValues[5], intValues[3]);
        if (intValues[3] > 0 || intValues[4] > 0 || intValues[5] > 0) {
            builder.append("Thousand ");
        }
        ConverterUtil.addAnd(builder, intValues[6], intValues[7], intValues[8]);
        builder = doHundredsConversion(builder, intValues[7], intValues[8], intValues[6]);
        return builder;
    }
}
