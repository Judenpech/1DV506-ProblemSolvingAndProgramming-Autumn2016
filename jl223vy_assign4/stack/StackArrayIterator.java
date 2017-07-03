package jl223vy_assign4.stack;

import java.util.Iterator;

public class StackArrayIterator implements Iterator<Object>{
	private int nextElement=0;      //first element at start
	private final Object[] elements;
	private final int max;             //final element in array
	
	public StackArrayIterator(Object[] values,int maxIndex){
		elements=values;
		max=maxIndex;
	}

	public boolean hasNext(){
		return nextElement<max;
	}

	public Object next(){
		return elements[nextElement++];  //Pick out and increase
	}		
}
