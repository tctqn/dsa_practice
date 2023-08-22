package dsaleetcode.easy;

class ListNode {
	int val;
	ListNode next;

	public ListNode() {
	}

	public ListNode(int val) {
		this.val = val;
	}

	public ListNode(int val, ListNode next) {
		this.val = val;
		this.next = next;
	}
}

public class MergeSortedList {

	public static void printList(ListNode list) {
		while (list != null) {
			System.out.print(list.val + " ");
			list = list.next;
		}
	}

	public static ListNode mergedTwoLists(ListNode list1, ListNode list2) {
		ListNode head = new ListNode(0);
		ListNode dummyHead = head;

		while (list1 != null && list2 != null) {
			if (list1.val >= list2.val) {
				dummyHead.next = list2;
				list2 = list2.next;
			} else {
				dummyHead.next = list1;
				list1 = list1.next;
			}
			dummyHead = dummyHead.next;
		}

		dummyHead.next = (list1 != null) ? list1 : list2;
		return head.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(1, new ListNode(2, new ListNode(5, new ListNode(6, new ListNode(7)))));
		ListNode l2 = new ListNode(1, new ListNode(3, new ListNode(4)));
		printList(mergedTwoLists(l1, l2));
	}

}
