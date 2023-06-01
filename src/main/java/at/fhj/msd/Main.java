package at.fhj.msd;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Main {
    private static final Logger logger = LogManager.getLogger();
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        System.out.println("Add: "+calculator.add(5,5));
        logger.info("Add: "+calculator.add(5,5));
        logger.error("Add: "+calculator.add(5,5));
        System.out.println("Minus: "+calculator.minus(5,5));
        System.out.println("Multiply: "+calculator.multiply(5,5));
        logger.info("Multiply: "+calculator.multiply(5,5));
        logger.error("Multiply: "+calculator.multiply(5,5));
        System.out.println("Divide: "+calculator.divide(5,5));


    }
}
