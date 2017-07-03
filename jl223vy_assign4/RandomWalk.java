package jl223vy_assign4;
import java.util.*;
public class RandomWalk {
	private int x,y;
	private int max,size;
	private int takenSteps=0;
	
	public RandomWalk(int max, int size){
		this.max=max;
		this.size=size;
		x=0;
		y=0;
	}
	
    public String toString(){
		return takenSteps + " ("+x+","+y+")";
	}
    
    public void takeStep(){
    	Random rd=new Random();
    	int rdStep=rd.nextInt(4);
    	switch(rdStep){
    	case 0: x--; break; 
    	case 1: x++; break; 
    	case 2: y--; break; 
    	case 3: y++; break; 
    	}
    	takenSteps++;
    }
    
    public boolean moreSteps(){ return takenSteps<max; }
    
    public boolean inBounds(){
    	return Math.abs(x)<size && Math.abs(y)<size;
    }
    
    public void walk(){
    	while(moreSteps() && inBounds()){
    		takeStep();
    	}
    }

}
