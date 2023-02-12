public class LogLevels {
    
    public static String message(String logLine) {
        String message = logLine.substring(logLine.indexOf(":") + 2);
        return message.trim();
    }

    public static String logLevel(String logLine) {
        String logLevel = logLine.substring(1, logLine.indexOf(":"));
        logLevel = logLevel.replaceAll("[\\[\\]]", "");
        return logLevel.toLowerCase();
    }

    public static String reformat(String logLine) {
        String message = message(logLine);
        String logLevel = logLevel(logLine);
        return message + " (" + logLevel + ")";
    }
}
