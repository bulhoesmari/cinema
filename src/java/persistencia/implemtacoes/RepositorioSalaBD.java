/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.implemtacoes;

import dao.DaoManagerHiber;
import java.util.List;
import negocio.Sala;
import persistencia.comportamentos.RepositorioGenerico;

/**
 *
 * @author ogi
 */
public class RepositorioSalaBD implements RepositorioGenerico<Sala, Integer>{

    @Override
    public void inserir(Sala t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Sala t) {
         DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Sala recuperar(Integer g) {
         try{
           return (Sala) DaoManagerHiber.getInstance().recover("from Sala where codigo="+g);
        }catch
                (IndexOutOfBoundsException e){
            return null;
            
        }
    }

    @Override
    public void excluir(Sala t) {
         DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<Sala> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Sala");
    }
    
}
