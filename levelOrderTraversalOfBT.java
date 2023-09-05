import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

import javax.swing.tree.TreeNode;

public class levelOrderTraversalOfBT {
    List<List<Integer>> result = new ArrayList<>();
        if(root == null) return result;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root); 

        while(!q.isEmpty()){
            int size = q.size();

            List<Integer> currLevel = new ArrayList<>();

            while(size != 0){
                TreeNode curr = q.poll();    //pop the first elemetn of q and add it to the list of that level
                currLevel.add(curr.val); 

            //check if the node added to list has children, if it does, add children to queue
            if(curr.left != null){
                q.offer(curr.left);
            }
            if(curr.right != null){
                q.offer(curr.right);
            }         
                size--;
            }

            result.add(currLevel);   //add list of that level to main list
        }
        return result;
    }
}
