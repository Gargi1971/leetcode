import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

class inorderRecursiveTraversal {
    List<Integer> ans = new ArrayList<Integer>();

    public List<Integer> inorderTraversal(TreeNode root) {
        if(root != null){
             inorder(root);
        }     
        return ans;
    }
    
    public void inorder(TreeNode root){
        //left root right 
    if(root.left != null){
        inorder(root.left);
    }
    
    ans.add(root.val);

    if(root.right != null){
        inorder(root.right);
    }

    
    
}
}