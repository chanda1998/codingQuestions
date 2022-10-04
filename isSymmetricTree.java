import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root.left == null && root.right == null) return true;
        Stack<TreeNode> st = new Stack<>();
        st.push(root.left);
        st.push(root.right);
        while(!st.isEmpty()){
            TreeNode ri  = st.pop();
            TreeNode le  = st.pop();
            if(ri == null && le == null) continue;
            if((ri == null && le != null) || (ri != null && le == null)) return false;
            if(ri.val != le.val) return false;
            st.push(ri.right);
            st.push(le.left);
            st.push(ri.left);
            st.push(le.right);
        }
        return true;
    }
}
