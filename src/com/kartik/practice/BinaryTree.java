package com.kartik.practice;

public class BinaryTree {
	Node root;
	
	public void InOrderTreversal() {
		performInorder(root);
	}
	
	private void performInorder(Node node) {
		if(node.left != null)
			performInorder(node.left);
		
		System.out.print(node.value);
		
		if(node.right != null)
			performInorder(node.right);
	}
}