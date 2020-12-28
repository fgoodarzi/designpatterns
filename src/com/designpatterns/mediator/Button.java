package com.designpatterns.mediator;

public class Button extends UIControl {
    private boolean isEnabled;

    public boolean isEnabled() {
        return isEnabled;
    }

    public void setEnabled(boolean enabled) {
        isEnabled = enabled;
        System.out.println("Button is " + (enabled ? "enabled" : "disabled"));
        notifyEventHandler(EventType.DISABLED);
    }

    public void click() {
        System.out.println("button clicked");
        notifyEventHandler(EventType.CLICK);
    }
}
