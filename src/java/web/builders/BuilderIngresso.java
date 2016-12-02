/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.builders;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.OneToMany;
import negocio.Sessao;

/**
 *
 * @author ogi
 */
@ManagedBean(name = "bIngresso")
@RequestScoped
public class BuilderIngresso {
    private int numero;
    
    private Sessao sessao;

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
    
    
}
