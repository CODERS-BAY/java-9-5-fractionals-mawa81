package at.codersbay.datastructures;

import java.util.Objects;

/**
 * A Fractional is a class that consists of a numerator and a denominator
 * e.g.: 1/2, 1/3, 24/37, ..
 */
public class Fractional {

    private Integer numerator;
    private Integer denominator;

    public Fractional(Integer numerator, Integer denominator) {
        // TODO implement to fix tests in FractionalTest1
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public Integer getNumerator() {
        // TODO implement to fix tests in FractionalTest1
        return numerator;
    }

    public Integer getDenominator() {
        // TODO implement to fix tests in FractionalTest1
        return denominator;
    }

    public Float asFloat() {
        // TODO implement to fix tests in FractionalTest2
        return Float.valueOf(numerator / denominator);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Fractional that = (Fractional) o;
        return Objects.equals(numerator, that.numerator) &&
                Objects.equals(denominator, that.denominator);
    }

    public Fractional multiply(Fractional other) {
        // TODO implement to fix tests in FractionalTest4
        Integer myNumerator = numerator * other.getNumerator();
        Integer myDenominator = denominator * other.getDenominator();
        return new Fractional(myNumerator, myDenominator);
    }

    public Fractional multiply(Integer other) {
        // TODO implement to fix tests in FractionalTest4
        Integer myNumerator = numerator * other;
        return new Fractional(myNumerator, denominator);
    }

    public Fractional divide(Fractional other) {
        // TODO implement to fix tests in FractionalTest5
        Integer myNumerator = numerator * other.getDenominator();
        Integer myDenominator = denominator * other.getNumerator();
        return new Fractional(myNumerator, myDenominator);
    }

    public Fractional divide(Integer other) {
        // TODO implement to fix tests in FractionalTest5
        Integer myDenominator = denominator * other;
        return new Fractional(numerator, myDenominator);
    }

    public Fractional add(Fractional other) {
        // TODO implement to fix tests in FractionalTest6
        Integer myNumerator = (numerator * other.getDenominator()) + (other.getNumerator() * denominator);
        Integer myDenominator = denominator * other.getDenominator();
        return new Fractional(myNumerator, myDenominator);
    }

    public Fractional add(Integer other) {
        // TODO implement to fix tests in FractionalTest6
        Integer myNumerator = numerator + (other * denominator);
        Integer myDenominator = denominator;
        return new Fractional(myNumerator, myDenominator);
    }

    public Fractional subtract(Fractional other) {
        // TODO implement to fix tests in FractionalTest7
        Integer myNumerator = (numerator * other.getDenominator()) - (other.getNumerator() * denominator);
        Integer myDenominator = denominator * other.getDenominator();
        return new Fractional(myNumerator, myDenominator);
    }

    public Fractional subtract(Integer other) {
        // TODO implement to fix tests in FractionalTest7
        Integer myNumerator = numerator - (other * denominator);
        Integer myDenominator = denominator;
        return new Fractional(myNumerator, myDenominator);
    }

}