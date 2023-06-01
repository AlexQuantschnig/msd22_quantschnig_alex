package at.fhj.msd;

public class Calculator {

    public double minus(double number1,double number2){
        Main.logger.debug("minus method called with parameters {} and {}",number1,number2);
        return number1 - number2;
    }

    public double multiply(double number1,double number2){
        Main.logger.debug("multiply method called with parameters {} and {}",number1,number2);
        return number1 * number2;
    }

    public double divide(double number1,double number2){
        if(number2 == 0 || number1 == 0){
            Main.logger.error("divide method called with parameters {} and {}",number1,number2);
            throw new ArithmeticException("Division by zero is not allowed");
        }
        Main.logger.debug("divide method called with parameters {} and {}",number1,number2);

        return number1/number2;
    }
    public double add(double number1,double number2){
        Main.logger.debug("add method called with parameters {} and {}",number1,number2);
        return number1 + number2;
    }
    public double factorial(double number1){
        Main.logger.debug("factorial method called with parameter {}",number1);
        if(number1 == 0){
            return 1;
        }
        else if (number1 < 0){
            return 0;
        }else {
            return number1 * factorial(number1-1);
        }
    }
}
