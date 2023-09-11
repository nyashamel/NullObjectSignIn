package com.example.nullobjectsignin;

public class Client {
    private User user;

    public Client(User user) {
        this.user = user;
    }
    public void performSignIn(){
        user.SignIn();
    }
}
