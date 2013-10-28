package org.macalester.edu.comp124.lists;


/**
 * An unfinished implementation of a List.
 * 
 * TODO:
 * 1. Complete add(o) (unit test 1 and 2 should pass)
 * 2. Complete expand() (unit tests 1, 2, and 3 should pass)
 * 3. Complete add(i, o) (all 4 unit tests should pass)
 * 
 * @param <E>
 */
public class MyArrayList<E> {
	/**
	 * The array elements
	 */
	private E elements[];
	
	/**
	 * The number of elements currently contained in the list.
	 */
	private int currentSize;

	/**
	 * Creates a new list.
	 */
	public MyArrayList() {
		clear();
	}
	
	/**
	 * Clears the contents of the array.
	 */
	public void clear() {
		elements = newArrayOfE(4);
		currentSize = 0;
	}
	
	/**
	 * Returns the current size of the array.
	 * @return
	 */
	public int size() {
		return currentSize;
	}
	
	/**
	 * Returns the element at position index.
	 * @param index
	 * @return
	 */
	public E get(int index) {
		return elements[index];
	}
	
	/**
	 * Adds a new element to the end of the array:
	 * 
	 * If the array is full, expand the array.
	 * Add the element to the first unused position in the array.
	 * Update the size of the array.
	 * 
	 * @param elem
	 */
	public void add(E elem) {
        if (currentSize == elements.length) {
            expandSize();
        }
        elements[currentSize++] = elem;
	}

	/**
	 * Adds a new element to the end of the array:
	 * 
	 * If the array is full, expand the array.
	 * Slide the elements of the array starting with index over.
	 * Place the new element in the correct spot of the array.
	 * 
	 * Update the size of the array.
	 * 
	 * @param elem
	 */
	public void add(int index, E elem) {
	}
	
	/**
	 * Doubles the size of the array, copies the old elements
	 * into the new array, and updates elements to point to the
	 * new array.
	 * 
	 * This will be useful for both versions of add.
	 */
	private void expandSize() {
        E [] newElements = newArrayOfE(2 * elements.length);
        for (int i = 0; i < elements.length; i++) {
            newElements[i] = elements[i];
        }
        elements = newElements;
	}
	
	/**
	 * Due to some crazy Java constraints, we can't simply create a
	 * new array of elements of class E.  We need to create an array
	 * of class Object and then cast the array to E.
	 * @param capacity
	 * @return
	 */
	@SuppressWarnings("unchecked")
	private E[] newArrayOfE(int capacity) {
		return (E[]) (E[])new Object[capacity];
	}
}
