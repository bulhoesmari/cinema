/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.builders;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.persistence.Column;
import negocio.Sala;
import negocio.TipoSessao;

/**
 *
 * @author ogi
 */
@ManagedBean(name = "bTipoSessao")
@RequestScoped
public class BuilderTipoSessao {
    
    private int id;
  
    private boolean tresD;
    
    private boolean horarioPromo;
    
    private double valor;

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
