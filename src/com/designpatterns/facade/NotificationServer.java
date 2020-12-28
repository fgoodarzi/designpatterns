package com.designpatterns.facade;

public class NotificationServer {
    public Connection connect() {
        return new Connection();
    }

    public AuthToken authenticate(String appId, String key) {
        return new AuthToken();
    }

    public void send(Connection conn, AuthToken authToken){
        System.out.printf("Sending message");
    }
}
