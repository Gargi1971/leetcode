import javax.swing.tree.TreeNode;

public class validateBST {
    public boolean isValidBST(TreeNode root) {
        return validate(root, Long.MIN_VALUE, Long.MAX_VALUE);
        
    }

    public boolean validate(TreeNode root, long minVal, long maxVal){
        if(root == null) return true;    

        //check if the root is smaller than lower limit or greater than higher limit
        if(root.val >= maxVal || root.val <= minVal){
            return false;
        }

        //if not, then recursively call validate for right and left childnodes
        //new minVal = Long.MIN_VALUE
        //new MaxVal = root.val -----------for left subtree

        //new minVal = root.val
        //new MaxVal = Long.MAX_VALE ---------for right subtree

        return validate(root.left, minVal, root.val) && validate(root.right, root.val, maxVal);
    }
}
