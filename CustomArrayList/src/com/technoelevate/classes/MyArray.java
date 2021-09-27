package com.technoelevate.classes;

import java.util.Iterator;

@SuppressWarnings("rawtypes")
public class MyArray implements Iterable {

	private Object[] array;
	private int size;

	public MyArray(int size) {
		this.array = new Object[size];
	}

	public void addElement(Object o) {
		if (array.length - 1 <= this.size) {
			growSize();
		}
		this.array[size++] = o;
	}

	public Object getElement(int index) {
		return this.array[index];
	}

	public int getSize() {
		return this.size;
	}

	public Object removeElement(int index) {
		Object o = array[index];
		for (int i = index; i < this.size; i++) {
			array[i] = array[i + 1];
		}
		size--;
		return o;
	}

	public Object removeObject(Object element) {
		Object obj = 0;
		for (int i = 0; i < array.length; i++) {
			if (getElement(i) == (element)) {
				obj = removeElement(i);
			}
		}
		return obj;
	}

	private void growSize() {
		Object[] temp = new Object[array.length + 5];
		System.arraycopy(array, 0, temp, 0, array.length);
		array = temp;
	}

	@Override
	public String toString() {
		if (size < 0)
			return "[]";
		String str = "[" + getElement(0);
		for (int i = 1; i < size; i++) {
			str += ", " + getElement(i);
		}
		str += "]";
		return str;
	}

	private class MyItr implements Iterator {
		private int index;

		@Override
		public boolean hasNext() {
			return size > index ? true : false;
		}

		@Override
		public Object next() {
			return getElement(index++);
		}

	}

	@Override
	public Iterator iterator() {
		return new MyItr();
	}

}
