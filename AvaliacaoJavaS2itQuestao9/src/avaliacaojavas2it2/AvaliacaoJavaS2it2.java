package avaliacaojavas2it2;

/**
 *
 * @author Luan
 */
public class AvaliacaoJavaS2it2 {

    public static void main(String[] args) {
        BinaryTree n0 = new BinaryTree();
        BinaryTree n1 = new BinaryTree();
        BinaryTree n2 = new BinaryTree();
        BinaryTree n3 = new BinaryTree();
        BinaryTree n4 = new BinaryTree();
        BinaryTree n5 = new BinaryTree();

        n0.valor = 1;
        n1.valor = 1;
        n2.valor = 1;
        n3.valor = 1;
        n4.valor = 1;
        n5.valor = 1;

        n3.left = n4;
        n3.right = n5;

        n1.right = n2;

        n0.left = n3;
        n0.right = n1;

        System.out.println("Resultado a partir de n0: " + somarValoresNos(n0));
        System.out.println("Resultado a partir de n1: " + somarValoresNos(n1));
        System.out.println("Resultado a partir de n3: " + somarValoresNos(n3));

    }

    public static int somarValoresNos(BinaryTree binaryTree) {
        if (binaryTree != null) {
            return somarValoresNos(binaryTree.left) + somarValoresNos(binaryTree.right) + binaryTree.valor;
        }
        return 0;
    }

}
