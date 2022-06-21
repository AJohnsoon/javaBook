package chapter08.withOop.utils;

public class CurrencyConverter {
    private static final double IOF = 0.06;

    public static double ConvertAmountToReal(double dollarValue, double boughtValue) {
        double convert = boughtValue * dollarValue + (dollarValue * boughtValue * IOF);
        return convert;
    }
}