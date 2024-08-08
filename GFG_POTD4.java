// Sum Tree
// Difficulty: MediumAccuracy: 37.17%Submissions: 241K+Points: 4
// Given a Binary Tree. Check for the Sum Tree for every node except the leaf node. Return true if it is a Sum Tree otherwise, return false.

// A SumTree is a Binary Tree where the value of a node is equal to the sum of the nodes present in its left subtree and right subtree. An empty tree is also a Sum Tree as the sum of an empty tree can be considered to be 0. A leaf node is also considered a Sum Tree.

public class Solution {
    boolean isSumTree(Node root) {
        // Your code here
        int sum = 0;
        return Sum(root) != 0;
    }
    
    public int Sum(Node root)
    {
        if(root == null)
        {
            return 0;
        }
        if(root.left == null && root.right == null)
        {
            return root.data;
        }
        
        int lsum = Sum(root.left);
        int rsum = Sum(root.right);
        if(root.data != lsum + rsum)
        {
            return 0;
        }
        
        return root.data + lsum + rsum;
    }
}
