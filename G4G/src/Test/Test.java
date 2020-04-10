//package Test;
//
//import Trie.WordDictionary;
//
//import java.lang.reflect.Array;
//import java.util.*;
//
//public class Test {
//    public static void main(String[] args) {
////        int b = 22;
////        String a = String.valueOf(b);
////        System.out.println(b);
////        List<List<String>> ls = new ArrayList<>();
////        int[] arr = new int[2];
////        Arrays.fill(arr,1);
////        arr[0]^=256;
////        arr[0]^=256;
////        arr[0]^=256;
////        StringBuilder sb = new StringBuilder();
////        sb.append('1');
////        HashMap<String,TreeMap<Integer,String>> hm = new HashMap<>();
////        TreeMap <Integer,String>tm = hm.get(1);
////        HashSet<Character> hs = new HashSet<>();
////        String ab ="wef";
////        char [] c = ab.toCharArray();
////        hs = new HashSet(Arrays.asList(c));
////        //hs = new HashSet(Arrays.asList("ererg"));
////        hs.add('a');
////        List<Character> cd = new ArrayList<Character>();
////        cd.add('a');
////        PriorityQueue<Integer> pq = new PriorityQueue<>();
////        HashMap<Integer,Integer>hm2 = new HashMap<>();
////        int test = 1;
////        pq.add(test);
////        hm2.put(1,test);
////
////        test = 4;
////
////
////        System.out.println(test);
////        LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
////        lhs.add(1);
////        lhs.add(2);
////        boolean am = lhs.iterator().hasNext();
////        System.out.println(am);
////        Random rand = new Random();
////        int[] aaa= {1};
////        int[] bbb = Arrays.copyOf(aaa,aaa.length);
////        List<List<Integer>> ls2 = new ArrayList<>();
////
////        List<List<String>> ls = new ArrayList<>();
////        HashMap<String,List<String>> hm = new HashMap<>();
////        String[] strs = {"Hello","World"};
////        for(String word: strs){
////            char[] c = word.toCharArray();
////            Arrays.sort(c);
////            String w = Arrays.toString(c);
////            if(!hm.containsKey(w))
////                hm.put(w,new ArrayList<String>());
////            hm.get(w).add(word);
////        }
////        int[][] dp = new int[2][2];
////
////        List<Integer> ls2 = new ArrayList<>();
////        ls2.add(1);
////        ls2.add(1);
////        TreeMap<Integer,Integer> tm = new TreeMap<>();
////        StringBuilder sb = new StringBuilder();
////        sb.append(1);
////        HashSet<String> hs = new HashSet<>();
////        sb.setLength(0);
////        String data = "ABCD";
////        String[] separate = data.split(",");
////
////        List<Integer> ls3 = new ArrayList(Arrays.asList(separate));
////        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a,b)-> (a.getValue()-b.getValue()));
////        HashSet<List<Integer>> ls22 = new HashSet<>();
////
////        String first = ": :";
////        String[] f = first.split(" ",1);
////
////        int previous = first.charAt(0);
////        String wordss = "google.mail.com";
////        String s= "mail";
////        System.out.println(wordss.indexOf(s));
////        String domains = "9001 discuss.leetcode.com";
////        String[] domain = domains.split(" ");
////        String[] d = domain[1].split("//.");
////        System.out.println(Arrays.toString(d));
////        System.out.println(Arrays.toString(domain));
////        char[] chars ={'a'};
////        int count = 1;
////        chars[0]= Character.highSurrogate(count);
////        TreeSet<Integer> ts = new TreeSet<>();
////
//        String res = "absjab123";
//    }
//    private boolean less(Comparable i, Comparable j){
//        return i.compareTo(j)<0;
//
//    }
//
//}
//
//import java.io.*;
//        import java.util.*;
//
///********************************************************
// * CODE INSTRUCTIONS:                                   *
// * 1) The method findInOrderSuccessor you're asked      *
// *    to implement is located at line 36.               *
// * 2) Use the helper code below to implement it.        *
// * 3) In a nutshell, the helper code allows you to      *
// *    to build a Binary Search Tree.                    *
// * 4) Jump to line 103 to see an example for how the    *
// *    helper code is used to test findInOrderSuccessor. *
// ********************************************************/
//
//class Solution {
//
//    static class Node {
//
//        int key;
//        Node left;
//        Node right;
//        Node parent;
//
//        Node(int key) {
//            this.key = key;
//            left = null;
//            right = null;
//            parent = null;
//        }
//    }
//
//    static class BinarySearchTree {
//
//        Node root;
//
//        Node findInOrderSuccessor(Node inputNode) {
//            // your code goes here
//            int parent_value=Integer.MAX_VALUE;
//
//            if(inputNode.parent==null && inputNode.right==null)
//                return null;
//
//
//            if(inputNode.right!=null)
//            {
//                Node right = findSuccessor(inputNode.right);
//                return right;
//            }
//
//            if(inputNode.parent!=null)
//            {
//                Node parent = findSuccessorParent(inputNode);
//                return parent==null? null:parent;
//            }
//            return null;
//        }
//
//        private static findSuccessorParent(Node node){
//            if(node==null)
//                return null;
//
//            while(node.parent!=null)
//        }
//        private static findSuccessor(Node node){
//            if(node==null)
//                return null;
//
//            if(node.parent!=null && node.parent.left==node)
//                return node.parent;
//
//            return findSuccessor(node.parent);
//        }
//
//        //  Given a binary search tree and a number, inserts a new node
//        //  with the given number in the correct place in the tree
//        void insert(int key) {
//
//            // 1. If the tree is empty, create the root
//            if(this.root == null) {
//                this.root = new Node(key);
//                return;
//            }
//
//            // 2) Otherwise, create a node with the key
//            //    and traverse down the tree to find where to
//            //    to insert the new node
//            Node currentNode = this.root;
//            Node newNode = new Node(key);
//
//            while(currentNode != null) {
//                if(key < currentNode.key) {
//                    if(currentNode.left == null) {
//                        currentNode.left = newNode;
//                        newNode.parent = currentNode;
//                        break;
//                    } else {
//                        currentNode = currentNode.left;
//                    }
//                } else {
//                    if(currentNode.right == null) {
//                        currentNode.right = newNode;
//                        newNode.parent = currentNode;
//                        break;
//                    } else {
//                        currentNode = currentNode.right;
//                    }
//                }
//            }
//        }
//
//        // Return a reference to a node in the BST by its key.
//        // Use this method when you need a node to test your
//        // findInOrderSuccessor method on
//        Node getNodeByKey(int key) {
//            Node currentNode = this.root;
//
//            while(currentNode != null) {
//                if(key == currentNode.key) {
//                    return currentNode;
//                }
//
//                if(key < currentNode.key) {
//                    currentNode = currentNode.left;
//                } else {
//                    currentNode = currentNode.right;
//                }
//            }
//
//            return null;
//        }
//    }
//
//    /***********************************************
//     * Driver program to test findInOrderSuccessor *
//     ***********************************************/
//
//    public static void main(String[] args) {
//
//        Node test = null, succ = null;
//
//        // Create a Binary Search Tree
//        BinarySearchTree tree = new BinarySearchTree();
//        tree.insert(20);
//        tree.insert(9);
//        tree.insert(25);
//        tree.insert(5);
//        tree.insert(12);
//        tree.insert(11);
//        tree.insert(14);
//
//        // Get a reference to the node whose key is 9
//        test = tree.getNodeByKey(9);
//
//        // Find the in order successor of test
//        succ = tree.findInOrderSuccessor(test);
//
//        // Print the key of the successor node
//        if (succ != null) {
//            System.out.println("Inorder successor of " + test.key +
//                    " is " + succ.key);
//        } else {
//            System.out.println("Inorder successor does not exist");
//        }
//    }
//}