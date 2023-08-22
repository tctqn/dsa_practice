package practice.easy;

public class AddTwoNumbers {
	public static class ListNode {
		int value;
		ListNode next;
		
		public ListNode() {
		}

		public ListNode(int value) {
			this.value = value;
		}

		public ListNode(int value, ListNode next) {
			this.value = value;
			this.next = next;
		}

	}

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
		ListNode l3 = new ListNode(0);
		ListNode res = l3;
		int carry = 0;
		while (l1 != null || l2 != null) {
			int l1_val = (l1 != null) ? l1.value : 0;
			int l2_val = (l2 != null) ? l2.value : 0;
			int sum = l1_val + l2_val + carry;
			carry = sum / 10;
			l3.next = new ListNode(sum % 10);
			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
			l3 = l3.next;
		}
		
		if (carry>0) {
			l3.next = new ListNode(carry);
		}

		return res.next;
	}
	
	
	public static void printListNode(ListNode l) {
		ListNode current = l;
		while(current!=null) {
			System.out.print(current.value + " ");
			current = current.next;
		}
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2, new ListNode(4, new ListNode(3)));
		ListNode l2 = new ListNode(5, new ListNode(6, new ListNode(4)));
		
		printListNode(addTwoNumbers(l1, l2));
		
	}
	
}