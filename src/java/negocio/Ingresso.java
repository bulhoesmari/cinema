/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author ogi
 */
@Entity
@Table (name="ingresso")
public class Ingresso {
    @Id
    @GeneratedValue
    private int numero;
    @OneToMany
    private Sessao sessao;

    public Ingresso(int numero, Sessao sessao) {
        this.numero = numero;
        this.sessao = sessao;
    }
    
    @Deprecated
    public Ingresso(){
        
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Sessao getSessao() {
        return sessao;
    }

    public void setSessao(Sessao sessao) {
        this.sessao = sessao;
    }
    
    public Ingresso  BuildIngresso() {
        return new Ingresso(numero, sessao);
   }
    
}
