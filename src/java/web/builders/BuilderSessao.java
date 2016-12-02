/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.builders;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import negocio.Filme;
import negocio.Sala;
import negocio.Sessao;
import negocio.TipoSessao;

/**
 *
 * @author ogi
 */
@ManagedBean(name = "bSessao")
@RequestScoped
public class BuilderSessao {
    private int numero;
   
    private Date hora;
   
    private String data;
  
    private Sala sala;
   
    private Filme filme;
   
    private TipoSessao tipoSessao;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public Date getHora() {
        return hora;
    }

    public void setHora(Date hora) {
        this.hora = hora;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        this.sala = sala;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }

    public TipoSessao getTipoSessao() {
        return tipoSessao;
    }

    public void setTipoSessao(TipoSessao tipoSessao) {
        this.tipoSessao = tipoSessao;
    }
    
     public Sessao  BuildSessao() {
        return new Sessao(numero, hora, data, filme, tipoSessao);
   }
    
   
}
