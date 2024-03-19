package com.def.pkg;

public class ListNode {



	public ListNode(int i) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.println(swapPairs(head));

	}

	private ListNode next;
	public int val;
	
	public static ListNode swapPairs(ListNode head)
	{
		ListNode  dummy=new ListNode(-1) ,prev=dummy,current=head;
		
		while(current!=null && current.next!=null)
		{
		prev.next=current.next;
		current.next=current.next.next;
		prev.next.next=current;
		prev=current;
		
		current=current.next;
		prev=prev.next.next;
		}
		return dummy.next;
	}

}
