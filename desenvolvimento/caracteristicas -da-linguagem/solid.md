# S.O.L.I.D.

Boas práticas da programação orientada a objetos aplicadas dao JAVA.

### SINGLE REPONSABILITY PRINCIPLE

> A classe deve possuir uma única responsabilidade dentro do programa.

### OPEN-CLOSED PRINCIPLE

> A classe pode ter o comportameno estendido, sem modificá-lo.

Objetos devem estar abertos para extensão, mas fechados para modificação. Isto é, quando novos comportamentos precisam ser adicionados ao programa, devemos estender e não alterar o código fonte original.

### LISKOV SUBSTITUTION PRINCIPLE

> Classe derivadas devem ser substituíveis por suas classes bases.

### INTERFACE SEGREGATION PRINCIPLE

> Faça interfaces refinadas que são específicas do cliente.

Uma Classe não deve ser forçada a implementar Interfaces e métodos que não serão utilizados.

É melhor criar interfaces mais específicas ao invés de termos uma única interface genérica.

### DEPENDENCY INVERTION PRINCIPLE

> Dependa de abstrações e não de implementações.

Um módulo de alto nível não deve depender de módulos de baixo nível. Ambos devem depender da sua abstração.

ATENÇÃO: Inversão de Dependência nã é igual a Injeção de Dependência, que é um padrão de projetos.


