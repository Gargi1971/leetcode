public class deleteNodeFromBST {
    public TreeNode deleteNode(TreeNode root, int key) {
        //if root is null, tree is empty, return null
        if(root == null){
            return null;
        }

        //find key
        if(key < root.val){
            root.left = deleteNode(root.left, key);
        } else if(key > root.val){
            root.right = deleteNode(root.right, key);
        } else{  //key is found, check for left or right children
                  if(root.left == null){
                      return root.right;
                  } else if(root.right == null){
                      return root.left;
                  } else { //if node has both right and left children
                    //replace current value with min node from right subtree, then delete that node
                    TreeNode minNode = findMin(root.right);
                    root.val = minNode.val;
                    root.right = deleteNode(root.right, root.val);
                  }
                 
        }
         return root;
    }

    //function to find minimum val node in right subtree
    public TreeNode findMin(TreeNode node){
        while(node.left != null){  
            node = node.left;
        }
        return node;
    }
}
