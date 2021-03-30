package DIP.problem;

import java.util.ArrayList;
import java.util.List;

public class ProductRepository {

    private MySqlConnection mySqlConnection;

    // suponha que queremos incluir outro BD...

    public ProductRepository() {
        this.mySqlConnection = new MySqlConnection();
    }

    public List<Produto> buscarProdutos() {
        // retorna uma lista de produtos da base de dados
        return new ArrayList<>();
    }

    public void salvarProduto(Produto produto) {
        //salva lista de produtos na base de dados
    }

}
