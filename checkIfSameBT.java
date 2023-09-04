import javax.swing.tree.TreeNode;

public class checkIfSameBT {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null){
            return true;
        }
        
        if(p == null || q == null){
            return false;
        }

        if(p.val != q.val){
            return false;
        }

        //return the above code for left and right sides and perform logical AND
        return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
}
    
}
