public class RemoveNode
{
	   static class ListNode
	    {
		      int val;
		      ListNode next;
		      ListNode(int x)
		      {
		          val = x;
		          next = null;
		      }
		  } 
		    public ListNode remove(ListNode head, int n) {
		    	ListNode dummy=new ListNode(0);
		    	dummy.next=head;
		      ListNode fast=dummy;
		      ListNode slow=dummy;
		      for(int i=0;i<=n;i++)
		      {
		    	  fast=fast.next;
		      }
		      while(fast!=null)
		      {
		    		  fast=fast.next;
		    	      slow=slow.next;
		      }
		      slow.next=slow.next.next;
		      return dummy.next;
		    }
        public static void main(String[] args)
        {
        	RemoveNode d=new RemoveNode();
        	ListNode n1=new ListNode(1);
        	ListNode n2=new ListNode(2);
        	ListNode n3=new ListNode(3);
        	ListNode n4=new ListNode(4);
        	ListNode n5=new ListNode(5);
        	n1.next=n2;
        	n2.next=n3;
        	n3.next=n4;
        	n4.next=n5;
        	int n=2;
        	ListNode ans=d.remove(n1,n);
        	while(ans!=null)
        	{
        		System.out.print(ans.val+"->");
        		ans=ans.next;
        	}
        	System.out.println("null");
        }
    }