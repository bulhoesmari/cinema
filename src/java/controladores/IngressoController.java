/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import negocio.Ingresso;
import negocio.Sessao;
import persistencia.comportamentos.RepositorioGenerico;
import persistencia.implemtacoes.FactoryRepositorios;

/**
 *
 * @author ogi
 */
public class IngressoController {
    RepositorioGenerico<Ingresso, Integer> repositorioIngresso  = null;
    
    public IngressoController(){
        this.repositorioIngresso = FactoryRepositorios.fabricarRepositorio(
                FactoryRepositorios.INGRESSO, FactoryRepositorios.BANCODADOS);
    }

    public void inserir(Ingresso t) {
        repositorioIngresso.inserir(t);
    }

    public void alterar(Ingresso t) {
        repositorioIngresso.alterar(t);
    }

    public Ingresso recuperar(Integer g) {
        return repositorioIngresso.recuperar(g);
    }

    public void excluir(Ingresso t) {
        repositorioIngresso.excluir(t);
    }

    public List<Ingresso> recuperarTodos() {
        return repositorioIngresso.recuperarTodos();
    }
    
    
}
