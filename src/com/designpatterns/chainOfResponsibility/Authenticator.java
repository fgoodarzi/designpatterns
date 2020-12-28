package com.designpatterns.chainOfResponsibility;

public class Authenticator extends Handler {

    public Authenticator(Handler next) {
        super(next);
    }

    @Override
    public boolean doHandle(HttpRequest httpRequest) {
        System.out.println("Authenticating user...");
        if (
                httpRequest.getUsername() == "farshad"
                && httpRequest.getPassword() == "123"
        )
            return false;
        return true;
    }
}
