
package aula07relacionamentos;

import java.util.Random;

public class Luta implements LutaInterface {
    private Lutador desafiado;
    private Lutador desafiante;
    private int rounds;
    private boolean aprovada;
    
    //  Construtor

      
    // Métodos getters & setters    

    public Lutador getDesafiado() {
        return desafiado;
    }

    public void setDesafiado(Lutador desafiado) {
        this.desafiado = desafiado;
    }

    public Lutador getDesafiante() {
        return desafiante;
    }

    public void setDesafiante(Lutador desafiante) {
        this.desafiante = desafiante;
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    private boolean isAprovada() {
        return aprovada;
    }

    private void setAprovada(boolean aprovada) {
        this.aprovada = aprovada;
    }
    
    // Métodos públicos

    @Override
    public void marcarLuta(Lutador l1, Lutador l2) {
        if (l1.getCategoria().equals(l2.getCategoria()) && (l1 != l2)) {
            this.setAprovada(true);
            this.desafiado = l1;
            this.desafiante = l2;
        } else {
            this.setAprovada(false);
            this.desafiado = null;
            this.desafiante = null;
        }
    }

    @Override
    public void lutar() {
        if (this.isAprovada()) {
            System.out.println("### DESAFIADO ###");
            this.desafiado.apresentar();
            System.out.println("### DESAFIANTE ###");
            this.desafiante.apresentar();
            
            Random aleatorio = new Random();
            int vencedor;
            vencedor = aleatorio.nextInt(3);
            
            System.out.println("------------------");
            System.out.println("---- LUTANDO ----");
            System.out.println("------------------");
            
            switch (vencedor) {
                case 0: // empate
                    System.out.println("EMPATOU.");
                    this.desafiado.empatarLuta();
                    this.desafiante.empatarLuta();
                    break;
                case 1: // desafiado ganha
                    System.out.println(this.desafiado.getNome() + " venceu a luta!");
                    this.desafiado.ganharLuta();
                    this.desafiante.perderLuta();
                    break;
                case 2: // desafiante ganha
                    System.out.println(this.desafiante.getNome()+ " venceu a luta!");
                    this.desafiado.perderLuta();
                    this.desafiante.ganharLuta();
                    break;
                default:
            }
            
        } else {
            System.out.println("Luta não foi aprovada!!");
        }
        
    }
    
    
}
