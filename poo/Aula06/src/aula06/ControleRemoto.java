
package aula06;


public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;

    public ControleRemoto() {
        this.volume = 50;
        this.ligado = false;
        this.tocando = false;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isLigado() {
        return ligado;
    }

    public void setLigado(boolean ligado) {
        this.ligado = ligado;
    }

    public boolean isTocando() {
        return tocando;
    }

    public void setTocando(boolean tocando) {
        this.tocando = tocando;
    }

    @Override
    public void ligar() {
        this.setLigado(true);
    }

    @Override
    public void desligar() {
        this.setLigado(false);
        this.setTocando(false);
    }

    @Override
    public void abrirMenu() {
        System.out.println("Está ligado? " + this.isLigado());
        System.out.println("Está tocando? " + this.isTocando());
        System.out.print("Volume: " + this.getVolume() + " ");
        for (int i = 0; i <= this.getVolume(); i += 5){
            System.out.print("|");
        }
    }

    @Override
    public void fecharMenu() {
        System.out.println("Fechando menu...");
    }

    @Override
    public void maisVolume() {
        if (this.isLigado()) {
            this.setVolume(this.getVolume() + 5);
        }        
    }

    @Override
    public void menosVolume() {
        this.setVolume(this.getVolume() - 5);
    }

    @Override
    public void ligarMudo() {
        if (this.isLigado()) {
            this.setVolume(0);
        }
    }

    @Override
    public void desligarMudo() {
        if (this.isLigado()) {
            this.setVolume(35);
        }
    }

    @Override
    public void play() {
        if (this.isLigado()) {
           this.setTocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.isLigado()) {
            this.setTocando(false);
        }
    }
    
    public void status() {
        System.out.println("------------------");
        System.out.println("Ligado? " + this.isLigado());
        System.out.println("Tocando? " + this.isTocando());
        if (this.isLigado() == false) {
                this.setVolume(0);
                System.out.println("Volume: 0");
        } else {
            System.out.println("Volume: " + this.getVolume());
            for (int i = 0; i <= this.getVolume(); i += 5){
            System.out.print("|");
        }
        
        }
        System.out.println("");
        System.out.println("-----------------");
    }
}
