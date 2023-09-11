package com.example.nullobjectsignin;

public class Main {
    public static void main(String[] args) {
        // Create a client with a regular user
        User regularUser = new RegularUser("JohnDoe");
        Client clientWithRegularUser = new Client(regularUser);
        clientWithRegularUser.performSignIn();

        // Create a client with a null user
        User nullUser = new NullUser();
        Client clientWithNullUser = new Client(nullUser);
        clientWithNullUser.performSignIn();
    }
}

