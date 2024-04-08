package Modelagem;


public class NoArvore {
    public int data;
    public NoArvore left;
    public NoArvore right;

    public NoArvore(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
