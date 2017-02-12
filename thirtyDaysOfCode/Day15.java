package thirtyDaysOfCode;

import java.util.Scanner;

class Node {
	int data;
	Node next;
	Node(int d) {
		data = d;
		next = null;
	}
}

public class Day15 {

	public static Node insert(Node head,int data) {

		Node temp = new Node(data);
		Node current = head;

		if (current != null ) {
			while (current.next != null) {
				current = current.next;
			}
			current.next = temp;
		}
		else {
			head = temp;
		}


		return head;
		//Complete this method
	}

	public static void display(Node head) {
		Node start = head;
		while(start != null) {
			System.out.print(start.data + " ");
			start = start.next;
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		Node head = null;
		int N = sc.nextInt();

		while(N-- > 0) {
			int ele = sc.nextInt();
			head = insert(head,ele);
		}
		display(head);
		sc.close();
	}

}
