package utilities;

import java.util.EmptyStackException;

/**
* StackADT.java
*
* @author Joao Radicchi, Diogo Carbone and Fabiano Miranda
* @version 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of a Stack for the Assignment 2 first submission. 
*/
public interface StackADT<E> {

	/**
	 * Pushes an item onto the top of the stack.
	 * @param item is the item to be added on the top.
	 * @return returns the item added.
	 * Stack will be modified as a post-condition.
	 */
	E push(E item);
	
	/**
	 * Removes the object at the top of the stack.
	 * @return the object that was popped.
	 * @throws EmptyStackExpection if the stack is empty
	 * Stack will be modified as a post-condition.
	 */
	E pop() throws EmptyStackException;
	
	/**
	 * Looks at the object at the top of the stack.
	 * @return the top element of the stack.
	 * @throws EmptyStackExpection if the stack is empty
	 * Stack won't be modified as a post-condition.
	 */
	E peek() throws EmptyStackException ;
	
	/**
	 * 
	 * @return true if the stack has no elements. Otherwise, false if the Stack has at least one element.
	 * Stack won't be modified as a post-condition.
	 */
	boolean isEmpty();
	
	/**
	 * 
	 * @param obj that will be searched in the stack.
	 * @return -1 if the object is not found. Otherwise, the distance from the top of the stack of the occurrence nearest the top of the stack;
	 * Stack won't be modified as a post-condition.
	 */
	int search(Object obj);
	
	/**
	 * 
	 * @return  the number of components in the stack. 0 if the stack is empty.
	 * Stack won't be modified as a post-condition.
	 */
	int size();
	

	
}
