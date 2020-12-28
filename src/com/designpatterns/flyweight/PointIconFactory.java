package com.designpatterns.flyweight;

import java.util.HashMap;
import java.util.Map;

public class PointIconFactory {
    private Map<PointType, PointIcon> pointIcons = new HashMap<>();

    public PointIcon getPointIcon(PointType type) {
        if (!pointIcons.containsKey(type)) {
            var pointIcon = new PointIcon(type, null);
            pointIcons.put(type, pointIcon);
        }

        return pointIcons.get(type);
    }
}
