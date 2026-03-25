import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class VendasEmMemoria implements VendasFachada{
	private List<Item> produtos;
	
	public VendasEmMemoria() {
		produtos = new ArrayList<>();
		ProdutoSimples caneta = new ProdutoSimples("Caneta", 1, 1.55);
		ProdutoSimples borracha = new ProdutoSimples("Borracha", 2, 1.15);
		ProdutoSimples caderno = new ProdutoSimples("Caderno", 3, 32.99);

		ProdutoComposto kitEscolar = new ProdutoComposto("Kit Escolar", 10);
		kitEscolar.adicionarItem(caneta);
		kitEscolar.adicionarItem(borracha);
		kitEscolar.adicionarItem(caderno);

		produtos.add(caneta);
		produtos.add(borracha);
		produtos.add(caderno);
		produtos.add(kitEscolar);
	}
	
	@Override
	public Venda iniciarVenda() {
		return new Venda(LocalDateTime.now());
	}

	@Override
	public void registrarVenda(Venda umaVenda, int codigoProduto, int quantidade) {
		Item prod = produtos.stream().filter(p -> p.getId() == codigoProduto).findFirst().get();
		umaVenda.registrarVenda(prod, quantidade);
	}

	@Override
	public String emitirComprovante(Venda umaVenda) {
		return umaVenda.emitirComprovante();
	}

	@Override
	public List<Item> buscarProdutos() {
		return Collections.unmodifiableList(produtos);
	}

}
