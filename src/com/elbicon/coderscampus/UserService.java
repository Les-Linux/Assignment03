package com.elbicon.coderscampus;

public class UserService {
    private String username;
    private String password;
    private String name;
    String[] userInfo;
    public User getUser(String userCredential) {
        User user = new User();

        try {
            this.userInfo = userCredential.split(",");
            this.username = userInfo[0];
            this.password = userInfo[1];
            this.name = userInfo[2];

            user.setUsername(this.username);
            user.setPassword(this.password);
            user.setName(this.name);

        } catch (Exception e) {
            e.printStackTrace();
        }
        return user;
    }
}
