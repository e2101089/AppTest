package com.example;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Objects;
import java.util.Optional;

public class App {
    private static final DecimalFormat df2 = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.US));

    public int sum(int a, int b) {
        return a + b;
    }

    public String divide(double a, double b) {
        return Optional.of(b)
                .filter(val -> val != 0)
                .map(val -> df2.format(a / val))
                .orElse("NaN");
    }

    public String returnTwoChars(String str) {
        Objects.requireNonNull(str, "Input cannot be null");
        return str.length() >= 2 ? str.substring(0, 2) : str;
    }



    public Double div(Double a, Double b) {
        return Optional.ofNullable(a)
                .flatMap(valA -> Optional.ofNullable(b)
                        .filter(valB -> valB != 0)
                        .map(valB -> Double.valueOf(df2.format(valA / valB))))
                .orElse(null);
    }
}
