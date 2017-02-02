package org.wecancodeit.exercise.ohmy;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class OhMyIterator implements Iterator<String> {

	private String[] elements;
	private int pointer;

	public OhMyIterator(String[] strings) {
		this.elements = strings;
	}

	@Override
	public boolean hasNext() {
		return (pointer < elements.length);
	}

	@Override
	public String next() {
		if (!hasNext()) {
			throw new NoSuchElementException();
		}
		String currentElement = elements[pointer];
		pointer++;
		return currentElement;
	
	}
		
}

