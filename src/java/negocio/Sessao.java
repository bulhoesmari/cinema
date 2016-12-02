/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author ogi
 */
 @Entity
@Table (name="sessao")
public class Sessao {
    @Id
    @GeneratedValue
    private int numero;
    @Temporal (TemporalType.DATE)
    private Date hora;
    @Column
    private String data;
    @OneToOne
    private Sala sala;
    @ManyToOne
    private Filme filme;
    @OneToMany
    private TipoSessao tipoSessao;

    public Sessao(int numero, Date hora, String data, Sala sala, Filme filme, TipoSessao tipoSessao) {
        this.numero = numero;
        this.hora = hora;
        this.data = data;
        this.sala = sala;
        this.filme = filme;
        this.tipoSessao = tipoSessao;
    }

    public Sessao(int numero, Date hora, String data, Filme filme, TipoSessao tipoSessao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public TipoSessao getTipoSessao() {
        return tipoSessao;
    }

    public void setTipoSessao(TipoSessao tipoSessao) {
        this.tipoSessao = tipoSessao;
    }
    
    @Deprecated
    public Sessao(){
        
    }

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
    
    
    
    
}
