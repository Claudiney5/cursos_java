# TIPOS 

### TIPOS PRIMITIVOS

Nunca podem ser nulos.

- byte:    8 bites [-128 - 127]     [default = 0]
- short:  16 bites [-32768 - 32767] [default = 0]
- int:    32 bites [...]            [default = 0]
- long:   64 bites [...]            [default = 0L]
- float:  32 bites [...]            [default = 0.0f]
- double: 64 bites [...]            [default = 0.0d]
- char:   16 bites['A' - 15]        [default = 'u0000']
- boolean:                          [default = false]


### WRAPPERS

Aceitam valores NULOS. 
São objetos que representam os primitivos.
Portanto possuem MÉTODOS.

- Byte
- Short
- Integer
- Long
- Float
- Double
- Boolean
- Character

Auto-Boxing: passa um valor puro para um Wrapper (um objeto).
Unboxing: constrói o objeto, mas atribui seu valor para um tipo PRIMITIVO.


### TIPOS NÃO PRIMITIVOS

- String
- Number
- Object
- Void
- qualquer outro Objeto

Vantagem de usar estes tipos é a possibilidade de usar seus MÉTODOS.



## TIPAGEM FORTE E ESTÁTICA

- **Tipagem Estática** significa que o Tipo é verificado em tempo de COMPILAÇÃO.

- **Tipagem Forte** significa que uma vez atribuída a tipagem, ela não pode ser mais alterada.

- **Tipo Inferido** significa não precisar colocar de forma explícita o tipo da variável. Necessário utilizar a palava **var**.



## MODIFICADORES DE ACESSO

- **public**: pode ser acessada de qualquer lugar por qualquer entidade que possa visualizar a classe a que ela pertence.

- **private**: os métodos e atributos da classe definidos como privados não podem ser acessados ou usados por nenhuma outra classe. Também não podem ser visualizados pelas classes herdadas.

- **protected**: acessível os membros do _mesmo pacote_ ou através de herança

- **default**: acessível apenas no mesmo pacote.


- **abstract**: usado em classes e métodos. Classes abstratas não podem ser instânciadas. Seus atributos e métodos abstratos devem ser instâciadas pelas classes que a extenderem. Métodos abstratos só existem em classes abstratas.

- **static**: usado para a criação de variáveis. O valor estará presente em todas as instâncias do objeto. Se alterado em uma instância, será alterado em todas as demais! O método _static_ pode ser chamado diretamente, sem instanciá-lo.

- **final**: quando aplicada a uma classe naõ permite estender. Nos métodos impede que o mesmo seja sobreescrito (@override) na subclasse. Nas varáveis não permite alteração no valor atribuído.



## INTERFACES

Possuem _MÉTODOS ABSTRATOS_
Podem ter _MÉTODOS DEFAULT_ que são herdados a todos que implementam. Novos métodos não quebram as implemantações.

Permitem _HERANÇAS MÚLTIPLAS_  permitindo a extenção de mais de uma interface pela classe.



## ENUMS

Dicionário de dados imutáveis. Não é permitido criar novas instâncias. Os nomes são em MAIÚSCULA.

