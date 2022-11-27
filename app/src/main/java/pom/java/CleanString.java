package pom.java;

public class CleanString implements ReversedString {


    public static String removeSpecialCharsAndSpace(String unprocessedString) {
        return unprocessedString.replaceAll("[^a-zA-Z0-9]", "");
    }

    public static String lowerCase(String unprocessedString) {
        return unprocessedString.toLowerCase();
    }
}
