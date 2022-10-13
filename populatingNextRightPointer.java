/*
// Definition for a Node.
class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}

    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};
*/

import java.util.*;

class Solution {
    public Node connect(Node root) {
        if(root == null) return root;
        LinkedList<Node> q = new LinkedList<>();
        q.addFirst(root);
        while(!q.isEmpty()){
            int levelCount = q.size();
            for(int i = 0; i < q.size(); i++){
                q.get(i).next = i + 1 < q.size() ? q.get(i + 1) : null;
            }
            for(int i = 0; i < levelCount; i++){
                Node cur = q.removeLast();
                if(cur.right != null) q.addFirst(cur.right);
                if(cur.left != null) q.addFirst(cur.left);
            }
        }
        return root;
    }
}
