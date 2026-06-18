public class MergeList
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
		    public ListNode mergeList(ListNode list1, ListNode list2) {
		       ListNode dummy=new ListNode(0);
		    	ListNode temp=dummy;
		        while(list1!=null&&list2!=null)
		        {	
		        	if(list1.val<=list2.val)
		        	{
		        		temp.next=list1;
		        		list1=list1.next;
		        	}
		        	else
		        	{
		        		temp.next=list2;
		        		list2=list2.next;
		        	}
		        	temp=temp.next;
		        }
		        if(list1!=null)
		        {
		        	temp.next=list1;
		        	list1=list1.next;
		        }
		        if(list2!=null)
		        {
		        	temp.next=list2;
		        	list2=list2.next;
		        }
		        return dummy.next;
		    }
        public static void main(String[] args)
        {
        	MergeList d=new MergeList();
        	ListNode n1=new ListNode(1);
        	ListNode n2=new ListNode(2);
        	ListNode n3=new ListNode(4);
        	n1.next=n2;
        	n2.next=n3;
        	ListNode k1=new ListNode(1);
        	ListNode k2=new ListNode(3);
        	ListNode k3=new ListNode(4);
        	k1.next=k2;
        	k2.next=k3;
        	ListNode ans=d.mergeList(n1,k1);
        	while(ans!=null)
        	{
        		System.out.print(ans.val+"->");
        		ans=ans.next;
        	}
        	System.out.println("null");
        }
    }