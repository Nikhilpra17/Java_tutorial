package com.company.LinkList;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.createLinkedList(5);
		
//		System.out.println(list.head.value);
		
		list.insertLinkedList(6, 1);
		list.insertLinkedList(3, 6);
		list.insertLinkedList(7, 3);
		list.insertLinkedList(1, 4);
		list.insertLinkedList(19, 5);
		
		list.traversalLinkedlist();
		
		System.out.println("\n");
//		list.deleteLinkedList(2);
		
		list.deleteall();

		list.traversalLinkedlist();
		
//		System.out.println(list.head.next.value);
		
		
	
	}

}
