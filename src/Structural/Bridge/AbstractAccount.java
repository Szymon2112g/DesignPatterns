package Structural.Bridge;

public class AbstractAccount {
    private Logger logger = Logger.info();

    public void setLogger(Logger logger) {
        this.logger = logger;
    }

    protected void operate(String message, boolean result) {
        logger.log(message + " result " + result);
    }
}
