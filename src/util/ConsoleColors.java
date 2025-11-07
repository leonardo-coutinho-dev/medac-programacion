package util;

public class ConsoleColors {
    public static final String RESET = "\u001B[0m";
    public static final String BOLD = "\u001B[1m";
    public static final String BLACK_BG = "\u001B[40m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_RED = "\u001B[91m";

    // Convenience shortcut for your specific style
    public static String success(String text) {
        return BOLD + BLACK_BG + BRIGHT_GREEN + text + RESET;
    };

    public static String error(String text) {
        return BOLD + BLACK_BG + BRIGHT_RED + text + RESET;
    };
};
