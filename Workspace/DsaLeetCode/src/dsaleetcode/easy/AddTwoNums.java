package dsaleetcode.easy;

public class AddTwoNums {
	public static void printList(ListNode head) {
		ListNode current = head;
		while (current != null) {
			System.out.print(current.val + " -> ");
			current = current.next;
		}
		System.out.println(); // print a newline character at the end
	}

	public static class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
			ListNode l3 = new ListNode(0);
			ListNode currentHead = l3;
			int carry = 0;
	
			while (l1 != null || l2 != null) {
				int l1_val = l1 != null ? l1.val : 0;
				int l2_val = l2 != null ? l2.val : 0;
				int sum = l1_val + l2_val + carry;
				carry = sum / 10;
				currentHead.next = new ListNode(sum % 10);
				l1 = l1 != null ? l1.next : l1;
				l2 = l2 != null ? l2.next : l2;
				currentHead = currentHead.next;
			}
			if (carry > 0)
				currentHead.next = new ListNode(carry);
	
			return l3.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(9, new ListNode(4, new ListNode(9, new ListNode(9))));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		printList(addTwoNumbers(l1, l2));
	}

}
