import java.util.LinkedList;
import java.util.Queue;

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class DeepestLeavesSum {
    public int deepestLeavesSum(TreeNode root) {
        if(root.left ==null && root.right == null) return root.val;
        int sum = 0;
        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while(q.size() > 0){
            boolean isLeaf = true;
            int siz = q.size();
            for(int i = 0; i < siz; i++){
                TreeNode cur = q.poll();
                if(cur.right != null){
                    q.offer(cur.right);
                    if(cur.right.right == null && cur.right.left == null) {
                        sum += cur.right.val;
                    }else isLeaf = false;
                }
                if(cur.left != null){
                    q.offer(cur.left);
                    if(cur.left.left == null && cur.left.right == null){
                        sum += cur.left.val;
                    }else isLeaf = false;
                }
            }
            if(isLeaf) return sum;
            sum = 0;
        }

        return sum;
    }
}
