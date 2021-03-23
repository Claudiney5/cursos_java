
package aula05;

public class ContaBanco {
    
    public int numConta;
    private float saldo;
    private String dono;
    private boolean status;
    protected String tipo ;

    public ContaBanco() {
        this.saldo = 0;
        this.status = false;
    }
    
    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    //----------------------------
    
    public void abrirConta(String tipo) {
        this.status = true;
        tipo.toUpperCase();
        this.setTipo(tipo);
        
        if (tipo == "CC") {
            this.saldo = 50;
            System.out.println("Conta Corrente Aberta");
        } else if (tipo == "CP") {
            this.saldo = 150;
            System.out.println("Conta Poupança Aberta");
        } else {
            System.out.println("Tipo de conta inválido!");
        }
        
    }
    
    public void fecharConta() {
        if (this.saldo == 0) {
            setStatus(false);
            System.out.println(getTipo() + " fechada com sucesso");
        } else if (this.saldo < 0) {
            System.out.println("Conta em débito! Saldo de " + this.saldo);
        } else {
            System.out.println("Não pode ser fechada. Saldo de " + this.saldo);
        }
    }
    
    public void depositar(float valor) {
        if (this.status) {
            setSaldo(getSaldo() + valor);
            System.out.println("SALDO: " + getSaldo());
        } else {
            System.out.println("Conta fechada ou inexistente!");
        }        
    }
    
    public void sacar( float valor) {
        if (this.status) {
            if (getSaldo() >= valor) {
                setSaldo(getSaldo() - valor);
            } else {
                System.out.println("Saldo insuficiente!");
            }
        }
    }
    
    public void pagarMensal() {
        float mensalidade;
        if (getTipo() == "CC") {
            mensalidade = 12f;
        } else if (getTipo() == "CP") {
            mensalidade = 20f;
        } else {
            mensalidade = 0f;
        }
        
        if (isStatus() == true) {
            if (getSaldo() > mensalidade) {
                setSaldo(getSaldo() - mensalidade);
            }
        } else {
            System.out.println("Não é posível pagar! Saldo: " + getSaldo());
        }
        
    }
    
}
