package Questao16;

public class Elevador {
    private int andarAtual;
    private int totalAndares;
    private int capacidade;
    private int pessoasPresentes;

    public void Inicializar(int capacidade, int totalAndares) {
        this.capacidade = capacidade;
        this.totalAndares = totalAndares;
        this.andarAtual = 0;
        this.pessoasPresentes = 0;
    }

    public boolean Entrar() {
        if (pessoasPresentes < capacidade) {
            pessoasPresentes++;
            return true;
        } else {
            System.out.println("O elevador está cheio.");
            return false;
        }
    }

    public boolean Sair() {
        if (pessoasPresentes > 0) {
            pessoasPresentes--;
            return true;
        } else {
            System.out.println("O elevador está vazio.");
            return false;
        }
    }

    public boolean Subir() {
        if (andarAtual < totalAndares - 1) {
            andarAtual++;
            return true;
        } else {
            System.out.println("O elevador já está no último andar.");
            return false;
        }
    }

    public boolean Descer() {
        if (andarAtual > 0) {
            andarAtual--;
            return true;
        } else {
            System.out.println("O elevador já está no térreo.");
            return false;
        }
    }

    public String Imprimir() {
        return "Andar atual: " + andarAtual + "\n" +
               "Total de andares: " + totalAndares + "\n" +
               "Capacidade: " + capacidade + "\n" +
               "Pessoas presentes: " + pessoasPresentes;
    }
    
    public int getAndarAtual() {
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacidade() {
        return capacidade;
    }

    public void setCapacidade(int capacidade) {
        this.capacidade = capacidade;
    }

    public int getPessoasPresentes() {
        return pessoasPresentes;
    }

    public void setPessoasPresentes(int pessoasPresentes) {
        this.pessoasPresentes = pessoasPresentes;
    }
    
}


