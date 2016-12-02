/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import negocio.Sala;
import negocio.TipoSessao;
import persistencia.comportamentos.RepositorioGenerico;
import persistencia.implemtacoes.FactoryRepositorios;

/**
 *
 * @author ogi
 */
public class TipoSessaoController {
    RepositorioGenerico<TipoSessao, Integer> repositorioTipoSessao  = null;
    
    public TipoSessaoController(){
        this.repositorioTipoSessao = FactoryRepositorios.fabricarRepositorio(
                FactoryRepositorios.TIPOSESSAO, FactoryRepositorios.BANCODADOS);
    }

    public void inserir(TipoSessao t) {
        repositorioTipoSessao.inserir(t);
    }

    public void alterar(TipoSessao t) {
        repositorioTipoSessao.alterar(t);
    }

    public TipoSessao recuperar(Integer g) {
        return repositorioTipoSessao.recuperar(g);
    }

    public void excluir(TipoSessao t) {
        repositorioTipoSessao.excluir(t);
    }

    public List<TipoSessao> recuperarTodos() {
        return repositorioTipoSessao.recuperarTodos();
    }
    
    
}
