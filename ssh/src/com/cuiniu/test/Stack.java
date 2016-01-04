package com.cuiniu.test;

import java.util.Arrays;

public  class  Stack<T> {
	private int top = 1;
	private Object[] elements = new Object[16];
	
	public void push(T e){
		java.util.Stack a;
		ensureCapactiry();
		elements[top - 1] = e;
		top++;
	}
	
	public T pop(){
		if(top == 1){
			return null;
		}
		@SuppressWarnings("unchecked")
		T e = (T)elements[top - 1];
		elements[top - 1] = null;
		top --;
		return e;
	}
	
	private void ensureCapactiry(){
		if(top >= elements.length){
			elements = Arrays.copyOf(elements, elements.length * 2 + 1);
		}
	}

	public static void main(String[] args) {

	}

}
