/**
 * A class which reads user credentials from CLI
 */
package com.elbicon.coderscampus;

import java.util.Scanner;

public class UserInput {
    private static Scanner scanner = new Scanner(System.in);
    private static String username;
    private static String password;

    public String[] GetUserCredentials() {
        String[] userCredentials = new String[2];
        try {
            System.out.println("Enter Username");
            username = scanner.nextLine().trim();
            System.out.println("Enter Password");
            password = scanner.nextLine();

            userCredentials[0] = username;
            userCredentials[1] = password;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return userCredentials;
    }

    public void CloseScanner() {
        scanner.close();
    }
}