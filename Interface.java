package Visao;

import javax.swing.JOptionPane;

import Negocio.ArvoreBinaria;

public class Interface {
    public static void main(String[] args) {
        // Criar uma árvore binária e adicionar alguns nós
        ArvoreBinaria tree = new ArvoreBinaria();
        tree.insert(50);
        tree.insert(30);
        tree.insert(70);
        tree.insert(20);
        tree.insert(40);
        tree.insert(60);
        tree.insert(80);

       
        JOptionPane.showMessageDialog(null, "Elementos da árvore em ordem: " + tree.inorder());
    }
}