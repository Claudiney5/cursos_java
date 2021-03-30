package SRP.solution;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompra {

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProdutos(Produto produto) {
        produtos.remove(produto);
    }

    public BigDecimal calcularTotal() {
        Object reduce = produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.ZERO, BigDecimal::add);
        return reduce;
    }

}
