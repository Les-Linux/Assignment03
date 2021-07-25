/**
 * A class which reads user credentials from CLI
 */
package com.elbicon.coderscampus;

import java.util.Scanner;

public class UserInput {
    private static Scanner SCANNER = new Scanner(System.in);
    private static String USERNAME;
    private static String PASSWORD;

    public String[] GetUserCredentials() {
        String[] userCredentials = new String[2];
        try {
            System.out.println("Enter Username");
            USERNAME = SCANNER.nextLine().trim();
            System.out.println("Enter Password");
            PASSWORD = SCANNER.nextLine();

            userCredentials[0] = USERNAME;
            userCredentials[1] = PASSWORD;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userCredentials;
    }

    public void CloseScanner() {
        SCANNER.close();
    }
}