public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        System.out.println("the following result is Info:");
        loggerChain.logMessage(AbstractLogger.INFO,
                "This is an information.");

        System.out.println("the following result is Debug:");
        loggerChain.logMessage(AbstractLogger.DEBUG,
                "This is an debug level information.");

        System.out.println("the following result is Error:");
        loggerChain.logMessage(AbstractLogger.ERROR,
                "This is an error information.");
    }
}