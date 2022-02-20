package lab7;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.println ("Введите первую дробь, используя /:");
        String fraction1 = in.nextLine();
        Fraction drob1 = new Fraction (fraction1);

        System.out.println ("Введите вторую дробь, используя /:");
        String fraction2 = in.nextLine();
        Fraction drob2 = new Fraction (fraction2);

        System.out.println ("Введите нужное действие с дробями - +, -, *, :");
        String action = in.nextLine();

        if (action.equals("+")) {
            System.out.print ("Результат сложения: ");
            drob1.plus(drob2);
        }
        else if (action.equals("-")) {
            System.out.print ("Результат вычитания: ");
            drob1.minus(drob2);
        }
        else if (action.equals("*")) {
            System.out.print ("Результат умножения: ");
            drob1.multiplication(drob2);
        }
        else if (action.equals(":")) {
            System.out.print ("Результат деления: ");
            drob1.divisor(drob2);
        }
        else {
            System.out.print ("Ошибка! Вводите только приведенные знаки: +, -, *, :");
        }
    }
}
