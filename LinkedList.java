/**
 * This class implements a singly linked list data structure.
 * 
 * @author Michael Ida
 *
 */
public class LinkedList {
	
	private Node head;
	
	/*
	 * The constructor creates an empty list.
	 */
	public LinkedList() {
		head = null;
	}
	
	/*
	 * This method creates a new node and adds it to the head of the list.
	 */
	public void insertFirst(String data) {
		Node newNode = new Node();
		newNode.record = data;
		newNode.next = head;
		head = newNode;
	}
	
	/*
	 * This method deletes the first node in the list.
	 */
	public void deleteFirst() {
		head = head.next;
	}
	
	/*
	 * This method should create a new node containing data and add it following the node 'after'.
	 * If after is null, then it should do nothing.
	 */
	public void insertAfter(String data, Node after) {
		
			Node newNode = new Node(); 
			
	} 
		
		 
	
	/*
	 * This method should find the node containing the string data and return a pointer to that node.
	 * If not found, then it should return null.
	 */
	public Node findNode(String data ) {
		Node pointed = head;
	int i = 0;
		while (pointed != null && i == 0) {
			if (pointed.record == data) {
				i++;
			} else {
				pointed = pointed.next;
			}
			
		}
		return pointed;
		
	
	
	}
	/*
	 * This method should delete the node trash.
	 * If trash is null, then it does nothing.
	 */
	public void deleteNode(Node trash) {
		// Your code here
if(trash == null){
			
		}
		else{
			Node pointed = head;
			int i = 0;
			while(pointed != null && i == 0){
				if(pointed.next == trash){
					pointed.next = trash.next;
					i++;
				}
				else{
					pointed = pointed.next;
				}	
			}
		}
	}
	
	/*
	 * This method should create a new node and insert it at the end of the list.
	 */
	public void insertLast(String data) {
		Node newNode = new Node ();
		newNode.record = data;
		if (head == null) {
			if (head == null); } else {
				Node pointed = head;
				while 
					(pointed.next != null) {
					pointed = pointed.next;
				}
			pointed.next = newNode;
			}		}
	
	
	/*
	 * This method deletes the last node in the list.
	 * If the list is empty, then it does nothing.
	 */
	public void deleteLast() {
		Node apple = head;
		if (head == null) {
			
		} else {
			Node point = null;
			while (apple.next != null) {
				point = apple;
				point = apple.next;
			}
			point.next = null;
		}
		
	
	}
	/*
	 * This method transverses the list and prints out the record in each node.
	 */
	public void traverseAndPrint() {
		Node pointer = head;
		while (pointer != null) {
			System.out.println(pointer.record);
			pointer = pointer.next;
		}
		System.out.println();
	}
	
}
