package model.services;

import java.util.ArrayList;
import java.util.List;

public class PrintService<T> {

	List<T> list = new ArrayList<>();

	public void addValue(T value) {
		list.add(value);
	}

	public Object first() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}
		return list.get(0);
	}

	public void print() {
		if (list.isEmpty()) {
			throw new IllegalStateException("List is empty");
		}

		StringBuilder sb = new StringBuilder();
		sb.append("[");
		for (T e : list) {
			sb.append(e);
			sb.append(", ");
		}
		sb.setLength(sb.length() - 2); // remove a última vírgula e espaço
		sb.append("]");

		System.out.println(sb.toString());
	}

}
