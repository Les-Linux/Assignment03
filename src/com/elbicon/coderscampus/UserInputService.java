/**
 * A class which gets user credentials from UserInput object
 * and sets, returns user credentials
 */
package com.elbicon.coderscampus;

public class UserInputService {
    static private UserInput USER_INPUT = new UserInput();
    static private String USERNAME;
    static private String PASSWORD;
    static private String USER;
    static private String[] USER_CREDENTIALS = new String[2];

    public static void UserInputPrompt() {
        USER_CREDENTIALS = USER_INPUT.GetUserCredentials();
        setUsername();
        setPassword();
    }

    private static void setUsername() {
        USERNAME = USER_CREDENTIALS[0];
    }

    public static String getUsername() {
        return USERNAME;
    }

    private static void setPassword() {
        PASSWORD = USER_CREDENTIALS[1];
    }

    public static String getPassword() {
        return PASSWORD;
    }

    public static void CloseScanner() {
        USER_INPUT.CloseScanner();
    }

}
