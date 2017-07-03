package jl223vy_assign4.stack;

import java.util.Iterator;

public class ArrayStack implements Stack{
	private int size=0;
	private int length=8;
	private Object[] values;
	
	public ArrayStack(){
		values=new Object[length];
	}
	
	public int size(){
		return size;
	}
	
	private void resize(){
		length=2*size;
		Object[] tmp=new Object[length];
		for(int i=0; i<size; i++){
			tmp[i]=values[i];
		}
		values=tmp;
	}
	
	public boolean isEmpty(){
		if(size==0)
			return true;
		else
			return false;
	}
	
	public void push(Object element){
		if(size==length)
			resize();
		if(size!=0){
			for(int i=size+1; i>0; i--){
				values[i]=values[i-1];
				}
		}
		size++;		
		values[0]=element;
	}
	
	public Object pop(){
		if(size==0)
			throw new IllegalStateException("Cannot pop with an empty stack.");
		else{
		Object t=values[0];
		for(int i=0; i<size-1; i++){
			values[i]=values[i+1];
		}
		size--;
		return t;
		}
	}
	
	public Object peek(){	
		if(size==0)
			throw new IllegalStateException("Cannot peek with an empty stack.");
		else
		    return values[0];
	}
	
	public Iterator<Object> iterator(){
		return new StackArrayIterator(values,size);
	}
}
