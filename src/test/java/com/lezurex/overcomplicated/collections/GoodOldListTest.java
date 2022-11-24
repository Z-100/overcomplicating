package com.lezurex.overcomplicated.collections;

import com.lezurex.overcomplicated.collections.functional.BetterConsumer;
import com.lezurex.overcomplicated.skinwalker.SkinWalker;
import com.lezurex.overcomplicated.skinwalker.SkinWalkerException;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;

class GoodOldListTest {

	GooderList<String> gol = new GoodOldList<>();

	@Test
	void size() {
		GooderList<String> gooderList = GoodOldList.of("SAS", "ASAS");
		assertEquals(gooderList.getAll().length, 2);
	}

	@Test
	void getAll() {
		GooderList<String> gooderList = GoodOldList.of("SAS", "SAS", "ASAS");
		assertEquals(gooderList.getAll().length, 3);
	}

	@Test
	void add() {
		gol.add("SANANAS");
		assertEquals(gol.size(), 1);
	}

	@Test
	void remove() {
		String s = "SASASAS";
		gol.add(s);
		gol.remove("a thingy");

		// "sasasas" still exists
		assertEquals(1, gol.size());

		gol.remove(s);

		assertEquals(0, gol.size());

		for (var v : gol.getAll()) {
			System.out.println(v);
		}
	}

	@Test
	void forEach() {

		GooderList<String> test = spy(GoodOldList.of("Sos", "Sas"));

		test.forEach(Object::toString);

		verify(test, atLeastOnce()).forEach(any(BetterConsumer.class));
	}

	@Test
	void of() {
		gol = GoodOldList.of("SANANAS", "SAbasnd");

		assertEquals(gol.size(), 2);
	}

	@Test
	void isSkinWalker() {
		SkinWalker sw = new SkinWalker() {};

		GooderList<SkinWalker> swl = GoodOldList.of(sw);

		assertThrowsExactly(SkinWalkerException.class, swl::isSkinWalker);
	}
}