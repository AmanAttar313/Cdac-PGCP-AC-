package Tree;

public class Tree {
	Node root;
	void insert(Node r,Node n) {
		if(root==null) {
			root=n;
		}else {
			if(n.data<r.data) {
				if(r.left==null) {
					r.left=n;
				}else {
					insert(r.left,n);
				}
			}
				else {
					if(r.right==null) {
						r.right=n;
					}else {
						insert(r.right,n);
					}
				}
				
			
		}
	}
	
	void inorder(Node r){
		if(r!=null) {
			inorder(r.left);
			System.out.println(r.data+" ");
			inorder(r.right);
		}
	}
	void postorder(Node r){
		if(r!=null) {
			inorder(r.left);
			System.out.println(r.data+" ");
			inorder(r.right);
		}
	}
	void preorder(Node r){
		if(r!=null) {
			System.out.println(r.data+" ");
			inorder(r.left);
			
			inorder(r.right);
		}
	}
	
	int count_node(Node r) {
		if(r==null) {
			return 0;
		}else {
			return 1+count_node(r.right)+count_node(r.left);
		}
	}
	int count_leaf_node(Node r){
		if(r==null) {
			return 0;
		}else {
			if(r.right==null && r.left==null) {
				return 1;
			}
			else {
			return	count_leaf_node(r.right)+count_leaf_node(r.left);
			}
		}
	}
	int count_depth(Node r) {
		if(r==null) {
			return 0;
		}else {
			
				return	1+Math.max(count_leaf_node(r.right),count_leaf_node(r.left));
				
		}
	}
	public static void main(String []args) {
		Tree obj=new Tree();
		obj.insert(obj.root, new Node(10));
		obj.insert(obj.root, new Node(20));
		obj.insert(obj.root, new Node(30));
		
		
		obj.preorder(obj.root);
		System.out.println("Node COunt is : "+obj.count_node(obj.root));
		System.out.println("leaf node count is : "+obj.count_leaf_node(obj.root));
		System.out.println("depth is : "+obj.count_depth(obj.root));
	}
}
