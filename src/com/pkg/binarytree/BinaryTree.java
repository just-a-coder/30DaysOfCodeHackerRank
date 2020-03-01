package com.pkg.binarytree;

import com.pkg.linkedlist.Node;

import java.util.LinkedList;
import java.util.Queue;

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

    // Prints level order traversal line
    // by line using two queues.
    static void levelOrder(Node root) {
        if (root == null)
            return;

        Queue<Node> q = new LinkedList<>();

        // Pushing root node into the queue.
        q.add(root);

        // Pushing delimiter into the queue.
        q.add(null);

        // Executing loop till queue becomes
        // empty
        while (!q.isEmpty()) {

            Node curr = q.poll();

            // condition to check the
            // occurence of next level
            if (curr == null) {
                if (!q.isEmpty()) {
                    q.add(null);
                }
            } else {
                // Pushing left child current node
                if (curr.left != null)
                    q.add(curr.left);

                // Pushing right child current node
                if (curr.right != null)
                    q.add(curr.right);

                System.out.print(curr.data + " ");
            }
        }
    }
}
