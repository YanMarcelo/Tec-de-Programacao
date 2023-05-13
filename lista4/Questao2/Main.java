package Questao2;

public class Main {
    
    public static void main(String[] args) {
        
        Empregado1 empregadohomem = new Empregado1("Yan", "Marcelo", 3000.0);
        Empregado1 empregadomulher = new Empregado1("Laisa", "Mireli", 4000.0);
        
        System.out.println("Salário anual: " + empregadohomem.getPrimeiroNome() + " " + empregadohomem.getSobrenome() + ": R$" + empregadohomem.salarioAnual());
        System.out.println("Salário anual: " + empregadomulher.getPrimeiroNome() + " " + empregadomulher.getSobrenome() + ": R$" + empregadomulher.salarioAnual());
        
        empregadohomem.aumentaSalario(10);
        empregadomulher.aumentaSalario(10);
        
        System.out.println("Salário anual de " + empregadohomem.getPrimeiroNome() + " " + empregadohomem.getSobrenome() + " após aumento: R$" + empregadohomem.salarioAnual());
        System.out.println("Salário anual de " + empregadomulher.getPrimeiroNome() + " " + empregadomulher.getSobrenome() + " após aumento: R$" + empregadomulher.salarioAnual());
        
    }
    
}
