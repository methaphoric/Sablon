public class Logger {
    public static Logger instance;

    private Logger() {

    }

    public static Logger getInstance() {

        if (Logger.instance == null) {
            instance = new Logger();
        }
        return instance;
    }
}

