package com.technoelevate.classes;

import java.util.Iterator;

import com.technoelevate.inter.CustomArrayListInter;

@SuppressWarnings("rawtypes")
public class CustomArrayListDemo implements CustomArrayListInter, Iterable {

	private Object[] array;
	private int capacity;
	private int count = 0;

	public CustomArrayListDemo(int capacity) {
		this.capacity = capacity;
		this.array = new Object[capacity];
	}

	@Override
	public void addObject(Object obj) {
		this.array[count] = obj;
		if (capacity - 1 == count) {
			growSize();
		}
		count++;
	}

	@Override
	public Object getObject(int index) {
		return this.array[index];
	}

	@Override
	public void removeObject(int index) {
		for (int i = index; i < this.count; i++) {
			array[i] = array[i + 1];
		}
		count--;
	}

	@Override
	public void growSize() {
		this.capacity = this.capacity * 2;
		Object[] d = this.array;
		this.array = new Object[this.capacity];
		for (int i = 0; i < d.length; i++) {
			this.array[i] = d[i];
		}
	}

	@Override
	public int getCapacity() {
		return this.capacity;
	}

	@Override
	public int getSize() {
		return this.count;
	}

	private class MyItr implements Iterator {
		private int index;

		@Override
		public boolean hasNext() {
			return capacity > index ? true : false;
		}

		@Override
		public Object next() {
			return getObject(index++);
		}

	}

	@Override
	public Iterator iterator() {
		return new MyItr();
	}

}
