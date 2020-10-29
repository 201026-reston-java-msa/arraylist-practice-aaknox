package com.revature.list;

import java.util.Arrays;

public class MyArrayList<T> {

	private static final int INITIAL_CAPACITY = 10;
	private static int currentCapacity = 0;
	private Object[] elements;

	// constructor
	public MyArrayList() {
		elements = new Object[INITIAL_CAPACITY];
	}

	// expands arraylist to double its current size
	private void ensureCapacity() {
		int newCapacity = elements.length * 2;
		elements = Arrays.copyOf(elements, newCapacity);
	}

	// add value to end of arraylist
	public void add(T val) {
		// if current arraylist size has reached max capacity
		if (currentCapacity == elements.length) {
			// call ensureCapacity method here
			ensureCapacity();
		} else {
			// else add value to arraylist
			elements[currentCapacity++] = val;
		}
	}

	public void set(int index, int val) {

		// if index is outside of current size of array
		if (index > currentCapacity) {
			//if so throw exception
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
		} else {
			// else replace original value at index with new value
			elements[index] = val;
		}
	}

	@SuppressWarnings("unchecked")
	public void remove(int index) {
		// check if arraylist size is greater than zero
		if (currentCapacity >= 0) {
			// remove value at index
			T originalValue = (T) elements[index];
			originalValue = null;
			elements[--currentCapacity] = originalValue;
		} else {
			// else throw exception
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
		}
	}

	@SuppressWarnings("unchecked")
	public T get(int index) {
		T val;

		if (index >= currentCapacity || index < 0) {
			throw new IndexOutOfBoundsException("Index: " + index + ", Size: " + index);
		}

		val = (T) elements[index];

		return val;
	}

	@Override
	public String toString() {
		return "MyArrayList [elements=" + Arrays.toString(elements) + "]";
	}
}
