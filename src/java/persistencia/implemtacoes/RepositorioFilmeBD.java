/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.implemtacoes;

import dao.DaoManagerHiber;
import java.util.List;
import negocio.Filme;
import negocio.Sala;
import persistencia.comportamentos.RepositorioGenerico;

/**
 *
 * @author ogi
 */
public class RepositorioFilmeBD implements RepositorioGenerico<Filme, Integer>{

    @Override
    public void inserir(Filme t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Filme t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Filme recuperar(Integer g) {
        try{
           return (Filme) DaoManagerHiber.getInstance().recover("from Filme where codigo="+g);
        }catch
                (IndexOutOfBoundsException e){
            return null;
            
        }
    }

    @Override
    public void excluir(Filme t) {
         DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<Filme> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Filme");
    }
    
}
