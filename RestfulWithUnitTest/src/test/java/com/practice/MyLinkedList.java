package com.practice;

public class MyLinkedList {
	int  size;
	Node head;
	
	class  Node {
		int data;
		Node next;
		
		Node(int d){
			data  =  d;
			next = null;
		}
	}
	
	public void push(int newData) {
		Node node = new Node(newData);
		
		node.next =  head;
		head = node;
		size++;
		
	}
	
	public void insertAfter(Node preNode, int newData) {
		
		Node tmp = head;
		Node node = new Node(newData);
		
		node.next = preNode.next;
		preNode.next = node;
		size++;
	}
	
	public  void append(int newData) {
		
		Node last;
		Node node = new Node(newData);
		last =  head;
		
		if(head == null) {
			head= node;
			return;
		}
		
		while(last.next != null) {
			
			last =  last.next;
		}
		last.next  = node;
		size++;
		return;
	}

	public void printList() {
		Node tmp;
		tmp = head;
		while(tmp != null) {
			System.out.println(tmp.data);
			tmp = tmp.next;
		}
	}
	
public static void main(String[] args) {
	MyLinkedList myLinkedList = new MyLinkedList();
	myLinkedList.append(6);
	myLinkedList.push(7); 
	myLinkedList.push(1);
	myLinkedList.append(4); 
	myLinkedList.insertAfter(myLinkedList.head.next, 8);
	 System.out.println("\nCreated Linked list is: "); 
	 myLinkedList.printList(); 
	 
	 System.out.println("\nCreated Linked list : " + myLinkedList.size); 
	
	
}

}
