package Questao2;

public class Empregado1 {
    
    private String primeiroNome;
    private String sobrenome;
    private double salarioMensal;
    
    public Empregado1(String primeiroNome, String sobrenome, double salarioMensal) {
        this.primeiroNome = primeiroNome;
        this.sobrenome = sobrenome;
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }
    
    public String getPrimeiroNome() {
        return primeiroNome;
    }
    
    public void setPrimeiroNome(String primeiroNome) {
        this.primeiroNome = primeiroNome;
    }
    
    public String getSobrenome() {
        return sobrenome;
    }
    
    public void setSobrenome(String sobrenome) {
        this.sobrenome = sobrenome;
    }
    
    public double getSalarioMensal() {
        return salarioMensal;
    }
    
    public void setSalarioMensal(double salarioMensal) {
        if (salarioMensal > 0) {
            this.salarioMensal = salarioMensal;
        } else {
            this.salarioMensal = 0.0;
        }
    }
    
    public double salarioAnual() {
        return salarioMensal * 12;
    }
    
    public void aumentaSalario(double percentual) {
        salarioMensal += salarioMensal * percentual / 100;
    }
    
}

	

