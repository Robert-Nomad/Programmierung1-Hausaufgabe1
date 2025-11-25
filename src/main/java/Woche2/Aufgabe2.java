package Woche2;

public class Aufgabe2 {

    public static void main(String[] args) {
        calculate(1, 2, "sum");
        calculate(1, 2, "difference");
        calculate(1, 2, "product");
        calculate(1, 2, "quotient");
    }

    /**
     * calculate nimmt drei Parameter an und f?hrt die math. operation an
     * @param numOne die erste Zahl
     * @param numTwo die zweite Zahl
     * @param operation dievon dem Nutzer gew?nschte operation (additation, multiplikation,division,subtraktion)
     */

    public static void calculate(int numOne, int numTwo, String operation) {
        if (operation.equals("sum")) {
            int sum = numOne + numTwo;
            System.out.println("sum " + sum);
            return;
        }
        if (operation.equals("difference")) {
            int difference = numOne - numTwo;
            System.out.println("difference " + difference);
            return;
        }
        if (operation.equals("product")) {
            int product = numOne * numTwo;
            System.out.println("product " + product);
            return;
        }
        if (operation.equals("quotient")) {
            int quotient = numOne / numTwo;
            System.out.println("quotient " + quotient);
            return;
        } else {
            System.out.println("unbekannte Operation");
        }
    }
}









