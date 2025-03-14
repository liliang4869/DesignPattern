package com.lil4869.designpattern.entity.sitthing;

/**
 * author : lil
 * date   : 2025/3/13 16:16
 * desc   :
 */
public class Chair implements SitThing{
    @Override
    public String getName() {
        return "Chair";
    }

    @Override
    public int getWidth() {
        return 50;
    }

    @Override
    public int getHeight() {
        return 40;
    }

    @Override
    public int getLength() {
        return 50;
    }
}
