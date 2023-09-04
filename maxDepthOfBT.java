import javax.swing.tree.TreeNode;

public class maxDepthOfBT {
    public int maxDepth(TreeNode root) {
        int left = 0; 
        int right = 0;
        if(root == null){ 
            return 0;
        } else {
            left += maxDepth(root.left);
            right += maxDepth(root.right);
        }
        return Math.max(left, right) + 1;
    }
    
}
