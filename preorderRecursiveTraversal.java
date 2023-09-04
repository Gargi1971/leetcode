import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class preorderRecursiveTraversal {
    List<Integer> ans = new ArrayList<Integer>();

    public List<Integer> preorderTraversal(TreeNode root) {
        if(root != null){
            preorder(root);
        }
        return ans;
    }

    public void preorder(TreeNode root){
        // root left right     

        ans.add(root.val);

        if(root.left != null){
            preorder(root.left);
        }

        if(root.right != null){
            preorder(root.right);
        }
    }
}
