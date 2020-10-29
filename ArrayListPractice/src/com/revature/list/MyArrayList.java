package com.revature.list;

import java.util.ArrayList;
import java.util.List;

public class MyArrayList {
	private List<Integer> arr = new ArrayList<>();
	
	public void add(int val) {
		this.arr.add(val);
	}

	public void set(int index, int val) {
		this.arr.set(index, val);
	}

	public void remove(int index) {
		this.arr.remove(index);
	}

	public int get(int index) {
		int val = this.arr.get(index);
		return val;
	}

	@Override
	public String toString() {
		return "MyArrayList [arr=" + arr + "]";
	}
}
