package com.ibctec.numberconverter.model;

import com.ibctec.numberconverter.util.ConverterUtil;
import org.springframework.stereotype.Component;

import static com.ibctec.numberconverter.util.ConverterUtil.doHundredsConversion;
import static com.ibctec.numberconverter.util.ConverterUtil.doOnesConversion;
import static com.ibctec.numberconverter.util.ConverterUtil.doTensConversion;
import static com.ibctec.numberconverter.util.ConverterUtil.doThousandConversion;
import static com.ibctec.numberconverter.util.ConverterUtil.getIntValue;

@Component
public class Converter {

    public String toWords(String number) {
        char[] numbers = number.toCharArray();
        int length = numbers.length;
        StringBuilder builder = new StringBuilder();
        switch (length) {
            case 1:
                builder = doOnesConversion(numbers, builder);
                break;
            case 2:
                int ten = getIntValue(0, numbers);
                int one = getIntValue(1, numbers);
                builder = doTensConversion(builder, ten, one);
                break;
            case 3:
                int hundred = getIntValue(0, numbers);
                ten = getIntValue(1, numbers);
                one = getIntValue(2, numbers);
                builder = doHundredsConversion(builder, ten, one, hundred);
                break;
            case 4:
                int thousand = getIntValue(0, numbers);
                hundred = getIntValue(1, numbers);
                ten = getIntValue(2, numbers);
                one = getIntValue(3, numbers);

                builder = doThousandConversion(builder, ten, one, hundred, thousand);
                break;
            case 5:
                int tensThousand = getIntValue(0, numbers);
                int onsThousand = getIntValue(1, numbers);
                builder = doTensConversion(builder, tensThousand, onsThousand);
                builder.append("Thousand ");
                hundred = getIntValue(2, numbers);
                ten = getIntValue(3, numbers);
                one = getIntValue(4, numbers);

                builder = doHundredsConversion(builder, ten, one, hundred);
                break;
            case 6:
                int hundredThousand = getIntValue(0, numbers);
                tensThousand = getIntValue(1, numbers);
                onsThousand = getIntValue(2, numbers);
                hundred = getIntValue(3, numbers);
                ten = getIntValue(4, numbers);
                one = getIntValue(5, numbers);

                builder = doHundredsConversion(builder, tensThousand, onsThousand, hundredThousand);
                builder.append("Thousand ");
                ConverterUtil.addAnd(builder, hundred, ten, one);
                builder = doHundredsConversion(builder, ten, one, hundred);
                break;
            case 7:
                int million = getIntValue(0, numbers);
                hundredThousand = getIntValue(1, numbers);
                tensThousand = getIntValue(2, numbers);
                onsThousand = getIntValue(3, numbers);
                hundred = getIntValue(4, numbers);
                ten = getIntValue(5, numbers);
                one = getIntValue(6, numbers);
                builder = new MillionConverter()
                        .convert(million, hundredThousand, tensThousand, onsThousand, builder);
                if (million > 0 && (hundredThousand > 0 || tensThousand > 0 || onsThousand > 0)) {
                    builder.append("Thousand ");
                }
                ConverterUtil.addAnd(builder, hundred, ten, one);
                builder = doHundredsConversion(builder, ten, one, hundred);
                break;
            case 8:
                int tensMillion = getIntValue(0, numbers);
                int onesMillion = getIntValue(1, numbers);
                hundredThousand = getIntValue(2, numbers);
                tensThousand = getIntValue(3, numbers);
                onsThousand = getIntValue(4, numbers);
                hundred = getIntValue(5, numbers);
                ten = getIntValue(6, numbers);
                one = getIntValue(7, numbers);

                builder = doTensConversion(builder, tensMillion, onesMillion);
                builder.append("Million ");

                builder = doHundredsConversion(builder, tensThousand, onsThousand, hundredThousand);
                if (hundredThousand > 0 || tensThousand > 0 || onsThousand > 0) {
                    builder.append("Thousand ");
                }

                ConverterUtil.addAnd(builder, hundred, ten, one);
                builder = doHundredsConversion(builder, ten, one, hundred);
                break;
            case 9:
                int hundredMillion = getIntValue(0, numbers);
                tensMillion = getIntValue(1, numbers);
                onesMillion = getIntValue(2, numbers);
                hundredThousand = getIntValue(3, numbers);
                tensThousand = getIntValue(4, numbers);
                onsThousand = getIntValue(5, numbers);
                hundred = getIntValue(6, numbers);
                ten = getIntValue(7, numbers);
                one = getIntValue(8, numbers);

                builder = doHundredsConversion(builder, tensMillion, onesMillion, hundredMillion);
                builder.append("Million ");
                builder = doHundredsConversion(builder, tensThousand, onsThousand, hundredThousand);
                if (hundredThousand > 0 || tensThousand > 0 || onsThousand > 0) {
                    builder.append("Thousand ");
                }

                ConverterUtil.addAnd(builder, hundred, ten, one);
                builder = doHundredsConversion(builder, ten, one, hundred);
                break;
        }
        return builder.toString().trim();
    }
}
