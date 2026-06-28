import java.util.List;
import java.util.LinkedList;
import java.util.Queue;
import java.util.ArrayList;
public class LevelOrder
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
     public List<List<Integer>> order(TreeNode root)
     {
    	 List<List<Integer>> list=new ArrayList<>();
    	    if(root==null)
    	    	return list;
    	    Queue<TreeNode> q=new LinkedList<>();
    	    q.offer(root);   
    	    while(!q.isEmpty())
    	    {
    	    	int level=q.size();
    	    	List<Integer> current=new ArrayList<>();
				while(level>0)
    	    	{
    	    		TreeNode fr=q.poll();
    	    		current.add(fr.val);
    	    		if(fr.left!=null)
        	    		q.offer(fr.left);
        	    	if(fr.right!=null)
        	    		q.offer(fr.right);
    	    		level--;
    	    	}
    	    	
    	    	list.add(current);
    	    }
    	    return list;
    	    	}
			public static void main(String[] args)
        {
        	LevelOrder d=new LevelOrder();
        	TreeNode root=new TreeNode(3);
        	root.left=new TreeNode(9);
        	root.right=new TreeNode(20);
        	root.right.left=new TreeNode(15);
        	root.right.right=new TreeNode(7);
        	List<List<Integer>> x=d.order(root);
        	System.out.println(x);
        }
    };
