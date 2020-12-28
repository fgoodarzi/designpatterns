package com.designpatterns.adapter;

import com.designpatterns.adapter.avafilter.Caramel;

public class CaramelAdapter extends Caramel implements Filter {
    @Override
    public void apply(Image image) {
        init();
        filter(image);
    }
}
