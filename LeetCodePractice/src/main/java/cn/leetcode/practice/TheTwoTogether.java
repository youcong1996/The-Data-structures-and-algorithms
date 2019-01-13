package cn.leetcode.practice;
/**
 * 两数相加
 *
 */
public class TheTwoTogether {
	  
	   /**
	    * 参考解法:https://blog.csdn.net/u014627807/article/details/79341302
	    * @param l1
	    * @param l2
	    * @return
	    */
	   public ListNode addTwoNumbers1(ListNode l1, ListNode l2) {
	        
		   int num = 0;
		   
		   
		   ListNode proNode = new ListNode(0);
		   
		   ListNode currentNode = new ListNode(0);
		   
		   proNode.next =currentNode;
		   
		   do {
			   int sum = (l1 != null?l1.val:0) + (l2 !=null ?l2.val:0) + num;
			   
			   num = sum/10;
			   
			   int result = sum % 10;
			   
			   currentNode.val = result;
			   
			   l1 = l1 != null?l1.next:l1;
			   l2 = l2 != null?l2.next:l2;
			   
			   if(l1!=null || l2!=null || num !=0) {
				   currentNode.next = new ListNode(0);
				   currentNode = currentNode.next;
			   }
		   }while(l1!=null || l2!=null || num !=0);
	    
		   return proNode.next;
	   }
	   
	   /**
	    * 官方正解
	    * @param l1
	    * @param l2
	    * @return
	    */
	   public ListNode addTwoNumbers2(ListNode l1,ListNode l2) {
		   
		   ListNode dummyHead = new ListNode(0);
		   
		   ListNode p =l1,q = l2,curr = dummyHead;
	   
	       int carry = 0;
	       
	       while(p != null || q != null) {
	    	   
	    	   int x = (p != null) ? p.val:0;
	    	   
	    	   int y = (q != null) ? q.val:0;
	    	   
	    	   int sum = carry + x + y;
	    	   
	    	   carry = sum / 10;
	    	   
	    	   curr.next = new ListNode(sum % 10);
	    	   
	    	   curr = curr.next;
	    	   
	    	   if(p != null) p = p.next;
	    	   
	    	   if(q != null) q = q.next;
	       }
	       
	       if(carry > 0) {
	    	   curr.next= new ListNode(carry);
	       }
	       
	       return dummyHead.next;
	   }
}
