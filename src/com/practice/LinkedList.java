package com.practice;

class Node{
	int data;
	Node next;
	Node(int data){
		this.data = data;
		next = null;
	}
}
public class LinkedList {
	Node head;
	private void insertData(int data) {
		Node newNode = new Node(data);
		if(head == null) {
			head = newNode;
		}else {
			Node temp = head;
			while(temp.next != null) {
				temp = temp.next;
			}
			temp.next = newNode;
		}
	}
	private void inserAtIndex(int index,int data) {
		Node newNode = new Node(data);
		Node temp = head;
		for(int i=0;i<index-1;i++) {
			temp = temp.next;
		}
		newNode.next = temp.next;
		temp.next = newNode;
	}
	private void deleteAt(int index) {
		Node n1 = null;
		Node temp = head;
		for(int i=0;i<index-1;i++) {
			temp = temp.next;
		}
		n1 = temp.next;
		temp.next = n1.next;
	}
	private void printall() {
		Node temp = head;
		while(temp != null) {
			System.out.println("Data in node... "+temp.data);
			temp = temp.next;
		}
	}
	private void reverseLinkedList() {
		Node prev = null;
		Node curr = head;
		Node next = null;
		
		while(curr != null) {
			next = curr.next;
			curr.next = prev;
			prev = curr;
			curr = next;
		}
		
	}
	public static void main(String[] args) {
		LinkedList ll = new LinkedList();
		ll.insertData(10);
		ll.insertData(20);
		ll.insertData(30);
		ll.inserAtIndex(1, 25);
		ll.printall();
		ll.deleteAt(1);
		ll.printall();
		
		ll.reverseLinkedList();
		
		ll.printall();
	}

}
