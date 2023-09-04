import java.util.ArrayList;
import java.util.List;

import javax.swing.tree.TreeNode;

public class postorderRecursiveTraversal {
    List<Integer> ans = new ArrayList<Integer>();
    public List<Integer> postorderTraversal(TreeNode root) {
        if(root != null){
            postorder(root);
        }
        return ans;
    }

    public void postorder(TreeNode root){
        //left right root

        if(root.left != null){
            postorder(root.left);
        }

        if(root.right != null){
            postorder(root.right);
        }

        ans.add(root.val);
    }
}
