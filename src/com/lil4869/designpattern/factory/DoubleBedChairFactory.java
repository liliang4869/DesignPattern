package com.lil4869.designpattern.factory;

import com.lil4869.designpattern.entity.bed.Bed;
import com.lil4869.designpattern.entity.bed.DoubleBed;
import com.lil4869.designpattern.entity.sitthing.Chair;
import com.lil4869.designpattern.entity.sitthing.SitThing;
/**
 * author : lil
 * date   : 2025/3/13 16:24
 * desc   :
 */
public class DoubleBedChairFactory implements AbsFactory{
 

  

	@Override
	public Bed createBed() {
		return new DoubleBed();
	}

	@Override
	public SitThing createSitThing() {
		return new Chair();
	}
}
