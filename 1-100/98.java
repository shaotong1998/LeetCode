/**
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public ArrayList<Integer> array = new ArrayList<Integer>();
    public boolean isValidBST(TreeNode root) {
        if(root == null){
            return true;
        }
        if(root.left == null && root.right == null){
            array.add(root.val);
            return true;
        }else{
            isValidBST(root.left);
            array.add(root.val);
            isValidBST(root.right);
        }
        int len = array.size();
        for(int i = 0;i < len-1;i++){
            if(array.get(i) >= array.get(i+1)){
                return false;
            }
        }
        return true;

    }
}