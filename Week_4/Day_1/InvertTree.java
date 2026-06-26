import java.util.Queue;
import java.util.LinkedList;
public class InvertTree
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
      public TreeNode invert(TreeNode root)
      {
    	  if(root==null)
    		  return null;
    	 TreeNode temp=root.left;
    	 root.left=root.right;
    	 root.right=temp;
    	 invert(root.right);
    	 invert(root.left);
    	 return root;
      }
        public static void main(String[] args)
        {
        	InvertTree d=new InvertTree();
        	TreeNode root=new TreeNode(2);
        	root.left=new TreeNode(1);
        	root.right=new TreeNode(3);
        	Queue<TreeNode> q=new LinkedList<>();
        	root=d.invert(root);
        	q.offer(root);
        	while(!q.isEmpty())
        	{
        		TreeNode curr=q.poll();
        		System.out.print(curr.val+"-");
        		if(curr.left!=null)
        		{
        			q.offer(curr.left);
        		}
        		if(curr.right!=null)
        		{
        			q.offer(curr.right);
        		}
        	}
        	
        }
    }