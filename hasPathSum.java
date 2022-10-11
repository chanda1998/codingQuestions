class Solution {
    public boolean hasPathSum(TreeNode root, int targetSum) {
        int sum = root.val;
        return isSumEqual(root.left, sum, targetSum) || isSumEqual(root.right, sum,targetSum);
    }
    public  boolean isSumEqual(TreeNode root, int sum , int targetSum){
        if(root != null ){
            sum += root.val;
        }else return false;
        if(root.left != null) isSumEqual(root.left,sum,targetSum);
        if(root.right != null) isSumEqual(root.right,sum,targetSum);
        if(sum == targetSum){
            return true;
        }else return false;

    }
}
