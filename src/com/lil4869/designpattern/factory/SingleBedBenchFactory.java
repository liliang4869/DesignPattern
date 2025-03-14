package com.lil4869.designpattern.factory;

import com.lil4869.designpattern.entity.bed.Bed;
import com.lil4869.designpattern.entity.bed.SingleBed;
import com.lil4869.designpattern.entity.sitthing.Bench;
import com.lil4869.designpattern.entity.sitthing.SitThing;



/**
 * author : lil
 * date   : 2025/3/13 16:25
 * desc   :
 */
public class SingleBedBenchFactory implements AbsFactory{
	@Override
	public Bed createBed() {
		return new SingleBed();
	}
 
    @Override
    public SitThing createSitThing() {
        return new Bench();
    }



	
}
