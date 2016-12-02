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
@Table (name="tipoSessao")
public class TipoSessao {
    @Id
    @GeneratedValue
    private int id;
    @Column
    private boolean tresD;
    @Column
    private boolean horarioPromo;
    @Column
    private double valor;

    public TipoSessao(int id, boolean tresD, boolean horarioPromo, double valor) {
        this.id = id;
        this.tresD = tresD;
        this.horarioPromo = horarioPromo;
        this.valor = valor;
    }
    
    @Deprecated
    public TipoSessao(){
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public boolean isTresD() {
        return tresD;
    }

    public void setTresD(boolean tresD) {
        this.tresD = tresD;
    }

    public boolean isHorarioPromo() {
        return horarioPromo;
    }

    public void setHorarioPromo(boolean horarioPromo) {
        this.horarioPromo = horarioPromo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public TipoSessao  BuildTipoSessao() {
        return new TipoSessao(id, tresD, horarioPromo, valor);
    }
}
