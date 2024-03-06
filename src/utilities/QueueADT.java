package utilities;


/**
* QueueADT.java
*
* @author Joao Radicchi, Diogo Carbone and Fabiano Miranda
* @version 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of a Queue for the Assignment 2 first submission. 
* Head is the first element inserted and first to be removed (LIFO).
*/

public interface QueueADT<E> {
	
	/**
	 * Add an item onto the head of the queue.
	 * @param item is the item to be added on the head of the Queue.
	 * @return returns the item added.
	 * Queue will be modified as a post-condition.
	 */
	E add(E item);
	
	/**
	 * Removes the object at head of the queue.
	 * @return the object that was removed. If empty, it returns null.
	 * Queue will be modified as a post-condition.
	 */
	E remove() ;
	
	/**
	 * Looks at the object at the head of queue.
	 * @return the head element of the queue. If empty, it returns null.
	 * Queue won't be modified as a post-condition.
	 */
	E peek();
	
	/**
	 * 
	 * @return true if the queue has no elements. Otherwise, false if the queue has at least one element.
	 * Queue won't be modified as a post-condition.
	 */
	boolean isEmpty();
	
	/**
	 * 
	 * @param obj that will be searched in the queue.
	 * @return -1 if the object is not found. Otherwise, the distance from the head of the queue of the occurrence nearest the head of the queue;
	 * Queue won't be modified as a post-condition.
	 */
	int search(Object obj);
	
	/**
	 * 
	 * @return  the number of components in the queue. 0 if the Queue is empty.
	 * Queue won't be modified as a post-condition.
	 */
	int size();
	
}
