package com.def.pkg;

class PartitionList {
	
		public PartitionList next;
		public int val;
		
		
		int data;
	    Node left, right;
	     
	    public void PartitionList(int data, Node left, Node right) {
	        this.data = data;
	        this.left = left;
	        this.right = right;
	    }
	    static Node PartitionList(int data)
	     {
	         return new Node(data, null, null);
	     }

		public PartitionList(int i) {
			// TODO Auto-generated constructor stub
		}
		public PartitionList partition(PartitionList head,int x)
		{
			PartitionList small=new PartitionList(0);
			PartitionList higher=new PartitionList(0);
			
			
			PartitionList smallHead=small ,higherHead=higher;
			
			while(head!=null)
			{
				if(head.val<x) 
				{
					//smalllist
					smallHead.next=head;
					smallHead=smallHead.next;
					
				}
				else
				{
					//highlist
					higherHead.next=head;
					higherHead=higherHead.next;
				}
				head=head.next;
			}
			//connecting
			smallHead.next=higher.next;
			higherHead.next=null;
			
			return small.next;
		}
		 
	}


