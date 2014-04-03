package org.macalester.edu.comp124.lists;


import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class TestList {
    private MyLinkedList<String> list = new MyLinkedList<String>();

    @Test
	public void testGet() {
        list.clear();
        list.add("foo");
        list.add("bar");
        list.add("baz");
		assertEquals(list.get(0), "foo");
		assertEquals(list.get(1), "bar");
		assertEquals(list.get(2), "baz");
	}
	
	/**
	 * Tests that appending at the end of a list works.
	 */
    @Test
	public void testAdd() {
        list.clear();
        list.add("foo");
        list.add("bar");
        list.add("baz");
		assertEquals(list.size(), 3);
		assertEquals(list.get(0), "foo");
		list.add("foobar");
		assertEquals(list.size(), 4);
		assertEquals(list.get(3), "foobar");
	}

    /**
     * Tests that expanding a list works.
     */
    @Test
    public void testExpand() {
        list.clear();
        list.add("foo");
        list.add("bar");
        list.add("baz");
        for (int i = 0; i < 100; i++) {
            list.add("foo" + i);
        }
        assertEquals(list.size(), 103);
        assertEquals(list.get(102), "foo99");
    }

	/**
	 * Tests that inserting into the middle of a list works.
	 */
    @Test
	public void testInsert() {
        list.clear();
        list.add("foo");
        list.add("bar");
        list.add("baz");
		assertEquals(list.size(), 3);
		assertEquals(list.get(0), "foo");
		list.add(1, "foobar");
		assertEquals(list.size(), 4);
		assertEquals(list.get(1), "foobar");
		assertEquals(list.get(3), "baz");
	}

    /**
     * Test that add works in a linked lists.
     * This will fail if your list is not a linked list.
     */
    @Test
    public void testOneLinkedAdd() {
        MyLinkedList<String> llist = (MyLinkedList)(Object)list;
        llist.clear();
        assertEquals(llist.size(), 0);
        assertSame(llist.getHead().getNext(), llist.getTail());
        assertSame(llist.getHead(), llist.getTail().getPrev());
        list.add("foo");
        assertEquals(llist.size(), 1);

        // there should be a new node following the head.
        MyLinkedNode<String> fooNode = llist.getHead().getNext();
        assertNotSame(fooNode, llist.getTail());
        assertEquals(fooNode.getValue(), "foo");
        assertSame(llist.getTail().getPrev(), fooNode);
    }
}
