/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 *
 * @author ogi
 */
@Entity
@Table (name="filme")
public class Filme {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private String nome;
    @Column
    private String sinopse;
    @Column
    private int classificacaoId;
    @Column
    private String diretor;
    @Column
    private boolean disponivel;

    public Filme(int id, String nome, String sinopse, int classificacaoId, String diretor, boolean disponivel) {
        this.id = id;
        this.nome = nome;
        this.sinopse = sinopse;
        this.classificacaoId = classificacaoId;
        this.diretor = diretor;
        this.disponivel = disponivel;
    }

    @Deprecated
    public Filme(){
        
    }
    
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
    
    
}
