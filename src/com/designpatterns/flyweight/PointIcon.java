package com.designpatterns.flyweight;

public class PointIcon {
    private PointType pointType;
    private byte[] icon;

    public PointIcon(PointType pointType, byte[] icon) {
        this.pointType = pointType;
        this.icon = icon;
    }

    public PointType getPointType() {
        return pointType;
    }

    public void setPointType(PointType pointType) {
        this.pointType = pointType;
    }

    public byte[] getIcon() {
        return icon;
    }

    public void setIcon(byte[] icon) {
        this.icon = icon;
    }
}
