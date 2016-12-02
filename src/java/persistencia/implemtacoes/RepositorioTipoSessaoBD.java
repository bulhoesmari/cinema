/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.implemtacoes;

import dao.DaoManagerHiber;
import java.util.List;
import negocio.Filme;
import negocio.TipoSessao;
import persistencia.comportamentos.RepositorioGenerico;

/**
 *
 * @author ogi
 */
public class RepositorioTipoSessaoBD implements RepositorioGenerico<TipoSessao, Integer>{

    @Override
    public void inserir(TipoSessao t) {
        DaoManagerHiber.getInstance().persist(t);

    }

    @Override
    public void alterar(TipoSessao t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public TipoSessao recuperar(Integer g) {
        try{
           return (TipoSessao) DaoManagerHiber.getInstance().recover("from TipoSessao where codigo="+g);
        }catch
                (IndexOutOfBoundsException e){
            return null;
            
        }
    }

    @Override
    public void excluir(TipoSessao t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<TipoSessao> recuperarTodos() {
        return DaoManagerHiber.getInstance().recover("from Filme");
    }
    
}
