public class MiddleElement
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
		    public ListNode middle(ListNode head) {
		        ListNode fast=head;
		        ListNode slow=head;
		        while(fast!=null&&fast.next!=null)
		        {	
		        	slow=slow.next;
		        	fast=fast.next.next;
		        }
		        return slow;
		    }
        public static void main(String[] args)
        {
        	MiddleElement d=new MiddleElement();
        	ListNode n1=new ListNode(3);
        	ListNode n2=new ListNode(2);
        	ListNode n3=new ListNode(0);
        	ListNode n4=new ListNode(-4);
        	n1.next=n2;
        	n2.next=n3;
        	n3.next=n4;
        	ListNode ans=d.middle(n1);
        	while(ans!=null)
        	{
        		System.out.print(ans.val+"->");
        		ans=ans.next;
        	}
        	System.out.println("null");
        }
    }