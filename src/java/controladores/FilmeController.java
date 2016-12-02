/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import negocio.Filme;
import persistencia.comportamentos.RepositorioGenerico;
import persistencia.implemtacoes.FactoryRepositorios;

/**
 *
 * @author ogi
 */
@ManagedBean
@SessionScoped
public class FilmeController {
    RepositorioGenerico<Filme, Integer> repositorioFilme  = null;
    
    public FilmeController(){
        this.repositorioFilme = FactoryRepositorios.fabricarRepositorio(
                FactoryRepositorios.FILME, FactoryRepositorios.BANCODADOS);
    }
    
     public void inserir(Filme filme) {
        this.repositorioFilme.inserir(filme);
    }

    public void alterar(Filme filme) {
        this.repositorioFilme.alterar(filme);
    }

    public Filme recuperarFilme(int codigo) {
        return this.repositorioFilme.recuperar(codigo);
    }

    public void excluir(Filme filme) {
        this.repositorioFilme.excluir(filme);
    }

    public List<Filme> recuperarTodosCliente() {
        return this.repositorioFilme.recuperarTodos();
    }
    
}
