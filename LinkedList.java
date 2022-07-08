package com.company.LinkList;

public class LinkedList {

	Node head;
	Node tail;
	int size;

	// Create Linked List method
	
	public Node createLinkedList(int nodeValue) {
		head = new Node();
		Node n1 = new Node();
		n1.next = null;
		n1.value = nodeValue;
		head = n1;
		tail = n1;
		size = 1;
		
		return head;
	}
	
	
	// Inserting in Linked list
	
	public void insertLinkedList(int num, int location) {
		Node n1 = new Node();
		n1.value = num;
		
		if (head == null) {
			createLinkedList(num);
			return;
		} else if (location == 0) {
			n1.next =head;
			head= n1;
		} else if (location >= size) {
			n1.next = null;
			tail.next = n1;
			tail = n1;
		} else {
			Node tempnode = head;
			int index =0;
			while (index < location-1) {
				tempnode = tempnode.next;
				index ++;
			}
			Node nextnode = tempnode.next;
			tempnode.next = n1;
			n1.next = nextnode;
			}
		size++;
		}
	
	
	// Traversal In Linked List
	
	public void traversalLinkedlist() {
		if (head == null) {
			System.out.println(" Linked List doesnt exist");
		} else {
			Node tempnode = head ;
					for (int i =0 ; i< size; i++) {
						System.out.print(tempnode.value);
						if (i != size -1) {
							System.out.print(" >- ");
						}
						tempnode = tempnode.next;
					}
		}
		System.out.println("\n");
	}
	
	
	// Searching Method in Linked List
	
	public boolean searchLinkedList(int nodeValue) {
		if (head != null) {
			Node tempnode = head;
			for (int i =0; i< size; i++) {
				if (tempnode.value == nodeValue) {
					System.out.println("Found the node at location: " + i );
					return true;
				}
				tempnode = tempnode.next; 
			}
			
		}
		System.out.println("Node not found");
		return false;
	}
	
	
	// Deletion Method in Linked List
	
	public void deleteLinkedList(int location) {
		if (head == null) {
			System.out.println("Single Linked list is not available");
			return;
		} else if (location ==0) {
			head = head.next;
			size --;
			if (size == 0) {
				tail = null;
			}
		} else if ( location >= size) {
			Node tempnode = head;
			for (int i =0; i<size-1; i++) {
				tempnode = tempnode.next;
			}
			if (tempnode == head) {
				tail = head = null;
				size --;
				return;
			}
			tempnode.next = null;
			tail = tempnode;
			size--;
		} else {
			Node tempnode = head;
			for (int i =0 ; i< location; i++) {
				tempnode = tempnode.next;
			}
			tempnode.next = tempnode.next.next;
			size --;
		}
		
	}
	
	
	// Deletion of All linked list
	
	public void deleteall() {
		head = null;
		tail = null;
		System.out.println(" Successfully deleted Whole Linked List");
	}

	}
		