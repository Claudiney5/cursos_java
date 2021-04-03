# JAVA.UTIL.SET

## IMPLEMENTAÇÕES

- java.util.HashSet
- java.util.TreeSet
- java.util.LinkedSet

No geral não garantem a ordem ou reordenação. Característica para melhorar a performace. 

Não permitem itens repetidos. Também para garantir a performace.

Permite adição e remoção normalmente, mas não possui busca por item e atualização.

### HashSet

- Utilizar quando NÂO é necessário manter a ordenação.
- Não é ordenado e não permite valores repetidos.
- É a implementação mais performática.

### LinkedHachSet

- Quando é nedessário manter a orddem de inserção dos elementos. 
- Mantêm a ordem de inserção dos elementos.
- A implementaçção é mais lenta por ser necessário manter a ordem.

### TreeSet

- Quando é necessário alterar a ordem através do uso de *comparators*.
- Mantêm a ordem, mas pode ser reordenado.
- é performátoico para leitura. Para modificação tem a necessidade de reordenar, sendo mais lneto que o **LinkedHashSet**


