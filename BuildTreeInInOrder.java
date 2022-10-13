import java.util.Arrays;

class Solution {
    public TreeNode buildTree(int[] inorder, int[] preorder) {
        if(inorder.length == 0) return null;
        TreeNode root = new TreeNode(preorder[0]);
        int i = 0;
        for(;i < inorder.length; i++){
            if(inorder[i] == root.val) break;
        }
        int[] lSubInorder = Arrays.copyOfRange(inorder,0,i);
        root.left = buildTree(lSubInorder, Arrays.copyOfRange(preorder,1 , i + 1 + lSubInorder.length));
        int[] rsubInorder = Arrays.copyOfRange(inorder, i + 1, inorder.length);
        int[] rsubpreorder = Arrays.copyOfRange(preorder,1 + lSubInorder.length,preorder.length);
        root.right = buildTree(rsubInorder,rsubpreorder);
        return root;
    }
}
