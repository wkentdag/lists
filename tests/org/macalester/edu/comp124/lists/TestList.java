package org.macalester.edu.comp124.lists;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestList {
	/* Declare a list of Strings here named list */
    MyArrayList<String> list = new MyArrayList<String>();

	public void prepareList() {
		list.clear();
		list.add("foo");
		list.add("bar");
		list.add("baz");
	}

    @Test
	public void testGet() {
        prepareList();
		assertEquals(list.get(0), "foo");
		assertEquals(list.get(1), "bar");
		assertEquals(list.get(2), "baz");
	}
	
	/**
	 * Tests that appending at the end of a list works.
	 */
    @Test
	public void testAdd1() {
        prepareList();
		assertEquals(list.size(), 3);
		assertEquals(list.get(0), "foo");
		list.add("foobar");
		assertEquals(list.size(), 4);
		assertEquals(list.get(3), "foobar");
	}
	
	/**
	 * Tests that inserting into the middle of a list works.
	 */
    @Test
	public void testAdd2() {
        prepareList();
		assertEquals(list.size(), 3);
		assertEquals(list.get(0), "foo");
		list.add(1, "foobar");
		assertEquals(list.size(), 4);
		assertEquals(list.get(1), "foobar");
		assertEquals(list.get(3), "baz");
	}
	
	/**
	 * Tests that expanding a list works.
	 */
    @Test
	public void testAdd3() {
        prepareList();
		for (int i = 0; i < 100; i++) {
			list.add("foo" + i);
		}
		assertEquals(list.size(), 103);
		assertEquals(list.get(102), "foo99");
	}
}
