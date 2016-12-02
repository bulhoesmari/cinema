/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.implemtacoes;

import dao.DaoManagerHiber;
import java.util.List;
import negocio.Ingresso;
import persistencia.comportamentos.RepositorioGenerico;

/**
 *
 * @author ogi
 */
public class RepositorioIngressoBD implements RepositorioGenerico<Ingresso, Integer>{

    @Override
    public void inserir(Ingresso t) {
       DaoManagerHiber.getInstance().persist(t);

    }

    @Override
    public void alterar(Ingresso t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Ingresso recuperar(Integer g) {
        try{
           return (Ingresso) DaoManagerHiber.getInstance().recover("from Sessao where codigo="+g);
        }catch
                (IndexOutOfBoundsException e){
            return null;
            
        }
    }

    @Override
    public void excluir(Ingresso t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<Ingresso> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Ingresso");
    }
    
}
