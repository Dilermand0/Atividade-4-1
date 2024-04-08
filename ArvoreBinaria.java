package Negocio;

import Modelagem.NoArvore;

public class ArvoreBinaria {
	    NoArvore root;

	    public ArvoreBinaria() {
	        this.root = null;
	    }

	    // Método para inserir um nó na árvore
	    public void insert(int data) {
	        root = insertRec(root, data);
	    }

	    private NoArvore insertRec(NoArvore root, int data) {
	        if (root == null) {
	            root = new NoArvore(data);
	            return root;
	        }

	        if (data < root.data)
	            root.left = insertRec(root.left, data);
	        else if (data > root.data)
	            root.right = insertRec(root.right, data);

	        return root;
	    }

	    // Método para percorrer a árvore em ordem (in-order traversal)
	    public void inorder() {
	        inorderRec(root);
	    }

	    private void inorderRec(NoArvore root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.print(root.data + " ");
	            inorderRec(root.right);
	        }
	    }

		public void insert(int data) {
			// TODO Auto-generated method stub
			
		}

		public void insert(int data) {
			// TODO Auto-generated method stub
			
		}
	}