package Tree;


	
	public class Tree
	{
	    Node root;
	    void insert(Node r,Node n)
	    {
	        if(root==null)//First node becomes root.
	            root=n;
	        else
	        {
	            if(n.data<r.data)//go to left
	            {
	                if(r.left==null)
	                    r.left=n;
	                else
	                    insert(r.left,n);
	            }
	            else
	            {
	                if(r.right==null)
	                    r.right=n;
	                else
	                    insert(r.right,n);
	            }
	        }
	    }
	    
	    void inorder(Node r)//LPR
	    {
	        if(r!=null)
	        {
	            inorder(r.left);
	            System.out.print(r.data+",");
	            inorder(r.right);
	        }
	    }
	    void preorder(Node r)//LPR
	    {
	        if(r!=null)
	        {
	        	System.out.print(r.data+",");
	            inorder(r.left);
	            inorder(r.right);
	        }
	    }
	    void postorder(Node r)//LPR
	    {
	        if(r!=null)
	        {
	        	
	            inorder(r.left);
	            inorder(r.right);
	            System.out.print(r.data+",");
	        }
	    }
	    
	    // Find smallest node in right subtree
	    Node minimum(Node r) {
	        while (r.left != null) {
	            r = r.left;
	        }
	        return r;
	    }
	    
	    	Node delete(Node r,int key) {
	    		boolean found=false;
	    		if(r==null) {
	    			found=false;
	    			return found;
	    		}
	    		else if(key<r.data) {
	    			return delete(r.left,key);	    		
	    			}else if(key>r.data) {
	    				return delete(r.right, key);
	    			}
	    			else {
	    				//key found
	    				// Case 1: No child
	    				if(r.left==null && r.right==null) {
	    					return null;
	    				}
	    				  // Case 2A: Only right child
	    	            else if (r.left == null) {
	    	                return r.right;
	    	            }

	    	            // Case 2B: Only left child
	    	            else if (r.right == null) {
	    	                return r.left;
	    	            }

	    	            // Case 3: Two children
	    	            else {
	    	                Node temp = minimum(r.right);
	    	                r.data = temp.data;
	    	                r.right = delete(r.right, temp.data);
	    	            }
	    	        }

	    	        return r;
	    			}
	    		
	    	}
	    int count_node(Node r)//LPR
	    {
	        if(r==null)
	        {
	        	return 0;
	        }else {
	        	return 1+count_node(r.left)+count_node(r.right);
	        }
	           
	        
	    }
	    int count_leaf_node(Node r)//LPR
	    {
	        if(r==null)
	        {
	        	return 0;
	        }else {
	        	if(r.right==null && r.left==null) {
	        		return 1;
	        	}
	        	return count_leaf_node(r.left)+count_leaf_node(r.right);
	        }
	    }
	    
	    int count_depth(Node r)
	   
	    {
	        if(r==null)
	        {
	        	return 0;
	        }
	        	return 1+Math.max(count_leaf_node(r.left),count_leaf_node(r.right));    
	    }
	    
	    public static void main(String[] args) {
	        Tree obj=new Tree();
	        obj.insert(obj.root,new Node(10));
	        obj.insert(obj.root,new Node(5));
	        obj.insert(obj.root,new Node(20));
	        obj.insert(obj.root,new Node(1));
	        obj.insert(obj.root,new Node(8));
	        obj.insert(obj.root,new Node(15));
	        obj.insert(obj.root,new Node(30));
	        obj.insert(obj.root,new Node(55));
	        
	        System.out.print("\nInorder:");
	        obj.inorder(obj.root);
	        System.out.print("\npreorder:");
	        obj.preorder(obj.root);
	        System.out.print("\npostorder:");
	        obj.postorder(obj.root);

	        System.out.print("\ncount_node:");
	        System.out.print(obj.count_node(obj.root));
	        
	        System.out.print("\ncount_leaf_node:"+obj.count_leaf_node(obj.root));
	        System.out.print("\nDepth:"+obj.count_depth(obj.root));
	    }
	}


