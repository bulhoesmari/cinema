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
@Table (name="sala")
public class Sala {
    @Id
    @GeneratedValue
    private int numero;
    @Column
    private int[] cadeiras;

    public Sala(int numero, int[] cadeiras) {
        this.numero = numero;
        this.cadeiras = cadeiras;
    }

     @Deprecated
    public Sala(){
        
    }
    
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
    
    
    
}
