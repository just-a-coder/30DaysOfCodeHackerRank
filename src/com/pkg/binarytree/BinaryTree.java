package com.pkg.binarytree;

import com.pkg.linkedlist.Node;

public class BinaryTree {

    public static int getHeight(Node root){
        if (root == null) {
            return 0;
        } else {
            int left = getHeight(root.left);
            int right = getHeight(root.right);
            return Math.max(left,right)+1;
        }
    }
}
