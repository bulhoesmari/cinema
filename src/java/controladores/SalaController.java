/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import negocio.Filme;
import negocio.Sala;
import persistencia.comportamentos.RepositorioGenerico;
import persistencia.implemtacoes.FactoryRepositorios;

/**
 *
 * @author ogi
 */
public class SalaController {
    RepositorioGenerico<Sala, Integer> repositorioSala  = null;
    
    public SalaController(){
        this.repositorioSala = FactoryRepositorios.fabricarRepositorio(
                FactoryRepositorios.FILME, FactoryRepositorios.BANCODADOS);
    }

    public void inserir(Sala t) {
        repositorioSala.inserir(t);
    }

    public void alterar(Sala t) {
        repositorioSala.alterar(t);
    }

    public Sala recuperar(Integer g) {
        return repositorioSala.recuperar(g);
    }

    public void excluir(Sala t) {
        repositorioSala.excluir(t);
    }

    public List<Sala> recuperarTodos() {
        return repositorioSala.recuperarTodos();
    }
    
    
}
