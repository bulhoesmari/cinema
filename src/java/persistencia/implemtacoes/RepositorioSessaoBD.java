/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.implemtacoes;

import dao.DaoManagerHiber;
import java.util.List;
import negocio.Sessao;
import negocio.TipoSessao;
import persistencia.comportamentos.RepositorioGenerico;

/**
 *
 * @author ogi
 */
public class RepositorioSessaoBD implements RepositorioGenerico<Sessao, Integer>{

    @Override
    public void inserir(Sessao t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    @Override
    public void alterar(Sessao t) {
        DaoManagerHiber.getInstance().update(t);
    }

    @Override
    public Sessao recuperar(Integer g) {
        try{
           return (Sessao) DaoManagerHiber.getInstance().recover("from Sessao where codigo="+g);
        }catch
                (IndexOutOfBoundsException e){
            return null;
            
        }
    }

    @Override
    public void excluir(Sessao t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    @Override
    public List<Sessao> recuperarTodos() {
         return DaoManagerHiber.getInstance().recover("from Sessao");
    }
    
}
