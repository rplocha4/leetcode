class SameTree {
    public static void main(String[] args) {
        
    }
    public boolean isSameTree(TreeNode p, TreeNode q){
        if (q == null && p == null) return true;
        
        if ((p != null && q != null) && (p.val == q.val)) 
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        else 
            return false;
    }
}