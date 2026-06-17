public class ReversedList
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
		    public ListNode reverseList(ListNode head) {
		        ListNode curr=head;
		        ListNode prev=null;
		        ListNode next=null;
		        while(curr!=null)
		        {	
		        	next=curr.next;
		        	curr.next=prev;
		        	prev=curr;
		        	curr=next;
		        }
		        head=prev;
		        return head;
		    }
        public static void main(String[] args)
        {
        	ReversedList d=new ReversedList();
        	ListNode n1=new ListNode(3);
        	ListNode n2=new ListNode(2);
        	ListNode n3=new ListNode(0);
        	ListNode n4=new ListNode(-4);
        	n1.next=n2;
        	n2.next=n3;
        	n3.next=n4;
        	ListNode ans=d.reverseList(n1);
        	while(ans!=null)
        	{
        		System.out.print(ans.val+"->");
        		ans=ans.next;
        	}
        	System.out.println("null");
        }
    }