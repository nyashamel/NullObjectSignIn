package com.example.nullobjectsignin;

public class NullUser implements User{
    @Override
    public void SignIn() {
        System.out.println("Null user:Sign-in not applicable");
    }
}
