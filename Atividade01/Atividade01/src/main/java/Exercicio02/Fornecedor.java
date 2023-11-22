
package Exercicio02;


public class Fornecedor extends Pessoa implements Seguranca {
    private double valorCompra;

    public Fornecedor() {
    }

    public Fornecedor(String nome, String fone, double valorCompra) {
        super(nome, fone);
        this.valorCompra = valorCompra;
    }
    
    @Override
    public void print(){
        System.out.println("Nome: " + super.getNome() + "\n" + 
                            "Fone: " + super.getFone() + "\n" + 
                            "Valor da Compra: " + valorCompra);
    }
    
    public void calculaImposto(double imposto){
        double result = valorCompra + (valorCompra / 100)* imposto;
        System.out.println("Valor da compra mais o imposto é de: " + result);
                                                                     
    }

    @Override
    public boolean validar() {
        
        if(valorCompra <= 0){
            System.out.println("Compra recusada");
            return false;
        }
        else{
           System.out.println("Compra valida");
            return true;
            
        }
    }
}
