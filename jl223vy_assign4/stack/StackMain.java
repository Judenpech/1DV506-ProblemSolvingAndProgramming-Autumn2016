package jl223vy_assign4.stack;
import java.util.*;
public class StackMain{
	public static void main(String[] args){
		Stack stk=new ArrayStack();
		
		stk.push("Sweden");
		stk.push(35243);
		stk.push("Växjö");
		
		System.out.println("Elements of the stack:");
		Iterator<Object> it=stk.iterator();
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		System.out.println("\nPop operation: "+stk.pop());
		System.out.println("Peek operation: "+stk.peek());	
		
		System.out.println("\nElements of the stack after pop and peek operation:");
		Iterator<Object> itr=stk.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}
	}
}
