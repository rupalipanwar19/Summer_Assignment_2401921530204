public class MaxDepth
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
      public int maxDepth(TreeNode root)
      {
    	  if(root==null)
    		  return 0;
    	  int left=maxDepth(root.left);
    	  int right=maxDepth(root.right);
    	  int mxx=Math.max(left,right);
    	  return 1+mxx;
      }
        public static void main(String[] args)
        {
        	MaxDepth d=new MaxDepth();
        	TreeNode root=new TreeNode(3);
        	root.left=new TreeNode(9);
        	root.right=new TreeNode(20);
        	root.right.left=new TreeNode(15);
        	root.right.right=new TreeNode(7);
        	System.out.println("Maximum Depth="+d.maxDepth(root));
        	
        }
    }