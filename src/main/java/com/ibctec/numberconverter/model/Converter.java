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
                int[] intValues = getIntValues(numbers);
                builder = doTensConversion(builder, intValues[0], intValues[1]);
                break;
            case 3:
                intValues = getIntValues(numbers);
                builder = doHundredsConversion(builder, intValues[1],
                        intValues[2], intValues[0]);
                break;
            case 4:
                intValues = getIntValues(numbers);
                builder = doThousandConversion(builder, intValues[2],
                        intValues[3], intValues[1], intValues[0]);
                break;
            case 5:
                intValues = getIntValues(numbers);
                builder = doTensConversion(builder, intValues[0], intValues[1]);
                builder.append("Thousand ");
                builder = doHundredsConversion(builder, intValues[3],
                        intValues[4], intValues[2]);
                break;
            case 6:
                intValues = getIntValues(numbers);
                builder = doHundredsConversion(builder, intValues[1], intValues[2], intValues[0]);
                builder.append("Thousand ");
                ConverterUtil.addAnd(builder, intValues[3], intValues[4], intValues[5]);
                builder = doHundredsConversion(builder, intValues[4], intValues[5], intValues[3]);
                break;
            case 7:
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
                break;
            case 8:
                intValues = getIntValues(numbers);
                builder = doTensConversion(builder, intValues[0], intValues[1]);
                builder.append("Million ");
                builder = doHundredsConversion(builder, intValues[3], intValues[4], intValues[2]);
                if (intValues[2] > 0 || intValues[3] > 0 || intValues[4] > 0) {
                    builder.append("Thousand ");
                }
                ConverterUtil.addAnd(builder, intValues[5], intValues[6], intValues[7]);
                builder = doHundredsConversion(builder, intValues[6], intValues[7], intValues[5]);
                break;
            case 9:
                intValues = getIntValues(numbers);
                builder = doHundredsConversion(builder, intValues[1], intValues[2], intValues[0]);
                builder.append("Million ");
                builder = doHundredsConversion(builder, intValues[4], intValues[5], intValues[3]);
                if (intValues[3] > 0 || intValues[4] > 0 || intValues[5] > 0) {
                    builder.append("Thousand ");
                }
                ConverterUtil.addAnd(builder, intValues[6], intValues[7], intValues[8]);
                builder = doHundredsConversion(builder, intValues[7], intValues[8], intValues[6]);
                break;
        }
        return builder.toString().trim();
    }
}
