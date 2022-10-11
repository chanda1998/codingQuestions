import java.util.Arrays;
import java.util.Stack;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if(inorder.length ==0 && postorder.length == 0) return null;
        TreeNode root = new TreeNode(postorder[postorder.length -1]);
        int i = 0;
        for(;i < inorder.length; i++){
            if(inorder[i] == root.val) break;
        }
        int[] subInorder = Arrays.copyOfRange(inorder, i + 1, inorder.length);
        int[] subPostorder = Arrays.copyOfRange(postorder,inorder.length -1 - subInorder.length,postorder.length-1);
        root.right = buildTree(subInorder,subPostorder);
        int[] lSubInorder = Arrays.copyOfRange(inorder,0,i);
        root.left = buildTree(lSubInorder, Arrays.copyOfRange(postorder,0,lSubInorder.length));
        return root;
    }
}
