package lab7;

import static java.lang.Math.abs;

public class Fraction {
    public int numerator;
    public int denominator;

    public Fraction(String f) {
        int slashIndex = f.indexOf("/");
        if (slashIndex != -1) {
            int limit = f.length();
            numerator = Integer.parseInt(f.substring(0, slashIndex));
            denominator = Integer.parseInt(f.substring(slashIndex + 1));
        } else {
            numerator = Integer.parseInt(f);
            denominator = 1;
        }
        simplify();
        reduction();
    }

    public void print () {
        if (denominator == 1) {
            System.out.println(numerator);
        } else if (numerator == 0) {
            System.out.println(0);
        } else if (abs(numerator) == abs(denominator)) {
            System.out.println(numerator / denominator);
        } else if (abs(numerator) > abs(denominator)) {
            int result = numerator / denominator;
            int newNominator = numerator % denominator;
            if (newNominator == 0) {
                System.out.println(result);
            } else {
                System.out.println(result + " цел." + abs(newNominator) + "/" + abs(denominator));
            }
        } else {
            System.out.println(numerator + "/" + denominator);
        }
    }

    public void reduction () {
        if ((numerator == 0 && denominator == 0) || (denominator == 0)) {
            System.out.println("Ошибка");
            System.exit(0);
        }
        if (numerator < 0 && denominator < 0) {
            numerator = numerator * (-1);
            denominator = denominator * (-1);
        }
        if (denominator < 0) {
            denominator = denominator * (-1);
            numerator = numerator * (-1);
        }
    }

    public void simplify () {
        int divElement = 1;
        for (int i = denominator; i >= 1; i--) {
            if (numerator % i == 0 && denominator % i == 0) {
                divElement = i;
                break;
            }
        }
        numerator = numerator / divElement;
        denominator = denominator / divElement;
    }

    public void plus (Fraction f){
        this.numerator = numerator * (f.denominator) + f.numerator * (denominator);
        this.denominator = denominator * f.denominator;
        simplify();
        reduction();
        print();
    }

    public void minus (Fraction f){
        this.numerator = numerator * (f.denominator) - f.numerator * (denominator);
        this.denominator = denominator * f.denominator;
        simplify();
        reduction();
        print();
    }

    public void multiplication (Fraction f){
        this.numerator = numerator * f.numerator;
        this.denominator = denominator * f.denominator;
        simplify();
        reduction();
        print();
    }

    public void divisor (Fraction f){
        this.numerator = numerator * f.denominator;
        this.denominator = denominator * f.numerator;
        simplify();
        reduction();
        print();
    }
}

