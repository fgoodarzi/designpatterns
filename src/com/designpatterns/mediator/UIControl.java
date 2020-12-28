package com.designpatterns.mediator;

import java.util.HashMap;
import java.util.Map;

public abstract class UIControl {
    private Map<EventType, EventHandler> eventHandlers = new HashMap<>();

    public void addEventHandler(EventType eventType, EventHandler eventHandler) {
        eventHandlers.put(eventType, eventHandler);
    }

    protected void notifyEventHandler(EventType eventType) {
        var eventHandler = eventHandlers.get(eventType);
        if (eventHandler != null)
            eventHandler.handle();
    }
}
