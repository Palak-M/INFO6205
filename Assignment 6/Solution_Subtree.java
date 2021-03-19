class Solution {
    public boolean isSubtree(TreeNode s, TreeNode t) {
        if (s != null && t != null) {
		if (strictEquals(s, t)) {
			return true;
		} else {
			return isSubtree(s.left, t) || isSubtree(s.right, t);
		}
	}
	return s == null && t == null;
}
private boolean strictEquals(TreeNode s, TreeNode t) {
	if (s != null && t != null && s.val == t.val) {
		return strictEquals(s.left, t.left) && strictEquals(s.right, t.right);
	}
	return s == null && t == null;
}
    }