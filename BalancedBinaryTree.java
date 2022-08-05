class BalancedBinaryTree{
    public static void main(String[] args) {
        
    }
    public static boolean isBalanced(TreeNode root) {
        if (root == null)
            return true;
        
        if (Math.abs(maxDepth(root.left) - maxDepth(root.right)) > 1) return false;
        return isBalanced(root.left) && isBalanced(root.right);
    }
    
    public static int maxDepth(TreeNode root) {
        if (root == null)
            return 0;
        
        return 1 + Math.max(maxDepth(root.left), maxDepth(root.right));
    }
}
