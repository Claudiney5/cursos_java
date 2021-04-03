## TRATAMENTO DE EXCEÇÕES EM JAVA


### EXCEPTION (EXCEÇÕES)

Erros que ocorrem durante o processamento de um método que podem ser esperados ou não esperados.

Exemplo básico:

>
>public static void metodo() {
>	
>	try {
>		new java.io.FileInputStream("arquivo.txt")	;
>	} catch (java.io.FileNotFoundException e) {
>		System.out.println("Mensagem de Erro");
>	}
>}
>

É importante tratar todos os métodos criados.


### CHECKED EXCEPTIONS (Exceções Esperadas)

O método está preparado para receber aquela exceção. Sabe-se que el pode ocorrer.

### UNCHECKED EXCEPTIONS (Exceções não esperadas)

Erros não tratados que podem quebrar a aplicação.

### Bloco TRY/CATCH

É utilizado quando no processo que será executado dentro de um método é esperado um erro, então cria-se um bloco "protegido" onde qualquer erro que ocorra dentro do trecho **try** é direcionado para o trecho **catch** aonde sofrerá o devido tratamento de erro.

### FINALLY

Bloco opicional. Sempre será executado, portando fica depois do **catch**

>
>public static void metodo() {
>	
>	try {
>		PreparedStatement stmt = con.PrepareStatement(query);
>		// ...
>	} catch (SQLExcepion e) {
>		throw new AcessoADadosException("Mensagem de Erro", e);
>	} **finally** {
>		stmt.close();	
>	}
>}
>

No exemplo acima o **finally** finaliza a conexão com o Banco de dados.

### THROW

É usado para lançar a exceção desejada, juntamente com a mensagem de erro, para o método que fez a chamada.

### THROWS

É a assinatura do método que será retornado caso ocorra erro, para o método que fez a chamada, dentro de um fluxo encadeado.

