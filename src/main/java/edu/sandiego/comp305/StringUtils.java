package edu.sandiego.comp305;

public final class StringUtils {
    public static String reverseString(final String input) {

        return new StringBuilder(input).reverse().toString();
    }
}