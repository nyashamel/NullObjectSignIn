package com.example.nullobjectsignin;

public class RegularUser implements User {
    private String username;

    public RegularUser(String username) {
        this.username = username;
    }

    @Override
    public void SignIn() {
        System.out.println("Regular user"+username+"signed in");
    }
}
