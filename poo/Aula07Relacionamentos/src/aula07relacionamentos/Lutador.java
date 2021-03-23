
package aula07relacionamentos;

public class Lutador implements LutadorInterface {
    // Atributos
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int empates;
    private int derrotas;
    
    // Construtor

    public Lutador(String nome, String nacionalidade, int idade, float altura, float peso, int vitorias, int empates, int derrotas) {
        this.nome = nome;
        this.nacionalidade = nacionalidade;
        this.idade = idade;
        this.altura = altura;
        this.setPeso(peso);
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
    }
    
    
    // Metodos getters & setters

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
        setCategoria();
    }

    public String getCategoria() {
        return categoria;
    }

    private void setCategoria() {
        if (this.peso< 52.2f) {
            this.categoria = "Inválido!!";
        } else if (this.peso <= 70.3f) {
            this.categoria = "Leve";
        } else if (this.peso <= 83.9f) {
            this.categoria = "Médio";
        } else {
            this.categoria = "Pesado";
        }        
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }
    
    // Métodos de interface

    @Override
    public void apresentar() {
        System.out.println("-----------------");
        System.out.println("Lutador: " + this.getNome());
        System.out.println("Origem: " + this.getNacionalidade());
        System.out.println(this.getIdade() + " anos");
        System.out.println(this.getAltura() + " metros de altura");
        System.out.println("Pesando " + this.getPeso() + " Kg");
        System.out.println(this.getVitorias() + " vitórias");
        System.out.println(this.getEmpates() + " empates");
        System.out.println(this.getDerrotas() + " derrotas");
    }

    @Override
    public void status() {
        System.out.println("-----------------");
        System.out.println(getNome());
        System.out.println("É um peso " + getCategoria());
        System.out.println("Tem " + getVitorias() + " vitórias,");
        System.out.println(getEmpates() + " empates e ");
        System.out.println(getDerrotas() + " derrotas");
    }

    @Override
    public void ganharLuta() {
        this.setVitorias(this.getVitorias() + 1);
    }

    @Override
    public void perderLuta() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    @Override
    public void empatarLuta() {
        this.setEmpates(this.getEmpates() + 1);
    }
    
      
}
