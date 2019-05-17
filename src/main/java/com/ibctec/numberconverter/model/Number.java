package com.ibctec.numberconverter.model;

public class Number {
    private  String number;
    private  String numberInWords;

    public String getNumber() {
        return number;
    }

    public String getNumberInWords() {
        return numberInWords;
    }

    public void setNumberInWords(String numberInWords) {
        this.numberInWords = numberInWords;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void convertNumber() {
        numberInWords = new Converter().toWords(number);
    }
}
