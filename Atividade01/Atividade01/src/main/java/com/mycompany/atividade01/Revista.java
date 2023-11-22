
package com.mycompany.atividade01;


public class Revista extends Publicacao {
    private String editora;
    private String local;

    public Revista(String titulo, String dataPublicacao, String editora, String local) {
        super(titulo, dataPublicacao);
        this.editora = editora;
        this.local = local;
    }

    public String getEditora() {
        return editora;
    }

    public void setEditora(String editora) {
        this.editora = editora;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    }
    
    @Override
    public void imptimir() {
        System.out.println("Titulo: " + super.getTitulo() + "\n" +
                            "Data de Publicação: " + super.getDataPublicacao() + "\n" +
                            "Editora: " + editora + "\n" + 
                            "Local: " + local );
    }
    
}
