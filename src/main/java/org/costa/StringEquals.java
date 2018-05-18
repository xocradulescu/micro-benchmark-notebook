package org.costa;

public class StringEquals {

    public static boolean simpleEquals(String stringA, String stringB) {
        return stringA.equals(stringB);
    }

    public static boolean shortCircuitEquals(String stringA, String stringB) {
        if (stringA.length() != stringB.length()) {
            return false;
        }
        return stringA.equals(stringB);
    }
}
