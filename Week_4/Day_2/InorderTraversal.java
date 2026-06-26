import java.util.List;
import java.util.ArrayList;
public class InorderTraversal
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
     public List<Integer> inorder(TreeNode root)
     {
    	 List<Integer> list=new ArrayList<>();
    	     inorder(root,list);
    	     return list;
     }
     public void inorder(TreeNode root,List<Integer> list)
     {
    	 if(root==null)
    		 return;
    	 inorder(root.left,list);
    	 list.add(root.val);
    	 inorder(root.right,list);
     }
        public static void main(String[] args)
        {
        	InorderTraversal d=new InorderTraversal();
        	TreeNode root=new TreeNode(1);
        	root.right=new TreeNode(2);
        	root.right.left=new TreeNode(3);
        	List<Integer> x=d.inorder(root);
        	System.out.println(x);
        }
    }