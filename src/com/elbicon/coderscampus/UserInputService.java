package com.elbicon.coderscampus;

public class UserInputService {
    static private UserInput userInput = new UserInput();
    static private String username;
    static private String password;
    static private String user;
    static private String[] userCredentials = new String[2];

    public static void UserInputPrompt() {
        userCredentials = userInput.GetUserCredentials();
        setUsername();
        setPassword();
    }
    private static void setUsername(){
        username = userCredentials[0];
    }
    public static String getUsername(){
        return username;
    }
    private static void setPassword(){
        password = userCredentials[1];
    }
    public static String getPassword(){
        return password;
    }
    public static void CloseScanner(){
        userInput.CloseScanner();
    }

}
