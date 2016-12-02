/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.builders;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import negocio.Filme;

/**
 *
 * @author ogi
 */
@ManagedBean(name = "bFilme")
@RequestScoped
public class BuilderFilme {
    private int id;
    private String nome;
    private String sinopse;
    private int classificacaoId;
    private String diretor;
    private boolean disponivel;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public int getClassificacaoId() {
        return classificacaoId;
    }

    public void setClassificacaoId(int classificacaoId) {
        this.classificacaoId = classificacaoId;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public boolean isDisponivel() {
        return disponivel;
    }

    public void setDisponivel(boolean disponivel) {
        this.disponivel = disponivel;
    }
    
    public Filme  BuildFilme() {
        return new Filme(id,nome, sinopse, classificacaoId, diretor, disponivel);
   }

}
