package at.fhj.msd;

public class Main {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Add: "+calculator.add(5,5));
        System.out.println("Minus: "+calculator.minus(5,5));
        System.out.println("Multiply: "+calculator.multiply(5,5));
        System.out.println("Divide: "+calculator.divide(5,5));
    }
}
