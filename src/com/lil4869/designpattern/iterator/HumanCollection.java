package com.lil4869.designpattern.iterator;

import java.util.ArrayList;
import java.util.List;

import com.lil4869.designpattern.entity.creature.Human;

public class HumanCollection {
	private List<Human>humanList=new ArrayList();;
	public Iterator<Human> getIterator() {
		return new HumanIterator();
	}
	
	public void addHuman(Human human) {
		humanList.add(human);
	}
	
	class HumanIterator implements Iterator<Human>{
			private int position=0;
	
			@Override
			public boolean hasNext() {
				return position<humanList.size();
			}
	
			@Override
			public Human next() {
				Human human=humanList.get(position);
				position++;
				return human;
			}
			
		}
}
