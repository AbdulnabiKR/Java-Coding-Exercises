/*
 * Queue-FIFO
  Here in Queue data structure the element which present in the first will be removed as the first
  First In First Out

  Implementation in Queue
  ->Queue using an array
 */
////queue using an array
// public class main2{
//     static class Queue{
//         static int arr[];
//         //not defining the size of an array because we dont know it we will define by using Queue constructor
//         static int size;
//         static int rear=-1;
//         //as we defining an array here no need to declare the front because its already initialized as index 0,front=0
//         Queue(int n){
//             //constructor to define the size of an array
//             arr=new int[n];
//             this.size=n;
//         }
//         public static boolean isEmpty(){
//             return rear==-1;
//             ///rear==-1 then array is empty then it wiill return true as empty
//         }
//         //Enqueue-add O(1)
//         public static void add(int data){
//             if(rear==size-1){
//                 System.out.println("full Queue");
//                 return;
//             }
//             //rear is at last index then we want to place some more elements in an array ,then rear++; got some more blank space and we store there
//             rear++;
//             arr[rear]=data;
//         }

//         //Dequeue-remove its like pop O(n)->returning the top element(front idx) with removing  front idx
//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int front=arr[0];
//             //for this opn we have to acces the front idx
//             // removng the front idx by accesing it to the next idx arr[i]=arr[i+1];returning the front idx
//             for(int i=0;i<rear;i++){
//                 arr[i]=arr[i+1];
//             }
//             rear--;//after shifting the element we lost front element the size decrease
//             return front;
//         }

//         //peek-returning the top element(front idx) without removing it O(n)
//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int front=arr[0];
//             return front;
//         }

//     }
//     public static void main(String args[]){
//      Queue q=new Queue(5);
//      q.add(1);
//      q.add(2);
//      q.add(3);

//      while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove(); 
//      }
//     }
// }


// //2.Implementation of an array using a Circular Queue
// public class main2{
//     static class Queue{
//         static int arr[];
//         static int size;
//         static int rear=-1;
//         static int front=-1;

//         Queue(int n){
//             arr=new int[n];
//             this.size=n;
//         }

//         public static boolean isEmpty(){
//             return rear==-1;//list is empty
//         }

//         public static boolean isFull(){
//             return (rear+1)%size==front;
//         }
//         public static void add(int data){
//             if(isFull()){
//                 System.out.println("Full Queue");
//                 return;
//             }
//             if(front==-1){
//                 front=0;
//             }
//             rear=(rear+1)%size;
//             arr[rear]=data;
//         }

//         public static int remove(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//             int result=arr[front];//1st element top
//             if(rear==front){
//                 rear=front=-1;//single element
//             }
//             else{
//                 front=(front+1)%size;
//             }
//             return result;
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty");
//                 return -1;
//             }
//            int  result=arr[front];
//            return result;
//         }
      
//     }
//     public static void main(String args[]){
//      Queue q=new Queue(5);
//      q.add(1);
//      q.add(2);
//      q.add(3);
//      q.add(4);
//      q.add(5);
//      System.out.println(q.remove());//removing front element
//      q.add(6);
//      System.out.println(q.remove());
//      q.add(7);

//      while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//      }
//     }
// }


// //Implementation of Queue using a LinkedList
// public class main2{
//    static class Node{
//         int data;
//         Node next;

//         Node(int data){
//             this.data=data;
//             this.next=null;
//         }
//    }

//     static class Queue{
//         static Node head=null;
//         static Node tail=null;
//         public static boolean isEmpty(){
//             return head==null && tail==null;//when both head and tail are not there then it will be empty
//              //as linkedlist is variable in sze which is having very large memory there is no necessary to  use the isFull() fn
//         }

//              //enqueue
//              public static void add(int data){
//                   Node newNode=new Node(data);
                 
//                   if(tail==null){
//                     //consider only one node is there(head ) no tail then
//                     tail=head=newNode;
//                     return;
//                   }
//                   tail.next=newNode;
//                   tail=newNode;
//              }
             
//              //deque
//              public static int remove(){
//                 if(isEmpty()){
//                     System.out.println("Queue is empty here");
//                     return -1;
//                 }
//                 int front=head.data;
//                 if(head==tail){
//                     tail=null;//single element
//                 }
//                 head=head.next;
//                 return front;
//              }


//              public static int peek(){
//                 if(isEmpty()){
//                     System.out.println("Queue is empty here");
//                     return -1;
//                 }
//                 return head.data;
//              }
//             }
        
            
        
//         //as linkedlist is variable in sze which is having very large memory there is no necessary to  use the isFull() fn
    
//     public static void main(String args[]){
//      Queue q=new Queue();
//      q.add(1);
//      q.add(2);
//      q.add(3);
//      q.add(4);
//      q.add(5);

//      while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.remove();
//      }

//     }
// }


//Implementation by collection framework
// import java.util.*;
// public class main2{
//     public static void main(String args[]){
//         Queue<Integer> q=new LinkedList<>();
//         //I used here LinkedList because Queue-Interface which does not have any objects but LnkedList is a class which have objects thtas why we implement queue interface n two ways that is
//         //array dequeue and LinkedList
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while(!q.isEmpty()){
//           System.out.println(q.peek());
//           q.remove();
//         }

//     }
// }

// //Implementation by ArrayDeque
// import java.util.*;
// public class main2{
//     public static void main(String args[]){
//         Queue<Integer> q=new ArrayDeque<>();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//         while(!q.isEmpty()){
//             System.out.println(q.peek());
//             q.remove();
//         }
//     }
// }


// //Implementation of Queue by using 2 stacks-push or pop
// import java.util.*;
// public class main2{
//     static class Queue{
//         static Stack<Integer> s1=new Stack<>();
//         static Stack<Integer> s2=new Stack<>();

//         public static boolean isEmpty(){
//             return s1.isEmpty();
//         }
//        //add or push
//         public static void add(int data){
//             while(!s1.isEmpty()){
//                 s2.push(s1.pop());
//             }
//             s1.push(data);

//             while(!s2.isEmpty()){
//                 s1.push(s2.pop());
//             }
//         }

//         public static int pop(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty here");
//                 return -1;
//             }
//             return s1.pop();//removing the top most element of s1 stack and returning the top element
//         }

//         public static int peek(){
//             if(isEmpty()){
//                 System.out.println("Queue is empty here");
//                 return -1;
//             }
//             return s1.peek();
//         }

//     }
//     public static void main(String args[]){
//         Queue q= new Queue();
//         q.add(1);
//         q.add(2);
//         q.add(3);
//         q.add(4);
//         q.add(5);

//      while(!q.isEmpty()){
//         System.out.println(q.peek());
//         q.pop();
//      }
//     }
// }

// //*Tree -Binary tree */
////Time complexity-O(n) because traversing at each node
// public class main2{
//    static class Node{
//     int data;
//     Node left;

//     Node right;
//     Node(int data){
//         this.data=data;
//         this.left=null;
//         this.right=null;
//     }
//    }

//   static class BinaryTree{//class
//     static int idx=-1;
//     public static Node buildTree(int nodes[]){
//       idx++;//root node
//         if(nodes[idx]==-1){
//             return null;
//         }
//         //otherwiise
//         Node newNode=new Node(nodes[idx]);
//         newNode.left=buildTree(nodes);//assigning left nodes to a node
//         newNode.right=buildTree(nodes);//assigning right nodes to a node
//         return newNode;//returning the root node by getting it fro the right and left nodes
//     }
//   }

//   public static void preorder(Node root){
//     if(root==null){
//         return;
//     }
//     System.out.print(root.data + " ");
//     preorder(root.left);
//     preorder(root.right);
//   }

 
//     public static void main(String args[]){
//        int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//        BinaryTree tree=new BinaryTree();
//         Node root= tree.buildTree(nodes);
//       //  System.out.println(root.data);
//       preorder(root);
//     }
// }



////Inorder Traversal
// public class main2{
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }

//     static class BinaryTree{
//         static int idx=-1;
//         public static Node buildTree(int nodes[]){
//             idx++;
//             if(nodes[idx]==-1){
//                 return null;
//             }

//             Node newNode=new Node(nodes[idx]);
//             newNode.left=buildTree(nodes);
//             newNode.right=buildTree(nodes);
//             return newNode;
//         }
//     }

//     public static void preorder(Node root){
//         if(root==null){
//             return;
//         }
//         System.out.print(root.data + " ");
//         preorder(root.left);
//         preorder(root.right);
//     }

//     public static void inorder(Node root){
//         if(root==null){
//             return;
//         }

//         inorder(root.left);
//         System.out.print(root.data + " ");
//         inorder(root.right);
//     }
//     public static void main(String args[]){
//         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         BinaryTree tree=new BinaryTree();
//         Node root=tree.buildTree(nodes);
//         inorder(root);
//     }
// }


//PostOrder Traversal
// import java.util.*;
// public class main2{
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }

//         static class BinaryTree{
//             static int idx=-1;
//             public static Node buildTree(int nodes[]){
//                 idx++;
//                 Node newNode=new Node(nodes[idx]);
//                 if (nodes[idx]==-1) {
//                     return null;
//                 }
//                 newNode.left=buildTree(nodes);
//                 newNode.right=buildTree(nodes);
//                 return newNode;
//             }
//         }

//         public static void preOrder(Node root){
//             if(root==null){
//                 return;
//             }

//             System.out.print(root.data + " ");
//             preOrder(root.left);
//             preOrder(root.right);
//         }

//         public static void inOrder(Node root){
//             if(root==null){
//                 return;
//             }

//             inOrder(root.left);
//             System.out.print(root.data + " ");
//             inOrder(root.right);
//         }

//         public static void postOrder(Node root){
//             if(root==null){
//                 return;
//             }
//             postOrder(root.left);
//             postOrder(root.right);
//             System.out.print(root.data + " ");
//         }



//         public static void levelOrder(Node root){
//             Queue<Node> q= new LinkedList<>();
//             q.add(root);
//             q.add(null);    
//             if(root==null){
//                 return;
//             }
//              while(!q.isEmpty()){//upto q will not empty
//                 Node currNode=q.remove();
//                   if(currNode==null){
//                     System.out.println();
//                     if(q.isEmpty()){
//                         break;
//                     }
//                     else{
//                         q.add(null);
//                     }
//                   }

//                   else{
//                     System.out.print(currNode.data + " ");
//                     if(currNode.left!=null){
//                         q.add(currNode.left);
//                     }
//                     if(currNode.right!=null){
//                         q.add(currNode.right);
//                     }
//                   }
//              }
//         }

//            //countNodes
//         /*
//          Time complexity-O(n) because it goes from each and every node in ls and rs then adding the root at last
//          */
//         public static int countNodes(Node root){
//             if(root==null){
//                 return 0;
//             }
//             //I will use here recursion method where I first I will take the sum of leftSubttree and rightSubtree by adding 1 root at last for counting the nodes
//             int leftNodes=countNodes(root.left);
//             int rightNodes=countNodes(root.right);

//             return leftNodes+rightNodes+1;
//         }

//         //sum of nodes-Here also I am using the recursion first we will go in leftsubtree,rightsubtree and root.data,I sum this all values by using the fn then I will print it in a main fn
//         /*
//          Time complexity:O(n) because here also Iam going through leftsubtree and rightsubtree then by the root.data values by summing all these ecah values therefore it is having linear time complexity
//          */
    
//         public static int sumOfNodes(Node root){
//             if(root==null){
//                 return 0;
//             }
//            int leftNodes=sumOfNodes(root.left);
//             int rightNodes=sumOfNodes(root.right);
//                 return leftNodes+rightNodes+root.data;
//         } 
//       //height of a tree(Recursion)-Time complexity-O(n)

//                 public static int heightOfTree(Node root){
//                     if(root==null){
//                         return 0;
//                     }
//                     int leftHeight=heightOfTree(root.left);
//                     int rightHeight=heightOfTree(root.right);
        
//                     int myTree=Math.max(leftHeight,rightHeight)+1;
//                     return myTree;
//                 }

//       //diameter of a tree-Time complexity-O(n^n) because here first I will go linearly n times on both left and right, then I will go again n times for calculating a height of a tree that is n^n
//       //1.Approach-1 (O(n^n))
//       public static int diameterOfTree(Node root){
//         if(root==null){
//             return 0;
//         }
//         int diam1=diameterOfTree(root.left);
//         int diam2=diameterOfTree(root.right);
//         int diam3=heightOfTree(root.left)+heightOfTree(root.right)+1;

//         return Math.max(diam3,Math.max(diam1,diam1));
//       }

//       //Approach-2 Time complexity(O(n))->Linear time complexity
//       static class TreeInfo{
//             int ht;
//             int diam;

//             TreeInfo(int ht,int diam){
//                 this.ht=ht;
//                 this.diam=diam;
//             }
//       }
        
//       public static TreeInfo diameter2(Node root){
//         //Here I am using TreeInfo because it can return height and diameter together
//         if(root==null){
//           return new TreeInfo(0,0);
//         }

//         TreeInfo left=diameter2(root.left);
//         TreeInfo right=diameter2(root.right);//for all common

//         int myht=Math.max(left.ht,right.ht)+1;

//         int diam1=left.diam;
//         int diam2=right.diam;
//         int diam3=left.ht+right.ht+1;

//         int mydiam=Math.max(Math.max(diam1,diam2),diam3);
//         TreeInfo myinfo=new TreeInfo(myht, mydiam);
//         return myinfo;
//       }
        
//     public static void main(String args[]){
//         int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//         BinaryTree tree=new BinaryTree();
//         Node root=tree.buildTree(nodes);
//         levelOrder(root);
//     //     //System.out.println(countNodes(root));
//     //     //System.out.println(sumOfNodes(root));
//     //     //System.out.println(heightOfTree(root));
//     //    // System.out.println(diameterOfTree(root));
//     //    System.out.println(diameter2(root).diam);
//     }
// }


// //sum of nodes at Kth level

// import java.util.*;
// public class main2{
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data=data;
//             this.left=null;
//             this.right=null;
//         }
//     }

//     static class BinaryTree{
//         static int idx=-1;
//         public static Node buildTree(int nodes[]){
//             idx++;
//             Node newNode=new Node(nodes[idx]);
//             if(nodes[idx]==-1){
//                 return null;
//             }
//             newNode.left=buildTree(nodes);
//             newNode.right=buildTree(nodes);
//             return newNode;
//         }
//     }

//     public static int sumOflevels(Node root,int k){
//         Queue<Node> q=new LinkedList<>();
//         q.add(root);
//         q.add(null);
//         int level=0;
//         int sum=0;
//         if(root==null){
//             return 0;
//         }
        
//         while(!q.isEmpty()){//upto q will not empty
//                             Node currNode=q.remove();
//                               if(currNode==null){
//                                 level++;
//                                 if(q.isEmpty()){
//                                     break;
//                                 }
//                                 else{
//                                     q.add(null);
//                                 }
//                               }
            
//                               else{
//                                 //System.out.print(currNode.data + " ");
//                                 if(level==k){
//                                     sum+=currNode.data;
//                                 }
//                                 if(currNode.left!=null){
//                                     q.add(currNode.left);
//                                 }
//                                 if(currNode.right!=null){
//                                     q.add(currNode.right);
//                                 }
//                               }
      
//                               }     
//                               return sum; 
//                                             }
   
    

    
//     public static void main(String args[]){
//      int nodes[]={1,2,4,-1,-1,5,-1,-1,3,-1,6,-1,-1};
//      BinaryTree tree=new BinaryTree();
//      Node root=tree.buildTree(nodes);
//      int k=2;

//      sumOflevels(root, k);
//      System.out.println(sumOflevels(root, k));
//     }
// }

// //Binary Search Trees(BST)
// //Build a BST->Ex:values[]={5,1,3,4,2,7}
// /*
//  Like Binary Trees here also first we follow methods likes this
//  1.Root=null;Initializing root to null
//  2.Creating Node class within that
//    int data;
//    Node left;
//    Node right; 
//    as like in Binary trees

//    Time complexity:Insert->O(n)==search

//  */

//  public class main2{

//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data=data;
//             //values of right and left will be null in default
//         }
//     }

//     //creating one other member fn for creating or returning a node
//     public static Node insert(Node root,int key){
//        if(root==null){
//         root=new Node(key);
//         return root;
//        }
//        //key <root ->left subtree
//        if(root.data>key){
//        root.left= insert(root.left, key);
//        }

//        //key>root->right subtree
//        else{
//         root.right=insert(root.right, key);
//        }

//       return root;
//     }

//     //to verify we are using the inorder traversal
//     public static void inorder(Node root){
//         if(root==null){
//             return;
//         }
//         inorder(root.left);
//         System.out.print(root.data+" ");
//         inorder(root.right);
//     }
//     public static void main(String args[]){
//         int values[]={5,1,3,4,2,7};
//         Node root=null;
//         for(int i=0;i<values.length;i++){
//             root=insert(root, values[i]);
//         }
//         inorder(root);
//         System.out.println();
//     }
//  }
             

// //Search a BST
// /*
//  Time complexity:O(H)->As we traverse which is equal to the height of the tree
//  */
// import java.util.*;
// public class main2{
//     static class Node{
//         int data;
//         Node left;
//         Node right;

//         Node(int data){
//             this.data=data;
//         }
//     }

//     public static void inorder(Node root){
//         //base class
//         if(root==null){
//             return;
//         }
//      inorder(root.left);
//      System.out.print(root.data+" ");
//      inorder(root.right);
//     }

//     public static Node insert(Node root,int key){
//       if(root==null){
//         root=new Node(key);
//         return root;
//       }

//       if(root.data>key){
//         root.left=insert(root.left, key);
//       }
//       else{
//         root.right=insert(root.right, key);
//       }
//       return root;
//     }


//     public static boolean search(Node root,int key){
//         if(root==null){
//             return false;
//         }

//         if(root.data==key){
//             return true;
//         }
//         else if(root.data>key){
//             return search(root.left, key);
//         }
//         else{
//             return search(root.right, key);
//         }
//     }

//     //**Delete a Node */
//     public static Node delete(Node root,int key){
//         if(root.data>key){
//             root.left=delete(root.left, key);
//         }
//         else if(root.data<key){
//             root.right=delete(root.right,key);
//         }
//         else{//root.data==key means I have found here my key equal to the root value
//          //case 1
//          if(root.left==null && root.right==null){
//             return null;
//          }
         
//          //case 2
//          if(root.left==null){
//             return root.right;
//          }
//          else if(root.right==null){
//             return root.left;
//          }

//          //case 3
//          Node IS=inorderSuccesor(root.right);
//          root.data=IS.data;
//          root.right=delete(root.right,IS.data);

//         }
//         return root;
//     }

//     ///method function is for case 3:Two children->To find the inorder successor
//     public static Node inorderSuccesor(Node root){
//         while(root.left!=null){//to find the extreme left in right subtree
//             root=root.left;
//         }
//         return root;
//     }
 
//     //printInRange -print the inclusive range of numbers as mentioned

//     public static void printInRange(Node root,int x,int y){
//          if(root==null){
//             return;
//          }
      
//         if(root.data>=x && root.data<=y){
//             printInRange(root.left, x, y);
//             System.out.print(root.data+" ");
//             printInRange(root.right, x, y);
//         }
//         else if(root.data<=x){
//             printInRange(root.right, x, y);
//         }
//         else{
//             printInRange(root.left, x, y);
//         }
//     }

//     //root to leaf paths
//     /*
//      Here we are going from root to leaf in that we are finding the number of paths
//      To that we want the data structure which can add the traversed nodes 
//      ->Arraylist-We are using here an arraylist which is variable in size from which can traverse the array in invariable size as we dont know the size of an array
//      this conce[pt is like pre order traversal where we track first 
//      root(add)
//      left subtree if path found by touching the leaf node then we have to print that
//      right subtree if path found by touching the leaf node then we have to print that
//      */


//      public static void printPath(ArrayList<Integer>path){
//         for(int i=0;i<path.size();i++){
//             System.out.print(path.get(i)+" ->");
//         }
//         System.out.println();
//      }
//      public static void printRoot2Leaf(Node root,ArrayList<Integer>path){
//      if(root==null){
//         return;
//      }
//      path.add(root.data);
//      if(root.left==null&&root.right==null){//leaf
//         printPath(path);
//      }
//      else{//non-leaf
//         printRoot2Leaf(root.left, path);
//         printRoot2Leaf(root.right, path);
//      }
//      path.remove(path.size()-1);
//      }
//     public static void main(String args[]){
//        // int values[]={8,5,3,1,4,6,10,11,14};
//         int values[]={8,5,3,6,10,11,14};

//         Node root=null;
//         for(int i=0;i<values.length;i++){
//             root=insert(root,values[i]);
//         }
//         inorder(root);
//         System.out.println();

//         // if(search(root,1)){
//         //     System.out.println("found");
//         // }
//         // else{
//         //     System.out.println("Not found");
//         // }
//         // delete(root, 5);
//         // inorder(root);

//         //printInRange(root, 3, 12);
//         printRoot2Leaf(root, new ArrayList<>());

//     }
// }


// //Hashset-allows only unique elements
// import java.util.HashSet;
// import java.util.Iterator;
// public class main2{
//     public static void main(String args[]){
//       //declaring HashSet
//       HashSet<Integer> set=new HashSet<>();

//       //adding an element
//       set.add(1);//as like in an arrayList list.add()
//       set.add(2);
//       set.add(3);
//       set.add(1);

//       //size
//       System.out.println("Size of the set is " +  set.size());//prints size as 3 instead of 4 because it will not allow duplicate elements like 1 
      
//       //print all the elements
//       System.out.println(set);
//       //search or contains an element
//     //   if(set.contains(1)){
//     //     System.out.println("Set contains 1");
//     //   }

//     //   if(!set.contains(6)){//if set does'nt have 6 then it will be false due ! operator it will be true and print the statement given below
//     //     System.out.println("does not contain");
//     //   }

//     //   //delete 
//     //   set.remove(1);
//     //   if(!set.contains(1)){
//     //    System.out.println("does not contain 1 -we deleted 1");
//     //   }    

//     //Iterator
    
//       //It has mainly two functions->next() and hasNext()
//      //declaration of iterator
//      Iterator it=set.iterator();

//      while(it.hasNext()){
//         System.out.println(it.next());
//      }
//    }
// }


// //HashMap-Key and Value in pairs key has to be unique
// import java.util.*;
// //For HashMap I have to import the input package import java.util.HashMap; as I am using HashSet also here thats why I am using whole package
// public class main2{
//   public static void main(String args[]){
//     //decn-Key-String,value-Integer
//     HashMap<String,Integer> map=new HashMap<>();
//     //Insertion or adding HashMap
//     map.put("India",135);
//     map.put("China",125);
//     map.put("USA",30);
//     System.out.println(map);

//     //If I insert the new value then it will be updated from the old value
//     map.put("China",140);
//     System.out.println(map);

//    //search in HashMap
//    //1.for key-map.containsKey(Object key)
//   //  if(map.containsKey("India")){
//   //   System.out.println("Key is present here");
//   //  }
//   //  else{
//   //   System.out.println("key is not present here");
//   //  }

//   //2. for Value-map.get(objectkey);
//   // System.out.println(map.get("India"));
//   // System.out.println(map.get("Iran"));


//   //Iteration in HashMap
//   //decn-for(Map.Entry<datatype,datatype>e:map.entrySet())
//    //for(int val:arr)
//   //  for(Map.Entry<String,Integer>e:map.entrySet()){
//   //   System.out.println(e.getKey());//to get the key  by getKey()
//   //   System.out.println(e.getValue());//to get the value by getValue()
//   //  }

//   //  //other method particularly to access the key only
//   //  Set<String> keys=map.keySet();
//   //  for(String key:keys){
//   //   System.out.println(key+ " "+ map.get(key));
//   //  }

//   //to remove the key nd value from a HashMap -map.remove()
//   map.remove("China");//both its key and value will be removed from here
//   System.out.println(map);
//   }
// }


// //HashMap implementation-from scratch
// import java.util.*;

// public class main2{
//   static class HashMap<K,V>{//K,V->Generics-dont which data type these are
//      private class Node{
//       K key;
//       V value;
//     public Node(K key,V value){//constructor
//       this.key=key;
//       this.value=value;
//     }
//   }
//   private int n;//n=nodes
//   private int N;//N-arraySize
//   private LinkedList<Node>buckets[];
//   @SuppressWarnings("unchecked")
//   public HashMap(){
//     this.N=4;
//     this.buckets=new LinkedList[4];
//     for(int i=0;i<4;i++){
//       this.buckets[i]=new LinkedList<>();
//     }
//   }
   

//   //put-Key exist update,doesnt exist add new key
//   private int hashFunction(K key){
//     int bi=key.hashCode();//-122334 or positive 12345
//     //only positive bi are needed
//        return Math.abs(bi)%N;//%N gives the bi within the size of an array
//   }

//   private int searchInLL(K key,int bi){
//     LinkedList<Node>ll=buckets[bi];

//     for(int i=0;i<ll.size();i++){
//       if(ll.get(i).key==key){
//         return i;
//       }
//     }
//     return -1;
//   }

//    @SuppressWarnings("unchecked")
//    public void rehash(){
//     LinkedList<Node>oldBucket[]=buckets;
//     buckets=new LinkedList[N*2];

//     for(int i=0;i<N*2;i++){
//       buckets[i]=new LinkedList<>();
//     }

//     for(int i=0;i<oldBucket.length;i++){
//       LinkedList<Node> ll=oldBucket[i];
//       for(int j=0;j<ll.size();j++){
//         Node node=ll.get(j);
//         put(node.key,node.value);//it will add it in a new bucket only
//       }
//     }
//    }

//   public void put(K key,V value){
//     int bi=hashFunction(key);//to get the key first need to go on the bi where it is
//     int di=searchInLL(key,bi);

//     if(di==-1){//key doesnt exist
//       buckets[bi].add(new Node(key,value));
//       n++;
//     }
//     else{
//       Node node=buckets[bi].get(di);
//       node.value=value;
//     }
//     double lambda=(double)n/N;
//     if(lambda>2.0){
//       //rehashing
//       rehash();
//     }
//   }

//   public boolean containsKey(K key){//true or false
//     int bi=hashFunction(key);
//     int di=searchInLL(key, bi);

//     if(di==-1){
//       return false;
//     }
//     else{
//       return true;
//     }
//   }

//   public V remove(K key){
//     int bi=hashFunction(key);
//     int di=searchInLL(key, bi);

//     if(di==-1){
//       return null;
//     }
//     else{
//       Node node=buckets[bi].remove(di);
//       n--;
//       return node.value;
//     }
    
//   }
//   public V get(K key){//key exist value returnes not then return null
//     int bi=hashFunction(key);
//     int di=searchInLL(key,bi);

//     if(di==-1){
//       return null;
//     }
//     else{
//       Node node=buckets[bi].get(di);
//       return node.value;
//     }
//   }
//   public ArrayList<K>keySet(){
//     ArrayList<K> keys=new ArrayList<>();

//     for(int i=0;i<buckets.length;i++){
//       LinkedList<Node> ll=buckets[i];
//       for(int j=0;j<ll.size();j++){
//         Node node=ll.get(j);
//         keys.add(node.key);
//       }
//     }
//     return keys;
//   }
//   public boolean isEmpty(){
//     return n==0;//if nodes==0 then hashmap will be empty
//   }
//   }

//   public static void main(String args[]){
//     HashMap<String,Integer>map=new HashMap<>();
//     map.put("India",145);
//     map.put("China",115);
//     map.put("USA",45);

//     ArrayList<String>keys=map.keySet();//above keyset function of an arraylist will give the all values to it
//     for(int i=0;i<keys.size();i++){
//       System.out.println(keys.get(i)+ " " + map.get(keys.get(i)));
//     }
//     // map.remove("India");
//     // System.out.println(map.get("India"));
//   }
// }

//1.Majority element which appears more than n/3 times */
//Average time complexity->O(n)->linear time complexity
// import java.util.*;
// public class main2{
//   public static void majorityElement(int nums[]){
//     HashMap<Integer,Integer>map=new HashMap<>();
//     int n=nums.length;
//     for(int i=0;i<n;i++){
//       if(map.containsKey(nums[i])){//Key exists-true
//         map.put(nums[i],map.get(nums[i])+1);
//       }
//       else{//Key doesnt exists
//         map.put(nums[i],1);
//       }
//     }
    
//     for(int key:map.keySet()){
//         if(map.get(key)>n/3){
//           System.out.println(key);
//         }
//     }
//   }

  
//   public static void main(String args[]){
//     int nums[]={1,3,2,5,1,3,1,5,1};
//     majorityElement(nums);
//     }
//   }

//or

// import java.util.*;
// public class main2{
//   public static void main(String args[]){
//      int nums[]={1,3,2,5,3,3,3,5,1};
//    //int nums[]={1,2};
//     int n=nums.length;
//     HashMap<Integer,Integer>map=new HashMap<>();
//     for(int i=0;i<n;i++){
//       if(map.containsKey(nums[i])){
//         map.put(nums[i],map.get(nums[i])+1);
//       }
//       else{
//         map.put(nums[i],1);
//       }
//     }
//     for(int key:map.keySet()){
//       if(map.get(key)>n/3){
//         System.out.println(key);
//       }
//     }
//   }
// }

// //2.union of two arrays
// //Time complexity->O(n)

// import java.util.*;
// public class main2{
//   public static void main(String args[]){
//     int arr1[]={7,3,9};
//     int arr2[]={6,3,9,2,9,4};
//     HashSet<Integer>set=new HashSet<>();

//     for(int num:arr1){
//       set.add(num);
//     }

//     for(int num:arr2){
//       set.add(num);
//     }
//     System.out.println(set);
//     System.out.println(set.size());
//   }
// }


// //3.Intersection of two arrays
// import java.util.*;
// public class main2{
//   public static void main(String args[]){
//     int arr1[]={7,3,9};
//     int arr2[]={6,3,9,2,9,4};
//     HashSet<Integer>set=new HashSet<>();
//     HashSet<Integer>intersection=new HashSet<>();

//     for(int num:arr1){
//       set.add(num);
//     }

//     for(int num:arr2){
//       if(set.contains(num)){
//         intersection.add(num);
//       }
//     }
//     System.out.println(intersection);
//     System.out.println(intersection.size());
  
//   }
// }


// //Find the itenarary of tickets***
// import java.util.*;

// public class main2{

//   public static String getStart(HashMap<String,String>tick){
//     //reverse map for simplication of problem tick.get(key)->key,key->value
//     HashMap<String,String>revMap=new HashMap<>();
//      for(String key:tick.keySet()){
//        revMap.put(tick.get(key),key);
//      }
//      for(String key:tick.keySet()){
//       if(!revMap.containsKey(key)){
//         return key;
//       }
//      }
//      return null;

     
//   }
//   public static void main(String args[]){
//     HashMap<String,String>tickets=new HashMap<>();
//     tickets.put("Chennai","Bangalore");
//     tickets.put("Mumbai","Delhi");
//     tickets.put("Goa","Chennai");
//     tickets.put("Delhi","Goa");

//     String start=getStart(tickets);
//     while(tickets.containsKey(start)){
//       System.out.print(start + "->");
//       start=tickets.get(start);
//     }
//     System.out.print(start);
//   }
// }


//Subarray sum equal to k

// import java.util.*;
// public class main2{
//   public static void main(String[] args) {
//     HashMap<Integer,Integer> map=new HashMap<>();
//     int arr[]={10,2,-2,-20,10};
//     int k=-10;
//     int sum=0;
//     int ans=0;
    

//     map.put(0,1);
//     for(int j=0;j<arr.length;j++){
//       sum+=arr[j];
//       if(map.containsKey(sum-k)){
//            ans+=map.get(sum-k);
//       }
//       if(map.containsKey(sum)){
//           map.put(sum,map.get(sum)+1);
//       }
//       else{
//         map.put(sum,1);
//       }
//     }
//     System.out.println(ans);
//   }
// }

// //Trie data structure
// public class main2{
//   static class Node{
//     Node children[];
//     boolean eow;

//     public Node(){
//       children=new Node[26];
//       for(int i=0;i<26;i++){
//         children[i]=null;
//       }
//       eow=false;
//     }
//   }
//   /*
//    * Insert in Trie-Google,amazon->O(L)->L-length of a largest string word 
//    */

//   static Node root=new Node();

//   public static void insert(String word){
//     Node curr=root;
//     for(int i=0;i<word.length();i++){
//         int idx=word.charAt(i)-'a';
//         if(curr.children[idx]==null){
//           curr.children[idx]=new Node();
//         }

//         if(i==word.length()-1){
//           curr.children[idx].eow=true;
//         }
//       curr=curr.children[idx];
//     }
//   }

//   //search in trie
//   public static boolean search(String key){
//     Node curr=root;
//     for(int i=0;i<key.length();i++){
//     int idx=key.charAt(i)-'a';
//     if(curr.children[idx]==null){
//       return false;
//     }
//     if(i==key.length()-1 && curr.children[idx].eow==false){
//       return false;
//     }
//     curr=curr.children[idx];
//     }
//     return true;
//   }
//   public static void main(String args[]){
//     String words[]={"the","a","there","their","any"};
//     for(int i=0;i<words.length;i++){
//       insert(words[i]);
//     }
//     System.out.println(search("their"));
//     System.out.println(search("thor"));
//     System.out.println(search("an"));
//   }
// }


// //*Word break problem */
// public class main2{
//   //trie basic declaration for all problems related to the trie data structure
//   static class Node{
//     Node childrens[];
//     boolean eow;

//     public Node(){
//       childrens=new Node[26];
//       for(int i=0;i<26;i++){
//         childrens[i]=null;
//         eow=false;
//       }
//     }
//   }
//     static Node root=new Node();
  

//   public static void insert(String word){
//     Node curr=root;
//     for(int i=0;i<word.length();i++){
//     int idx=word.charAt(i)-'a';
//     if(curr.childrens[idx]==null){
//       curr.childrens[idx]=new Node();
//     }
//     if(i==word.length()-1){
//        curr.childrens[idx].eow=true;
//     }
//     curr=curr.childrens[idx];
//     }
//   }

//   public static boolean search(String key){
//     Node curr=root;
//     for(int i=0;i<key.length();i++){
//       int idx=key.charAt(i)-'a';
//       if(curr.childrens[idx]==null){
//         return false;
//       }
//       if(i==key.length()-1 && curr.childrens[idx].eow==false){
//         return false;
//       }
//       curr=curr.childrens[idx];
//     }
//     return true;
//   }
//   //wordBreak
//   public static boolean wordBreak(String key){
//     if(key.length()==0){
//       return true;
//     }
//     for(int i=1;i<=key.length();i++){
//       String firstPart=key.substring(0,i);
//       String secondPart=key.substring(i);
//       if(search(firstPart) && wordBreak(secondPart)){
//         return true;
//       }

//     }
//     return false;
//   }
//   public static void main(String args[]){
//     String words[]={"i", "like", "sam", "samsung" ,"mobile"};
//     String key="ilikesamsung";
//     for(int i=0;i<words.length;i++){
//       insert(words[i]);
//     }
//     System.out.println(wordBreak(key));
//   }
// }

// /*startsWith problem */
// public class main2{
//   static class Node{
//     Node childrens[];
//     boolean eow;

//     public Node(){
//       childrens=new Node[26];
//       for(int i=0;i<26;i++){
//         childrens[i]=null;
//       }
//       eow=false;
//     }
//   }
//   static Node root=new Node();
//   public static void insert(String word){
//         Node curr=root;
//         for(int i=0;i<word.length();i++){
//         int idx=word.charAt(i)-'a';
//         if(curr.childrens[idx]==null){
//           curr.childrens[idx]=new Node();
//         }
//         if(i==word.length()-1){
//            curr.childrens[idx].eow=true;
//         }
//         curr=curr.childrens[idx];
//         }
//       }
    
//       public static boolean search(String key){
//         Node curr=root;
//         for(int i=0;i<key.length();i++){
//           int idx=key.charAt(i)-'a';
//           if(curr.childrens[idx]==null){
//             return false;
//           }
//           if(i==key.length()-1 && curr.childrens[idx].eow==false){
//             return false;
//           }
//           curr=curr.childrens[idx];
//         }
//         return true;
//       }
//   public static boolean startsWith(String prefix){
//        Node curr=root;
//        for(int i=0;i<prefix.length();i++){
//         int idx=prefix.charAt(i)-'a';
//         if(curr.childrens[idx]==null){
//           return false;
//         }
//         if(i==prefix.length()-1 && curr.childrens[idx].eow==false){
//            return false;
//         }
//         curr=curr.childrens[idx];
//        }
//        return true;
//   }
//   public static void main(String args[]){
//     String words[]={"apple","app","mango","man","woman"};
//     String prefix="moon";
//     for(int i=0;i<words.length;i++){
//       insert(words[i]);
//     }
//     System.out.println(startsWith(prefix));
//   }
// }

//*Count unique substrings */

// public class main2{
//   static class Node{
//     Node childrens[];
//     boolean eow;
//   public Node(){
//     childrens=new Node[26];
//     for(int i=0;i<26;i++){
//       childrens[i]=null;
//     }
//     eow=false;
//   }
// }

// static Node root=new Node();

// public static void insert(String suffix){
//   Node curr=root;
//    for(int i=0;i<suffix.length();i++){
//       int idx=suffix.charAt(i)-'a';
    
//       if(curr.childrens[idx]==null){
//         curr.childrens[idx]=new Node();
//       }
//       if(i==suffix.length()-1){
//         curr.childrens[idx].eow=true;
//       }
//       curr=curr.childrens[idx];
//    }
// }

// public static int countNodes(Node root){
//      if(root==null){
//       return 0;
//      }
//      int count=0;
//      for(int j=0;j<26;j++){
//       if(root.childrens[j]!=null){
//             count+=countNodes(root.childrens[j]);
//       }
//     }
//     return count+1;
// }

 
//   public static void main(String[] args) {
//     String str="ababa";
  
// for(int i=0;i<str.length();i++){
//   String suffix=str.substring(i);
//   insert(suffix);
// }
//   System.out.println(countNodes(root));
//   }
// }

// //Homework
// public class main2{
//   static class Node{
//     Node childrens[];
//     boolean eow;
//     public Node(){
//       childrens=new Node[26];
//       for(int i=0;i<26;i++){
//         childrens[i]=null;
//       }
//       eow=false;
//     }
//   }
//   static Node root=new Node();

//   public static void insert(String suffix){
//     Node curr=root;
//     for(int i=0;i<suffix.length();i++){
//       int idx=suffix.charAt(i)-'a';
//       if(curr.childrens[idx]==null){
//         curr.childrens[idx]=new Node();
//       }
//       if(i==suffix.length()-1){
//         curr.childrens[idx].eow=true;
//       }
//       curr=curr.childrens[idx];
//     }
//   }
//   public static int countNodes(Node root){
//     if(root==null){
//       return 0;
//     }
//     int count=0;
//     for(int i=0;i<26;i++){
//       if(root.childrens[i]!=null){
//         count+=countNodes(root.childrens[i]);
//       }
//     }
//     return count+1;
//   }
//   public static void main(String[] args) {
//     String str="apple";
//     for(int i=0;i<str.length();i++){
//       String suffix=str.substring(i);
//       insert(suffix);
//     }
//     System.out.println(countNodes(root));
    
//   }
 
// }

// //*Longest with all prefixes */
// public class main2{
//   static class Node{
//     Node childrens[];
//     boolean eow;
//     public Node(){
//       childrens=new Node[26];
//       for(int i=0;i<26;i++){
//         childrens[i]=null;
//       }
//       eow=false;
//     }
//   }

//   static Node root=new Node();
//   static String ans=" ";

  
//   public static void insert(String word){
//     Node curr=root;
//     for(int i=0;i<word.length();i++){
//       int idx=word.charAt(i)-'a';
//       if(curr.childrens[idx]==null){
//         curr.childrens[idx]=new Node();
//       }
//       if(i==word.length()-1){
//            curr.childrens[idx].eow=true;
//       }
//       curr=curr.childrens[idx];
//     }
//   }

//   public static void longestWord(Node root,StringBuilder temp){
//     if(root==null){
//       return;
//     }
//      for(int i=0;i<26;i++){
//       if(root.childrens[i]!=null && root.childrens[i].eow==true){
//         temp.append((char)(i+'a'));//this (char)(i+'a')->gives the character from integer avlue from the i 
//         if(temp.length()>ans.length()){
//             ans=temp.toString();
//         }
//         longestWord(root.childrens[i], temp);
//         temp.deleteCharAt(temp.length()-1);
//       }
//      }
//   }

//   public static void main(String args[]){
//     String words[]={"a","banana","app","appl","ap","apply","apple"};
//     for(int i=0;i<words.length;i++){
//       insert(words[i]);
//     }
//      longestWord(root,new StringBuilder(" "));
//      System.out.println(ans);
//   }
// }


//*Graph */

// //Adjacency List->creating graph unweighted
// import java.util.*;
// public class main2{
//   static class Edge{
//     int scr;
//     int dest;

//     public Edge(int s,int d){
//       this.scr=s;
//       this.dest=d;
//     }
//   }

//   public static void createGraph(ArrayList<Edge> graph[]){
//     //Initially when arrayList is created it is having null value->it can be undefined cant store the values in inedxes so we to convert null to Empty arrayList
//     for(int i=0;i<graph.length;i++){
//       graph[i]=new ArrayList<Edge>();//empty arrayList is created now we can store the values
//     }
//     graph[0].add(new Edge(0, 2));

//     graph[1].add(new Edge(1,2));
//     graph[1].add(new Edge(1,3));

//     graph[2].add(new Edge(2,0));
//     graph[2].add(new Edge(2,1));
//     graph[2].add(new Edge(2,3));

//     graph[3].add(new Edge(3,1));
//     graph[3].add(new Edge(3,2));
//   }
//   public static void main(String args[]){
//     int v=4;
//     ArrayList<Edge> graph[]=new ArrayList[v];

//     //printing the neighbours of 2  
//     //Time complexity->O(X) where X-no of neighbours or destinations
//     createGraph(graph);
//     for(int i=0;i<graph[2].size();i++){
//       Edge e=graph[2].get(i);
//       System.out.print(e.dest + " ");
//     }
//   }
// }

// //creating graph->With weighted graph
// import java.util.*;
// public class main2{
//   static class Edge{
//     int scr;
//     int dest;
//     int wgt;

//     public Edge(int s,int d,int w){
//       this.scr=s;
//       this.dest=d;
//       this.wgt=w;
//     }
//   }

//   public static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0;i<graph.length;i++){
//       graph[i]=new ArrayList<Edge>();
//     }
//     graph[0].add(new Edge(0,2,-1));
//     graph[1].add(new Edge(1,2,10));
//     graph[1].add(new Edge(1,3,0));
//     graph[2].add(new Edge(2,0,-1));
//     graph[2].add(new Edge(2,1,10));
//     graph[2].add(new Edge(2,3,-1));
//     graph[3].add(new Edge(3,1,0));
//     graph[3].add(new Edge(3,2,-1));
//   }
//   public static void main(String args[]){
//      int v=4;
//      ArrayList<Edge> graph[]=new ArrayList[v];
//      createGraph(graph);
//      for(int i=0;i<graph[2].size();i++){
//       Edge e=graph[2].get(i);
//       System.out.println(e.dest + " , " + e.wgt);
//      }
//   }
// }

//*BFS-Breadth First Traversal ->Time complexity-O(V+E) when V>>E=O(V) or E>>V=O(E)*/
// import java.util.*;
// public class main2{
//   static class Edge{
//     int scr;
//     int dest;

//     public Edge(int s,int d){
//       this.scr=s;
//       this.dest=d;
//     }
//   }

//   public static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0;i<graph.length;i++){
//       graph[i]=new ArrayList<Edge>();
//     }

//     graph[0].add(new Edge(0, 1));
//     graph[0].add(new Edge(0, 2));

//     graph[1].add(new Edge(1,0));
//     graph[1].add(new Edge(1,3));

//     graph[2].add(new Edge(2,0));
//     graph[2].add(new Edge(2,4));

//     graph[3].add(new Edge(3,1));
//     graph[3].add(new Edge(3,4));
//     graph[3].add(new Edge(3,5));

//     graph[4].add(new Edge(4,2));
//     graph[4].add(new Edge(4,3));
//     graph[4].add(new Edge(4,5));

//     graph[5].add(new Edge(5,3));
//     graph[5].add(new Edge(5,4));
//     graph[5].add(new Edge(5,6));

//     graph[6].add(new Edge(6,5));
    
//   }

//   //BFS
//   ///disconnected graph code which have //  ,Time complexity=O(V+E)
//   // public static void bfs(ArrayList<Edge> graph[],int v,boolean vis[],int start) 
//   public static void bfs(ArrayList<Edge> graph[],int v){
//        Queue<Integer> q=new LinkedList<>();
//        boolean vis[]=new boolean[v];

//        q.add(0);
//         //q.add(starting);
//        while(!q.isEmpty()){
//         int curr=q.remove();
//         if(vis[curr]==false){
//           System.out.print(curr + " ");
//           vis[curr]=true;
//           for(int i=0;i<graph[curr].size();i++){
//             Edge e=graph[curr].get(i);
//             q.add(e.dest);
//           }
      
//         }
//        }
//   }
//   public static void main(String args[]){
//     int v=7;
//     ArrayList<Edge> graph[]=new ArrayList[v];
//     // boolean vis[]=new boolean[v];
  
//     createGraph(graph);
//      bfs(graph, v);
//     // for(int i=0;i<v;i++){
//     //   if(vis[i]==false){
//     //     bfs(graph, v, vis, i);
//     //   }
//     // }
//     System.out.println();

   
//   }
// }


//*DFS-Depth First Search */
// import java.util.*;
// public class main2{
//   static class Edge{
//     int scr;
//     int dst;

//     public Edge(int s,int d){
//       this.scr=s;
//       this.dst=d;
//     }
//   }

//   public static void createGraph(ArrayList<Edge> graph[]){
//     for(int i=0;i<graph.length;i++){
//       graph[i]=new ArrayList<Edge>();
//     }

//     graph[0].add(new Edge(0, 1));
//     graph[0].add(new Edge(0,2));

//     graph[1].add(new Edge(1,0));
//     graph[1].add(new Edge(1,3));

//     graph[2].add(new Edge(2,0));
//     graph[2].add(new Edge(2,4));

//     graph[3].add(new Edge(3,1));
//     graph[3].add(new Edge(3,4));
//     graph[3].add(new Edge(3,5));

//     graph[4].add(new Edge(4,2));
//     graph[4].add(new Edge(4,3));
//     graph[4].add(new Edge(4,5));

//     graph[5].add(new Edge(5,3));
//     graph[5].add(new Edge(5,4));
//     graph[5].add(new Edge(5,6));

//     graph[6].add(new Edge(6,5));
//   }

  
//   public static void dfs(ArrayList<Edge> graph[],int curr,boolean vis[]){//recursive function
//      System.out.print(curr + " ");
//      vis[curr]=true;

//      for(int i=0;i<graph[curr].size();i++){
//       Edge e=graph[curr].get(i);
//       if(vis[e.dst]==false)
//          dfs(graph, e.dst, vis);
//      }

//   }
//   public static void main(String args[]){
//     int v=7;
//      ArrayList<Edge> graph[]=new ArrayList[v];
//      boolean vis[]=new boolean[v];
//      createGraph(graph);
//       dfs(graph, 0, vis);

//     //# disconnected graph
//     //  for(int i=0;i<v;i++){
//     //   if(vis[i]==false){
//     //      dfs(graph, i, vis);
//     //   }
//     //  }
//      System.out.println();
//   }
// }


// //All paths from source to target
// import java.util.*;
// public class main2{
//   static class Edge{
//     int src;
//     int dest;
//     public Edge(int s,int d){
//       this.src=s;
//       this.dest=d;
//     }
//   }
//   public static void printGraph(ArrayList<Edge> graph[]){
//     for(int i=0;i<graph.length;i++){
//       graph[i]=new ArrayList<Edge>();
//     }
//     graph[0].add(new Edge(0, 1));
//     graph[0].add(new Edge(0,2));

//     graph[1].add(new Edge(1,0));
//     graph[1].add(new Edge(1,3));

//     graph[2].add(new Edge(2,0));
//     graph[2].add(new Edge(2,4));

//     graph[3].add(new Edge(3,1));
//     graph[3].add(new Edge(3,4));
//     graph[3].add(new Edge(3,5));

//     graph[4].add(new Edge(4,2));
//     graph[4].add(new Edge(4,3));
//     graph[4].add(new Edge(4,5));

//     graph[5].add(new Edge(5,3));
//     graph[5].add(new Edge(5,4));
//     graph[5].add(new Edge(5,6));

//     graph[6].add(new Edge(6,5));
//   }

//   public static void allPaths(ArrayList<Edge>graph[],int curr,boolean vis[],String path,int tar)//O(v^v)
//   {
//     if(curr==tar){//base case
//       System.out.println(path);
//       return;
//     }

//     for(int i=0;i<graph[curr].size();i++){
//       Edge e=graph[curr].get(i);
//       if(vis[e.dest]==false){
//         vis[curr]=true;
//       allPaths(graph,e.dest,vis,path+e.dest,tar);
//       vis[curr]=false;
//       }
//     }
//   }
  
//   public static void main(String args[]){
//       int v=7;
//       ArrayList<Edge>graph[]=new ArrayList[v];
//       boolean vis[]=new boolean[v];
//       int scr=0;
//       printGraph(graph);
    
//       allPaths(graph, scr, vis,"0", 5);
  
   
     
//   }
// }

// //***Cycle detection**
//   //->Directed graph(DFS)
// import java.util.*;
//  public class main2{
//     static class Edge{
//         int scr;
//         int dest;

//         public Edge(int s,int d){
//             this.scr=s;
//             this.dest=d;
//         }
//     }

//     public static void createGraph(ArrayList<Edge>graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0, 2));
//         graph[1].add(new Edge(1, 0));
//         graph[2].add(new Edge(2, 3));
//         graph[3].add(new Edge(3,0));
//     }

//     public static boolean modifieddfs(ArrayList<Edge>graph[],int curr,boolean vis[],boolean rec[]){
//         vis[curr]=true;
//         rec[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e=graph[curr].get(i);
//             if(rec[e.dest]==true){
//                return true;
//             }
//             else if(vis[e.dest]==false){
//                if(modifieddfs(graph, e.dest, vis, rec)){
//                   return true;
//                }
//             }
//         }
//         rec[curr]=false;
//         return false;
//     }
//     public static void main(String args[]){
//        int v=4;
//        ArrayList<Edge>graph[]=new ArrayList[v];
//        boolean vis[]=new boolean[v];//to track the visited nodes
//        boolean rec[]=new boolean[v];//to track those visited nodes in rec array again to search easily instaed of using recursion stack
//        createGraph(graph);
//        System.out.println(modifieddfs(graph, 0, vis, rec));

//     //    //considering components with no direction from source to all nodes-undirected graph
//     //    for(int i=0;i<v;i++){
//     //     if(!vis[i]){
//     //     boolean isCycle=modifieddfs(graph, 0, vis, rec);
//     //     if(isCycle) 
//     //       System.out.println(isCycle);
//     //       break;
//     //     }
//     //    }
      
//     }
//  }



/*
 *** Topological sorting ***
 ->It will work only for the Directed Acyclic Graphs(DAG)
 ->Not for the Directed Cyclic graphs
 ->Defn:It is the linear order of the vertices such that every directed edge u->v the vertex u comes before v in the order

  see 
  
  ->Topological sorting shows the dependancy of vertices
  Eg:
     Action1:buy laptop
     Action2:install os/windows
     Action3:install code editor
     Action4:install java
     Action5:write code 
      see notes
      
 */

 //**Topological sorting**:Modified DFS is using here vis[] is normal as usual stack is using here, see notes
 //Time complexity->O(V+E)
//   import java.util.*;
//   public class main2{
//    static class Edge{
//       int scr;
//       int dest;

//       public Edge(int s,int d){
//          this.scr=s;
//          this.dest=d;
//       }
//    }
//    public static void createGraph(ArrayList<Edge>graph[]){
//       for(int i=0;i<graph.length;i++){
//          graph[i]=new ArrayList<Edge>();
//       }
//       graph[2].add(new Edge(2,3));
//       graph[3].add(new Edge(3,1));   
//       graph[4].add(new Edge(4,0));
//       graph[4].add(new Edge(4,1));
//       graph[5].add(new Edge(5,0));   
//       graph[5].add(new Edge(5,2));


//    }

//    public static void topoSort(ArrayList<Edge>graph[],int curr,boolean vis[],Stack<Integer>s ){
//       vis[curr]=true;
//       for(int i=0;i<graph[curr].size();i++){
//          Edge e=graph[curr].get(i);
//          if(vis[e.dest]==false)
//          topoSort(graph, e.dest, vis, s);
//       }
//       s.push(curr);
//    }

//    public static void main(String args[]){
//      int v=6;
//      ArrayList<Edge>graph[]=new ArrayList[v];
//    Stack<Integer> s=new Stack<>();
//      boolean vis[]=new boolean[v];
//      createGraph(graph);
//      topoSort(graph, 0, vis, s);
//      for(int i=0;i<v;i++){
//       if(vis[i]==false)
//         topoSort(graph, i, vis, s);
//      }
//      while(!s.isEmpty()){
//      System.out.print(s.pop() + " ");
//      }
  
//    }
//   }

/*
 *** Cycle in graphs ***
 Time complexity->O(V+E)
     Undirected graph->methods to implement
                     1.DFS
                     2.BFS
                     3.DSU(disjoint set unit)
               
     Directed graph->methods to implement
                    1.DFS
                    2.BFS
                    3.Topological sorting(Kahns algorithm)
                    4.graph coloring
 */


//  import java.util.*;
//  public class main2{
//     static class Edge{
//         int scr;
//         int dest;
//         public Edge(int s,int d){
//             this.scr=s;
//             this.dest=d;
//         }
//     }

//     public static void createGraph(ArrayList<Edge>graph[]){
//         for(int i=0;i<graph.length;i++){
//             graph[i]=new ArrayList<Edge>();
//         }

//         graph[0].add(new Edge(0,1));
//         graph[0].add(new Edge(0,4));
//         graph[1].add(new Edge(1,0));
//         graph[1].add(new Edge(1,2));
//         graph[1].add(new Edge(1,4));
//         graph[2].add(new Edge(2,1));
//         graph[2].add(new Edge(2,3));
//         graph[3].add(new Edge(3,2));
//         graph[4].add(new Edge(4,0));
//         graph[4].add(new Edge(4,1));
//         graph[4].add(new Edge(4,5));
//         graph[5].add(new Edge(5,4));
//     }

//     public static boolean cycleUndirected(ArrayList<Edge>graph[],boolean vis[],int curr,int pare){
//         vis[curr]=true;
//         for(int i=0;i<graph[curr].size();i++){
//             Edge e=graph[curr].get(i);
//             //conditios checking for cycle detection
//             if(vis[e.dest]==true && pare!=e.dest){
//                return true;//1st condition when node is visited but not the parent of current node then cycle is guaranteed
//             }
//             //2nd condition when node->visited and par->e.dest then there is no need of doing nothing

//            else if(!vis[e.dest]){
//                 if(cycleUndirected(graph, vis, e.dest, curr)){
//                     return true;//3rd condition when node is visited then make the node visited and further process to find the node as it amy have any node visited after the sometime
//                 }
//             }
//         }
//         return false;

//     }
//     public static void main(String args[]){
//         int v=6;
//         ArrayList<Edge> graph[]=new ArrayList[v];
//         boolean vis[]=new boolean[v];
//         createGraph(graph);
//         System.out.println(cycleUndirected(graph, vis, 0, -1));

//     }
//  }


//Topological sorting->Kahn's algorithm
// import java.util.*;
// public class main2{
//     static class Graph{
//        List<List<Integer>>adjList;//Creates the adjacency list which represents the graph 
//        Graph(int vertice){
//         adjList=new ArrayList<>();//Created the outer arraylist
//         for(int i=0;i<vertice;i++){
//         adjList.add(new ArrayList<>());//makes the adjlist as empty from null then only its valid 
//         }
//     }
//         void addEdge(int src,int dest){//src-0 dest-1
//              adjList.get(src).add(dest);//0-->1
//         }

//         List<Integer>getConnectedNodes(int node){//used to give the neighbours(outgoing edges) for a particular node
//             return adjList.get(node);//node-0 then return neighbours 1 and 2
//         }
       
//     }

//     public static void kahnsTopologicalSort(Graph g){
//       int totalVertex=g.adjList.size();//get the total number of vertices->6
//       int indegree[]=new int[totalVertex];//creates the dependancy(shows the number of incoming edges to a node) array

//       //Dependency
//       for(int i=0;i<totalVertex;i++){
//         for(int neighbour:g.getConnectedNodes(i)){//returns the neighbour node-> 0 returns the neighbour node 2
//              indegree[neighbour]++;//indegree[2]++->means 2 have 1 dependency from 0
//         }
//       }

//       Queue<Integer> q=new LinkedList<>();

//       //1st->Add the node of 0 dependency in queue
//       for(int i=0;i<totalVertex;i++){//for 1st node which does not have any incoming edges ->0
//         if(indegree[i]==0){
//             q.add(i);
//         }
//       }

//       List<Integer> topologicalSort=new ArrayList<>();
 
//       //2nd->Then add these nodes of queue to an topological sort array  
//       for(int i=0;i<totalVertex;i++){
//         int vertex=q.poll();//pop the node from the queue and add it in a topologicalsorted array
//         topologicalSort.add(vertex);

//         for(int neighbour:g.getConnectedNodes(vertex)){
//             indegree[neighbour]--;
//             if(indegree[neighbour]==0)//for other nodes after 1st node
//                q.add(neighbour);
//         }
//       }
//       if(topologicalSort.size()==totalVertex){
//         System.out.println("topological sort " + topologicalSort);
//       }
//       else{
//         System.out.println("Cycle detected topological sort is not possible");
//       }

//     }
//     public static void main(String args[]){
//       Graph g=new Graph(6);
//       g.addEdge(0, 1);
//       g.addEdge(0, 2);
//       g.addEdge(1, 3);
//       g.addEdge(1, 4);
//       g.addEdge(2, 3);
//       g.addEdge(3, 5);
//       g.addEdge(4,5);

//       kahnsTopologicalSort(g);
//     }
// }


// // ** Dijkstra  algorithm **/
// //Time complexity->O(E+Elogv)
// import java.util.*;
// public class main2{
//     static class Edge{
//         int scr;
//         int dest;
//         int wt;

//         public Edge(int s,int d,int w){
//             this.scr=s;
//             this.dest=d;
//             this.wt=w;

//         }
//     }
     
//     public static void createGraph(ArrayList<Edge>graph[]){
//       for(int i=0;i<graph.length;i++){
//         graph[i]=new ArrayList<>();
//       }

//         graph[0].add(new Edge(0,1,2));
//         graph[0].add(new Edge(0,2,4));
//         graph[1].add(new Edge(1,2,1));
//         graph[1].add(new Edge(1,3,7));
//         graph[2].add(new Edge(2,4,3));
//         graph[3].add(new Edge(3,5,1));
//         graph[4].add(new Edge(4,3,2));
//         graph[4].add(new Edge(4,5,5));

      
//     }

//     public static class Pair implements Comparable<Pair>{
//         int node;
//         int dist;

//         public Pair(int n,int d){
//             this.node=n;
//             this.dist=d;
//         }
//         @Override
//         public int compareTo(Pair p2){
//            return this.dist-p2.dist;//ascending order which help in making the priority queue based on the shortest distance
//         }
//     }

//     public static void dijkstara(ArrayList<Edge>graph[],int scr,int V){
//         PriorityQueue<Pair>pq=new PriorityQueue<>();
//         int diste[]=new int[V];
//         boolean vis[]=new boolean[V];
//         for(int i=0;i<V;i++){
//             if(i!=scr){
//                 diste[i]=Integer.MAX_VALUE;
//             }
//         }
//        pq.add(new Pair(0,0));
//        //diste[scr]=0;
//        while(!pq.isEmpty()){
//         Pair curr=pq.poll();
//         if(!vis[curr.node]){
//             vis[curr.node]=true;
//             for(int i=0;i<graph[curr.node].size();i++){
//                 Edge e=graph[curr.node].get(i);
//                 int u=e.scr;
//                 int v=e.dest;
//                 //Relaxation algorithm
//                 if(diste[u]+e.wt<diste[v]){
//                    diste[v]=diste[u]+e.wt;
//                    pq.add(new Pair(v,diste[v]));
//                 }

//             }
//         }
//        }
//        for(int i=0;i<V;i++){
//         System.out.print(diste[i] + " ");
//        }
//        System.out.println();
//     }
//     public static void main(String[] args) {
//         int V=6;
//         ArrayList<Edge>graph[]=new ArrayList[V];
//         createGraph(graph);
//         dijkstara(graph, 0, V);
//     }
// }



//****Exception Handling****/
/*Defn:Exception handling is a situation where unexcepted or exceptional happens and that will amnage by the developers during the execution of a program

5 Components of Exception handling
Try  block
catch
finally-to clean the memory,Optional one which has to run whether it has exception or not compulsarily it can use alternative as catch 
throw
throws
*/

//EX1:Try,catch
// public class main2{  
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6,7,8};
//         System.out.println(arr[1]);//normally print because it was there in the array not an exception
//         //System.out.println(arr[-1]);//exception AOBE error where it shows exception which is not in the array

//         //->1.If I dont want to to affect this exception for others which comes after this then I have to do
//         try{
//             System.out.println(arr[-1]);//By this it will skip the exception part and print the correct ones
//         }catch(Exception e){
//              //2.If want print the correct one with showing that this is exception then
//              //System.out.println(e.getMessage());
//         }
//         System.out.println(arr[0]);//after the AOBE or exception whatever u will print it will not and considered in teh error
//     }
// }


//Ex2:finally-to clean the memory,Optional one which has to run whether it has exception or not compulsarily it can use alternative as catch 
// public class main2{
//     public static void main(String[] args) {
//         int arr[]={1,2,3,4,5,6};
//         System.out.println(arr[1]);
//         try{
//             System.out.println(arr[-1]);
//         }
//         //Finally will be used after the try to skip the exception and printing the next part in the finally
//         finally{
//             System.out.println(arr[0]);
//         }
//     }
// }

// //Ex3:Throw and Throws are the unexcepted exceptions,throw->comes before the statements and throws->comes after the  function or methods
// public class main2{
//     public static void main (String[] args) throws Exception{
//         int arr[]={1,2,3,4,5,6};
//         myException();
       
//     }
//     static void myException() throws Exception{
//         throw new Exception("something went wrong"); 
//     }
// }


/* ***Multithreading***
  Multitasking->working on the same server  by different people
  Multiprocessing->different processes is happening in the same operating system
  Multithreading->Different multitasking in a process

  Multiprocessing+Multithreading is used to achieve the multitasking


  Concurrency and Parallelism
  Concurrency->Doing multiple task but we can do this task after one another ex:doing coding and then whistle happens for cooker doing cooking
  Parallelism->Doing multiple tasks at a instance ex:texting messagesin phone and said my frind to cook at a same time
 */


 //*Concurrency Example */
//  //1.Creating a thread by extending the thread class
//  class Mythread1 extends Thread{//taking Mythread class from Thread class in Multithreading have to sue like this only
//   public void run(){
//     int i=0;
//     while(i<400){
//       System.out.println("Thread1 doing cooking");
//       System.out.println("I am happy");
//        i++;
//     }
//   }
//  }

//  class Mythread2 extends Thread{
//   public void run(){
//     int i=0;
//     while(i<400){
//       System.out.println("Thread2 doing chatting");
//       System.out.println("I am sad");
//        i++;
//     }
//   }
//  }
//  public class main2{
//   public static void main(String[] args) {
//     Mythread1 t1=new Mythread1();
//     Mythread2 t2=new Mythread2();
//     t1.start();//know that run function is used but in threading Java start() fn has to use which directly calls the run function
//     t2.start();
//   }
//  }

//2.Creating a thread by implementing the runnable interface

// class Mythreadrunnable1 implements Runnable{
//   public void run(){
//     int i=0;
//     while(i<400){
//       System.out.println("Mythreadrunnable1 is a thread not a threat 1");
//       i++;
//     }
//   }
// }
// class Mythreadrunnable2 implements Runnable{
//   public void run(){
//     int i=0;
//     while(i<400){
//       System.out.println("MythreadRunnable2 is a thread not a threat 2  ");
//       i++;
//     }
//   }
// }
// class main2{
//   public static void main(String[] args) {
//    Mythreadrunnable1 bullet1=new Mythreadrunnable1();
//     Mythreadrunnable2 bullet2=new Mythreadrunnable2();
//     //Here start will not work automatically by itself like previous extend methid need to call it in a main class object
//     Thread gun1=new Thread(bullet1);
//     Thread gun2=new Thread(bullet2);
//     gun1.start();
//     gun2.start();

//   }
// }


/*Life Cycle of a thread 
  Different stages of life cycle of a thread is 
   1.New->creation of instance of a class and not yet start() function is invoked
   2.Runnable->Start() function will be invoked
   3.Running->After this thread scheduler will select it    
   4.Non runnable->Then it will be not run and stop but thread alive it can runnable and running again
   5.terminate->Exit at the end
*/

//*Different constructors of Thread class
//1.Thread() ->Its already used before in the program of multithreading

// //2.Thread(String) by extending thread class
//   class MultiThread extends Thread{
//         public MultiThread(String name){
//                super(name);//inbuilt constructor which calls the thread(name)
//         }
//         public void run(){
//           int id=34;
//           //int i=0;
//           // while(i<400){
//           //   System.out.println("I am Thread");
//           //   i++;
//           // }
//         }
//       }
  
//   class main2{
//   public static void main(String[] args) {
//     MultiThread t1=new MultiThread("Nabi loves");
//     MultiThread t2=new MultiThread("Shihabuddin");
//     t1.start();
//     t2.start();
//     System.out.println(t1.getId());
//     System.out.println(t1.getName());
//      System.out.println(t2.getId());
//     System.out.println(t2.getName());
//   }
// }
  

// //3.Thread(Runnable,String)
//   class MyThread implements Runnable{
//     String name;
//     public MyThread(String name){
//       this.name=name;
//     }
//     public void run(){
//       int id=32;
//       int i=0;
//       // while(i<400){
//       //   System.out.println("I am thread");
//       // }
//     }
//   }
//   class main2{
//   public static void main(String[] args) {
//     MyThread bullet1=new MyThread("My");//custom label
//     MyThread bullet2=new MyThread("Patel"); //custom label
//     Thread gun1=new Thread(bullet1,"Nabi loves");//actual thread Thread(Runnable r,String name)
//      Thread gun2=new Thread(bullet2,"Patel");//actual thread
//      gun1.start();
//      gun2.start();
//      System.out.println(gun1.getId());
//      System.out.println(gun1.getName());
//        System.out.println(gun2.getId());
//      System.out.println(gun2.getName());
//   }
// }

/*Java thread priorities
    JVM responsible for Ready Queue where its has Readu Queue->T1,T2,T3,T4,T5 threads which managed by JVM
    Highly executing will be dependent on the OS  
*/

   class Mythread extends Thread{
    public Mythread(String name){
      super(name);
    }
    public void run(){
      int i=0;
      while(i<40){
        System.out.println("Thank you" + this.getName());
        i++;
      }
    }
   }
   //Example for Java Thread priorities
class main2{
  public static void main(String[] args) {
    Mythread t1=new Mythread("Nabi1");
    Mythread t2=new Mythread("Nabi2");
    Mythread t3=new Mythread("Nabi3");
     Mythread t4=new Mythread("Nabi4");//execute less with minimum priority
     Mythread t5=new Mythread("Nabi5 most");//execute more with highest priority as it had maximum priority

     t1.setPriority(Thread.MIN_PRIORITY);
     t2.setPriority(Thread.MIN_PRIORITY);
     t3.setPriority(Thread.MIN_PRIORITY);
     t4.setPriority(Thread.MIN_PRIORITY);
     t5.setPriority(Thread.MAX_PRIORITY);
        t1.start();
        t2.start();
        t3.start();
        t4.start();
        t5.start();
  }
}