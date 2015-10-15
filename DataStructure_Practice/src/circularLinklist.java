import java.util.*;
public class circularLinklist {
      public boolean hascycle(ListNode head){
    	  ListNode fast = head;
    	  ListNode slow = head;
    	  
    	  if(head==null){
    		  return false;
    	  }
    	  
    	  if(head.next==null){
    		  return false;
    		   }
    	  while(fast!=null&&fast.next!=null){
    		  slow=slow.next;
    		  fast=fast.next.next;
    		  
    		  if(slow==fast){
    			  return true;
    		  }
    		  
    		 // return false;
    	  }
		return false;
    	  
      }
    	  
	
}
