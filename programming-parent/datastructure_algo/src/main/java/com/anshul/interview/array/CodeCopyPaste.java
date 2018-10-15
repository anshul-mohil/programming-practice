package com.anshul.interview.array;

import java.util.ArrayList;
import java.util.Stack;

public class CodeCopyPaste {
	
	  class TreeNode {
	      int val;
	      TreeNode left;
	      TreeNode right;
	      TreeNode(int x) { val = x; }
	 }
	 
	public class Solution {
		public ArrayList<Integer> postorderTraversal(TreeNode A) {
		    
		    ArrayList<Integer> result = new ArrayList<Integer>();
		    Stack<TreeNode> stack = new Stack <TreeNode>();
		    TreeNode lastNode = null;
		    while(!stack.isEmpty() || A != null){
		        if(A != null){
		            stack.push(A);
		            A = A.left;
		        }else{
		            TreeNode peekNode = stack.peek();
		            if(peekNode.right != null && lastNode != peekNode.right){
		                A = peekNode.right;
		            }else{
		                result.add(peekNode.val);
		                lastNode = stack.pop();
		            }
		            
		        }
		    }
		    
		    return result;
		    
		}
	}
public ArrayList<Integer> preorderTraversal(TreeNode A) {
	    
	    ArrayList<Integer> res = new ArrayList<Integer>();
	    
	    Stack<TreeNode> S = new Stack<TreeNode>();
	    
	   if(A == null) return res;
	   TreeNode curr = A;
	   S.push(curr);
	   
	   while(S.size() > 0){
	       curr = S.pop();
	       res.add(curr.val);
	       if(curr.right != null) S.push(curr.right);
	       if(curr.left != null) S.push(curr.left);
	   }
	    return  res;
	}
	
	
}
