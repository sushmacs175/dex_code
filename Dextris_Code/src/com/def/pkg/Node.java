package com.def.pkg;

public class Node {
    int data;
    Node left, right;
	
	
	
     
    public Node(int data, Node left, Node right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }
     
     /* Helper method that allocates a new node with the
     given data and NULL left and right pointers. */
     static Node newNode(int data)
     {
         return new Node(data, null, null);
     }
      
     /* Given a binary tree, print its nodes in inorder*/
     static void inorder(Node node)
     {
         if (node == null)
             return;
       
         /* first recur on left child */
         inorder(node.left);
       
         /* then print the data of node */
         System.out.printf("%d ", node.data);
       
         /* now recur on right child */
         inorder(node.right);
     }
      
     /* Method to merge given two binary trees*/
     static Node MergeTrees(Node t1, Node t2)
     {
         if (t1 == null)
             return t2;
         if (t2 == null)
             return t1;
         t1.data += t2.data;
         t1.left = MergeTrees(t1.left, t2.left);
         t1.right = MergeTrees(t1.right, t2.right);
         return t1;
     }
      
  
     public static void main(String[] args)
     {
    	 //tree1
         Node root1 = newNode(1);
         root1.left = newNode(3);
         root1.right = newNode(2);
         root1.left.left = newNode(5);
        
         //tree2
         Node root2 = newNode(2);
         root2.left = newNode(1);
         root2.right = newNode(3);
         root2.left.right = newNode(4);
         root2.right.right = newNode(7);
       
         Node root3 = MergeTrees(root1, root2);
         System.out.printf("The Merged Binary Tree is:\n");
         inorder(root3);
     }
}
