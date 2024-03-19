package com.def.pkg;

public class CountNodes {

	int data;
    CountNodes left,right;
     
    public CountNodes(int data) {
    	this.data = data;
    }

    static Node newNode(int data)
    {
        return new Node(data, null, null);
    }
    
	public static void main(String[] args) {
		CountNodes root1 = new CountNodes(1);
         root1.left = new CountNodes(2);
         root1.right = new CountNodes(3);
         root1.left.left = new CountNodes(4);
         root1.left.right= new CountNodes(5);
         root1.right.left = new CountNodes(6);
         
         int count = countNodes(root1);
         System.out.println(count);

        		 
	}

	 public static int countNodes(CountNodes root) {
		    if (root == null)
		      return 0;
		    return 1 + countNodes(root.left) + countNodes(root.right);
		  }
}
