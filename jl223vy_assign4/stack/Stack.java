package jl223vy_assign4.stack;
import java.util.*;
public interface Stack {
	int size(); 			// Current stack size
	boolean isEmpty(); 		// true if stack is empty
	void push(Object element); 	// Add element at top of stack
	Object pop(); 		// Return and remove top element,
					// exception if stack is empty
	Object peek(); 		// Return (without removing) top element,
					// exception if stack is empty.
	Iterator<Object> iterator(); // Element iterator
}
