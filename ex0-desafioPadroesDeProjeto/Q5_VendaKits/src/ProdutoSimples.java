public class ProdutoSimples extends Item {
    private double preco;

    public ProdutoSimples(String nome, int id, double preco) {
        super(nome, id);
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }
}
