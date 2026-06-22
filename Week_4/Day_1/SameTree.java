public class SameTree
{
	static class TreeNode{
		      int val;
		      TreeNode left;
		      TreeNode right; 
		      TreeNode(int val) {
		         this.val = val;
		         left = null;
		         right = null;	
	}
	}
      public boolean same(TreeNode root,TreeNode root1)
      {
    	  if(root==null&&root1==null)
    		  return true;
    	  if(root==null||root1==null)
    		  return false;
    	 if(root.val!=root1.val)
    		 return false;
    	 return same(root.left,root1.left)&& same(root.right,root1.right);
      }
        public static void main(String[] args)
        {
        	SameTree d=new SameTree();
        	TreeNode root=new TreeNode(1);
        	root.left=new TreeNode(2);
        	root.right=new TreeNode(3);
        	TreeNode root1=new TreeNode(1);
        	root1.left=new TreeNode(2);
        	root1.right=new TreeNode(3);
        	System.out.println(d.same(root,root1));
        	
        }
    }