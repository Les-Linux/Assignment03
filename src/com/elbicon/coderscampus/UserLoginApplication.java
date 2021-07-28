package com.elbicon.coderscampus;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.stream.Stream;

public class UserLoginApplication {
    public static void main(String[] args) {
        BufferedReader fileReader = null;
        UserService userService = new UserService();
        User[] userCredentials;
        long lineCount;
        try {
            fileReader = new BufferedReader(new FileReader("./resources/data.txt"));
            Stream<String> users = Files.lines(Path.of("./resources/data.txt"), StandardCharsets.UTF_8);
            lineCount = users.count();
            userCredentials = new User[(int) lineCount]; // using lineCount to define the upper array boundary for User objects
            String userLine = "";

            int i = 0;
            while ((userLine = fileReader.readLine()) != null) {
                if (i < lineCount) {
                    userCredentials[i] = userService.getUser(userLine);
                    i++;
                }
            }


            int loginCount = 0;
            while (loginCount < 5) {
                UserInputService.UserInputPrompt();
                //System.out.println("input-name: " + UserInputService.getUsername() + " Password= " + UserInputService.getPassword());
                for (User userCredential : userCredentials) {
                    if (userCredential.getUsername().equalsIgnoreCase(UserInputService.getUsername())
                            && userCredential.getPassword().equals(UserInputService.getPassword())) {
                        System.out.println("Welcome " + userCredential.getName());
                        System.exit(0);
                    }
                }
                loginCount++;
                if (loginCount <= 4) {
                    System.out.println("Invalid login, please try again.");
                } else {
                    System.out.println("Too many failed login attempts, you are now locked out.");
                    System.exit(0);
                }

            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                fileReader.close();
                UserInputService.CloseScanner();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

}
