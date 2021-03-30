package SRP.problem;

import SRP.solution.Produto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class OrdemDeCompraProblem {

    /* exemplo de uma classe com muitas funcionalidades (God Class)
    * no SOLID cada classe deve ter uma simples responsabilidade ou
    * Single Responsability Principle
     */

    private List<Produto> produtos = new ArrayList<>();

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void removerProdutos(Produto produto) {
        produtos.remove(produto);
    }

    public BigDecimal calcularTotal() {
        Object reduce;
        reduce = produtos.stream()
                .map(Produto::getValor)
                .reduce(BigDecimal.ZERO,
                        BigDecimal::add);
        return (BigDecimal) reduce;
    }

    public List<OrdemDeCompraProblem> buscarOrdensDeCompra() {
        // retorna uma lista de ordens de compra da base de dados
        return new ArrayList<>();
    }

    public void salvarOrdemCompra() {
        //salva lista de ordem de compra
    }

    public void enviarEmail(String email) {
        // envia email de ordem de compra
    }

    public void imprimirOrdemDeCompra() {
        // imprime orde de compra
    }
}
