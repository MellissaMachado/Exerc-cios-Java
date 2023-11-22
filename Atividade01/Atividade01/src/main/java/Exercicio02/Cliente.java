
package Exercicio02;


public class Cliente extends Pessoa{
    private double valorDivida;

    public Cliente() {
    }

    public Cliente(String nome, String fone, double valorDivida) {
        super(nome, fone);
        this.valorDivida = valorDivida;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    public void print(){
        System.out.println("Nome: " + super.getNome() + "\n" + 
                            "Fone: " + super.getFone() + "\n" +
                            "Valor da Divida: " + valorDivida);
    }
    
    public double calculaJuros(double taxa){
       return valorDivida + (valorDivida / 100) * taxa;

    }
}
