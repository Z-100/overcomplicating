package com.lezurex.overcomplicated.collections;

import com.lezurex.overcomplicated.collections.functional.BetterConsumer;
import com.lezurex.overcomplicated.skinwalker.SkinWalker;
import com.lezurex.overcomplicated.skinwalker.SkinWalkerException;

/**
 * Good Old List. The perfect list for putting stuff in a list.
 * @param <T> Tea
 * @author Z-100
 */
public class GoodOldList<T extends Object> implements GooderList<T> {

	private Object[] elements;

	private Object[] tempElements;

	private final static int DEFAULT_SIZE = 0;

	private int size = DEFAULT_SIZE;

	public GoodOldList(int initialSize) {
		size = initialSize;
		elements = new Object[initialSize];
	}

	public GoodOldList() {
		elements = new Object[DEFAULT_SIZE];
	}

	@Override
	public int size() {
		int possiblySize = 0;

		for (int i = 0; i < size; i++) {
			possiblySize++;
		}

		return possiblySize;
	}

	@Override
	public Object[] getAll() {
		tempElements = new Object[size];

		// Make sure each item exists and is not a skinwalker hidden as a <T>
		for (int i = 0; i < elements.length; i++) {

			skinWalkerCheck(elements[i]);

			tempElements[i] = elements[i];
		}

		elements = tempElements;

		return elements;
	}

	@Override
	public void add(T element) {
		tempElements = new Object[++size];

		for (int i = 0; i < elements.length; i++) {
			tempElements[i] = elements[i];
		}

		tempElements[size - 1] = element;

		elements = tempElements;
	}

	@Override
	public void remove(T element) {
		tempElements = new Object[size];

		for (int i = 0; i < elements.length; i++) {
			tempElements[i] = elements[i];
		}

		for (int i = 0; i < tempElements.length; i++) {
			if (element.equals(tempElements[i])) {
				tempElements[i] = null;
				--size;
			}
		}

		elements = new Object[size];

		for (int i = 0; i < elements.length; i++) {
			elements[i] = tempElements[i];
		}
	}

	public static <E> GoodOldList<E> of(E... elements) {
		GoodOldList<E> gol = new GoodOldList<>();
		for (var v : elements) {
			gol.add(v);
		}
		return gol;
	}

	@Override
	public void forEach(BetterConsumer<Object> action) {
		for (var v : elements) {
			action.agsepd(v);
		}
	}

	@Override
	public void isSkinWalker(GooderList<T> gol) {
		gol.forEach(this::skinWalkerCheck);
	}

	@Override
	public void isSkinWalker() {
		this.forEach(this::skinWalkerCheck);
	}


	private void skinWalkerCheck(Object possibleSkinWalker) {
		if (possibleSkinWalker instanceof SkinWalker) {
			throw new SkinWalkerException("DANGEROUS SKINWALKER FOUND");
		}
	}
}
