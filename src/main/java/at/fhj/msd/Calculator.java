package at.fhj.msd;

/**
 * Calculator class which provides methods for basic mathematical operations
 * like add, subtract, multiply, divide and factorial
 *
 * @author Alex Quantschnig
 *
 * last change: 15.06.2023
 */
public class Calculator {

    /**
     * This method subtracts number2 from number1
     *
     * @param number1 the number to subtract from
     * @param number2 the number to subtract
     * @return the result of the subtraction
     */
    public double minus(double number1,double number2){
        Main.logger.debug("minus method called with parameters {} and {}",number1,number2);
        return number1 - number2;
    }

    /**
     * This method multiplies number1 with number2
     *
     * @param number1 the first number to multiply
     * @param number2 the second number to multiply
     * @return the result of the multiplication
     */
    public double multiply(double number1,double number2){
        Main.logger.debug("multiply method called with parameters {} and {}",number1,number2);
        return number1 * number2;
    }

    /**
     * This method divides number1 by number2
     *
     * @param number1 the number to divide from
     * @param number2 the number to divide by
     * @throws ArithmeticException if number1 is 0 or number2 is 0
     * @return the result of the division
     */
    public double divide(double number1,double number2){
        if(number2 == 0 || number1 == 0){
            Main.logger.error("divide method called with parameters {} and {}",number1,number2);
            throw new ArithmeticException("Division by zero is not allowed");
        }
        Main.logger.debug("divide method called with parameters {} and {}",number1,number2);

        return number1/number2;
    }
    /**
     * This method adds number1 and number2
     *
     * @param number1 the first number to add
     * @param number2 the second number to add
     * @return the result of the addition
     */
    public double add(double number1,double number2){
        Main.logger.debug("add method called with parameters {} and {}",number1,number2);
        return number1 + number2;
    }

    /**
     * This method calculates the factorial of number1
     *
     * @param number1 the number to calculate the factorial of
     * @return the result of the factorial
     */
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
