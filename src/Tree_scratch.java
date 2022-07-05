import java.util.*;

class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data =data;
    }
}

public class Tree_scratch {
    static Scanner sc;
    public static void main(String[] args) {
        ArrayList<Integer>ar = new ArrayList<Integer>();
       Node root=treeTraversal();
        System.out.println("Root of the tree is:" +root.data);
        inorder(root,ar);
        System.out.println("Inorder traversal" +ar);
        ar.clear();
        preorder(root,ar);
        System.out.println("Preorder traversal" +ar);
        ar.clear();
        postorder(root,ar);
        System.out.println("Postorder traversal" +ar);

    }
    static void postorder(Node root, ArrayList<Integer>ar){
        if(root!=null){
            if(root.left!=null)
                postorder(root.left,ar);
            if(root.right!=null)
                postorder(root.right,ar);
            ar.add(root.data);

        }
    }
    static void preorder(Node root, ArrayList<Integer>ar ){
        if(root!=null){
            ar.add(root.data);
            if(root.left!=null)
                preorder(root.left,ar);
            if(root.right!=null)
                preorder(root.right,ar);
        }
    }
    static void inorder(Node root, ArrayList<Integer>ar ){
        if(root!=null){
            if(root.left!=null) inorder(root.left,ar);
            ar.add(root.data);
            if(root.right!=null)
                inorder(root.right,ar);

        }
    }
    static Node treeTraversal(){
        sc=new Scanner(System.in);
        int data = sc.nextInt();
        if(data==-1) return null;
        Node node= new Node(data);
        System.out.println("Enter the left child : " +data);
        node.left=treeTraversal();
        System.out.println("Enter the right child : " +data);
        node.right=treeTraversal();
        return node;
    }
}
