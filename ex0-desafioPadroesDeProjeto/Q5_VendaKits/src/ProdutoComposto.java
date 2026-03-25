import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProdutoComposto extends Item {
    private List<Item> produtos;

    public ProdutoComposto(String nome, int id) {
        super(nome, id);
        produtos = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        produtos.add(item);
    }

    public List<Item> getItens() {
        return Collections.unmodifiableList(produtos);
    }

    @Override
    public double getPreco() {
        double total = 0.0;
        for (Item item : produtos) {
            total += item.getPreco();
        }
        return total;
    }

}
