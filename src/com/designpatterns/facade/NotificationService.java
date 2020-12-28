package com.designpatterns.facade;

public class NotificationService {
    private NotificationServer notificationServer;

    public NotificationService() {
        this.notificationServer = new NotificationServer();
    }

    public void send(String appId, String key) {
        var conn = notificationServer.connect();
        var authToken = notificationServer.authenticate(appId, key);
        notificationServer.send(conn, authToken);
        conn.disconnect();
    }
}
