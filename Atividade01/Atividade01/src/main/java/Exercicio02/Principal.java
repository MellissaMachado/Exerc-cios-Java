
package Exercicio02;


public class Principal {

  
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa("Augusto", "1196366-7429");
        System.out.println("Print Classe Pessoa");
        p1.print();
        
        System.out.println("--------------------------------------------------------");
        
        Cliente c1 = new Cliente("Macena", "1197484-9285", 2000.00);
        System.out.println("Print Classe Cliente");
        c1.print();
        System.out.println("O valor da divida mais o juros é de: " + c1.calculaJuros(2));
        
        System.out.println("--------------------------------------------------------");
        
        Fornecedor f1 = new Fornecedor("Bodao", "112436-5171", 2000.00);
        f1.print();
        f1.calculaImposto(2);
        f1.validar();
    }
    
}
