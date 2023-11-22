
package com.mycompany.atividade01;

public class Livro extends Publicacao{
    
    private String editora;

    public Livro(String titulo, String dataPublicacao, String editora) {
        super(titulo, dataPublicacao);
        this.editora = editora;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    @Override
    public void imptimir() {
       System.out.println("Titulo: " + super.getTitulo() + "\n" +
                            "Data de Publicação: " + super.getDataPublicacao() + "\n" +
                            "Editora: " + editora);
    }
}
