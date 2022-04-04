package com.bridgelabz;
import javax.security.auth.kerberos.KerberosCredMessage;
public class BinarySearch <K> implements Comparable{
        INode root;

        public BinarySearchTree(){
            root = null;
        }
        void insert(int key)  {
            root = insert_Recursive(root, key);
        }

        //recursive insert function
        INode insert_Recursive(INode root, int key) {
            //tree is empty
            if (root == null) {
                root = new INode(key);
                return root;
            }
            //traverse the tree
            if (key < root.key)     //insert in the left subtree
                root.left = insert_Recursive(root.left, key);
            else if (key > root.key)    //insert in the right subtree
                root.right = insert_Recursive(root.right, key);
            // return pointer
            return root;
        }

        // method for inorder traversal of BST
        void display() {
            inorder_Recursive(root);
        }

        // recursively traverse the BST
        void inorder_Recursive(INode root) {
            if (root != null) {
                inorder_Recursive(root.left);
                System.out.print(root.key + " ");
                inorder_Recursive(root.right);
            }
        }

        @Override
        public int compareTo(Object o) {

            return 0;
        }
    }
