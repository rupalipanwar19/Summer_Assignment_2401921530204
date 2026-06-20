public class isPalindrome
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
		    public boolean palindrome(ListNode head) 
		    {
		      ListNode fast=head;
		      ListNode slow=head;
		      while(fast!=null&&fast.next!=null)
		      {
		    		  fast=fast.next.next;
		    	      slow=slow.next;
		      }
		     ListNode curr=slow;
		     ListNode next=null;
		     ListNode prev=null;
		     while(curr!=null)
		     {
		    	 next=curr.next;
		    	 curr.next=prev;
		    	 prev=curr;
		    	 curr=next;
		     }
		     ListNode temp=head;
		     ListNode tem=prev;
		     while(temp!=prev&&tem!=null)
		     {
		    	 if(temp.val!=tem.val)
		    		 return false;
		    	 temp=temp.next;
		    	 tem=tem.next;
		     }
		     return true;
		    }
        public static void main(String[] args)
        {
        	isPalindrome d=new isPalindrome();
        	ListNode n1=new ListNode(1);
        	ListNode n2=new ListNode(2);
        	ListNode n3=new ListNode(2);
        	ListNode n4=new ListNode(1);
        	n1.next=n2;
        	n2.next=n3;
        	n3.next=n4;
        	System.out.println(d.palindrome(n1));
        	
        }
    }