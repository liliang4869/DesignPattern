package com.lil4869.designpattern.factory;

import com.lil4869.designpattern.entity.bed.Bed;
import com.lil4869.designpattern.entity.sitthing.SitThing;

/**
 * author : lil
 * date   : 2025/3/13 16:08
 * desc   :
 */
public interface AbsFactory {
    Bed createBed();
    SitThing    createSitThing();
}
