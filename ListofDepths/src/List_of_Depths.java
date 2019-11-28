import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class List_of_Depths {

	public static void main(String[] args) {
		Node root= new Node(5);
		root.left = new Node(3);
		root.right = new Node(7);
		root.right.left = new Node(6);
		root.right.right = new Node(8);
		root.left.left = new Node(2);
		root.left.right = new Node(4);
		root.left.left.left = new Node(1);
		ArrayList<LinkedList<Node>> res= createLevelLinkedlist(root);
		printTree(res);
		

	}
	
	public static void printTree(ArrayList<LinkedList<Node>> res) {
		int depth=0;
		for(LinkedList<Node> i: res) {
			Iterator<Node> x= i.iterator();
			System.out.print("Current depth is: "+ depth + " | ");
			while(x.hasNext()) {
				System.out.print(" "+ x.next().getVertex());
			}
			System.out.println();
			depth++;
		}
	}
	
	public static void search(Node root, ArrayList<LinkedList<Node>>lists, int level){
		if(root==null) {
			return;
		}
		LinkedList<Node> list=null;
		if(lists.size()==level) {
			list= new LinkedList<Node>();
			lists.add(list);
		}else {
			list=lists.get(level);
		}
		list.add(root);
		search(root.left,lists,level+1);
		search(root.right,lists,level+1);

	}
	
	public static ArrayList<LinkedList<Node>> createLevelLinkedlist(Node root){
		ArrayList<LinkedList<Node>> lists = new ArrayList<LinkedList<Node>>();
		search(root,lists,0);
		return lists;
	}

}
