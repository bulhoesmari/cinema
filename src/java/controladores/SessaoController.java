/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import negocio.Sessao;
import negocio.TipoSessao;
import persistencia.comportamentos.RepositorioGenerico;
import persistencia.implemtacoes.FactoryRepositorios;

/**
 *
 * @author ogi
 */
public class SessaoController {
    RepositorioGenerico<Sessao, Integer> repositorioSessao  = null;
    
    public SessaoController(){
        this.repositorioSessao = FactoryRepositorios.fabricarRepositorio(
                FactoryRepositorios.SESSAO, FactoryRepositorios.BANCODADOS);
    }

    public void inserir(Sessao t) {
        repositorioSessao.inserir(t);
    }

    public void alterar(Sessao t) {
        repositorioSessao.alterar(t);
    }

    public Sessao recuperar(Integer g) {
        return repositorioSessao.recuperar(g);
    }

    public void excluir(Sessao t) {
        repositorioSessao.excluir(t);
    }

    public List<Sessao> recuperarTodos() {
        return repositorioSessao.recuperarTodos();
    }
    
    
}
