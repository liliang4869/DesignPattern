package com.lil4869.designpattern.entity.sitthing;

/**
 * author : lil
 * date   : 2025/3/13 16:17
 * desc   :
 */
public class Bench implements SitThing{
    @Override
    public String getName() {
        return "Bench";
    }

    @Override
    public int getWidth() {
        return 100;
    }

    @Override
    public int getHeight() {
        return 30;
    }

    @Override
    public int getLength() {
        return 30;
    }
}
