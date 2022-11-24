package com.lezurex.overcomplicated.collections;

import com.lezurex.overcomplicated.collections.functional.BetterConsumer;

public interface GooderList<T> {

	/**
	 * Very uncomplicated method to get the size of a {@link GooderList<T>}
	 */
	int size();

	/**
	 * Very uncomplicated method to get all elements of a {@link GooderList<T>}
	 */
	Object[] getAll();

	/**
	 * Very uncomplicated method to add an element to a {@link GooderList<T>}
	 * @param element The to be removed element
	 */
	void add(T element);

	/**
	 * Very uncomplicated method to remove an element from a {@link GooderList<T>}
	 * @param element The to be removed element
	 */
	void remove(T element);

	void forEach(BetterConsumer<Object> action);

	void isSkinWalker(GooderList<T> list);

	void isSkinWalker();
}
