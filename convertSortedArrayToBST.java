import javax.swing.tree.TreeNode;

public class convertSortedArrayToBST {
    public TreeNode sortedArrayToBST(int[] nums) {
        int f = 0;
        int l = nums.length - 1;
        return createBST(nums, f, l);
    }

    public TreeNode createBST(int arr[], int f, int l){
        if(f > l){                        //for when left/ right side of the array is completely added
            return null;
        }

        int mid = (l + f) / 2;
        TreeNode root = new TreeNode(arr[mid]);
        root.left = createBST(arr, f, mid-1);
        root.right = createBST(arr, mid+1, l);

        return root;
    }
    
}
