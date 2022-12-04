package org.example;


public class CountNodes {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    class Solution {
        public int find_depth(TreeNode root) {
            if (root == null)
                return 0;
            return 1 + find_depth(root.left);
        }

        public int _countNodes(TreeNode root, int curr_depth, int total_depth) {
            if (root == null)
                return 0;
            if (curr_depth == total_depth)
                return 0;

            //_countNodes(root.right, curr_depth);
            //  _countNodes(root.left, curr_depth);
            return 0;


        }
//        public int countNodes(TreeNode root, int curr_depth) {
//               int depth = find_depth(root);
//
//
//        }

    }
}

