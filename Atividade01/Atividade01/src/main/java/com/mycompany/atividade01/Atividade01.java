

package com.mycompany.atividade01;

public class Atividade01 {

    public static void main(String[] args) {
        System.out.println("Informações Livro" + "\n" );
        Livro l1 = new Livro("Mente Milionaria", "15/09/2023", "UNICSUL");
        l1.imptimir();
        
        System.out.println("---------------------------------------------------------------------------- " + "\n" );
        
        System.out.println("Informações Revista" + "\n" );
        
        Revista r1 = new Revista("Mente Milionaria", "15/09/2023", "Bodao", "Guarulhos" );
        r1.imptimir();
    }
}
