package DIP.solution;

import DIP.problem.Produto;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private DbConnection dbConnection;

    public ProductRepository(DbConnection dbConnection) {
        this.dbConnection = dbConnection;
    }

    public List<DIP.problem.Produto> buscarProdutos() {
        // retorna uma lista de produtos da base de dados
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto) {
        //salva lista de produtos na base de dados
    }

}
