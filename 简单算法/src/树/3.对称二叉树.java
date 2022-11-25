/**
 * @Author Jacky Zou
 * @Date 2022/11/24 10:49
 * @Version 1.0
 */
package 树;

class test03 {
}

class Solution3 {
    public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }


        return isBalence(root.left,root.right);
    }

    public boolean isBalence(TreeNode left,TreeNode right) {
        if(left == null && right == null){
            return true;
        }
        if(left != null && right != null && left.val == right.val){
            return isBalence(left.left,right.right) && isBalence(left.right,right.left);
        }
        return false;
    }
}