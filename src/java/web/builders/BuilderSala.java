/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web.builders;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import negocio.Filme;
import negocio.Sala;

/**
 *
 * @author ogi
 */
@ManagedBean(name = "bSala")
@RequestScoped
public class BuilderSala {
    private int numero;
     
    private int[] cadeiras;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int[] getCadeiras() {
        return cadeiras;
    }

    public void setCadeiras(int[] cadeiras) {
        this.cadeiras = cadeiras;
    }
    
    public Sala  BuildSala() {
        return new Sala(numero,cadeiras);
   }
}
