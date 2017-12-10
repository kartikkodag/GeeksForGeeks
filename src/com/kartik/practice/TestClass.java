package com.kartik.practice;

public class TestClass {

	public static void main(String[] args) {
		BinaryTree binTree = new BinaryTree();

		Node node8 = new Node(8);
		Node node5 = new Node(5);
		Node node4 = new Node(4);
		Node node9 = new Node(9);
		Node node7 = new Node(7);
		Node node11 = new Node(11);
		Node node1 = new Node(1);
		Node node12 = new Node(12);
		Node node3 = new Node(3);
		Node node2 = new Node(2);
		
		node8.left =node5;
		node8.right = node4;
		
		node5.left = node9;
		node5.right = node7;
		
		node4.right = node11;
		
		node11.left = node3;
		
		node7.left =node1;
		node7.right = node12;
		
		node12.left = node2;
		binTree.root = node8;
		binTree.InOrderTreversal();
	}
}
