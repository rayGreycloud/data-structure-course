package com.tree;

public class BinaryTreeSearchDemo {
	
	public static void main(String[] args) {
		BinarySearchTree bt = new BinarySearchTree();
		
		bt.add(bt.root, bt.NodeCreate(10));
		bt.add(bt.root, bt.NodeCreate(12));
		bt.add(bt.root, bt.NodeCreate(11));
		bt.add(bt.root, bt.NodeCreate(13));
		bt.add(bt.root, bt.NodeCreate(6));

		bt.Search(11, bt.root);
	}

}
