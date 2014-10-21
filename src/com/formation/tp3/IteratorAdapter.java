package com.formation.tp3;

import java.util.Iterator;
import java.util.StringTokenizer;

public class IteratorAdapter implements Iterator<String> {
	
	private final StringTokenizer adaptee;
	
	public IteratorAdapter(StringTokenizer adaptee) {
		super();
		this.adaptee = adaptee;
	}

	@Override
	public boolean hasNext() {
		return adaptee.hasMoreElements();
	}

	@Override
	public String next() {
		return adaptee.nextToken();
	}

	@Override
	public void remove() {
	}

}
