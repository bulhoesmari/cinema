/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import dao.DaoManagerHiber;
import java.util.List;
import negocio.Filme;
import negocio.Ingresso;
import negocio.Sala;
import negocio.Sessao;
import negocio.TipoSessao;
import persistencia.comportamentos.RepositorioGenerico;
import persistencia.implemtacoes.FactoryRepositorios;

/**
 *
 * @author ogi
 */
public class Fachada {
    private static Fachada myself = null;

    private RepositorioGenerico<TipoSessao, Integer> repositorioTipoSessao = null;
    private RepositorioGenerico<Sessao, Integer> repositorioSessao = null;
    private RepositorioGenerico<Ingresso, Integer> repositorioIngresso = null;
    private RepositorioGenerico<Sala, Integer> repositorioSala = null;
    private RepositorioGenerico<Filme, Integer> repositorioFilme = null;
    
    private Fachada() {
        
        this.repositorioTipoSessao = FactoryRepositorios.fabricarRepositorio(
                FactoryRepositorios.TIPOSESSAO, FactoryRepositorios.BANCODADOS);
        this.repositorioSessao = FactoryRepositorios.fabricarRepositorio(FactoryRepositorios.SESSAO, FactoryRepositorios.BANCODADOS);
        this.repositorioFilme = FactoryRepositorios.fabricarRepositorio(FactoryRepositorios.FILME, FactoryRepositorios.BANCODADOS);
        this.repositorioIngresso = FactoryRepositorios.fabricarRepositorio(FactoryRepositorios.INGRESSO, FactoryRepositorios.BANCODADOS);
        this.repositorioSala = FactoryRepositorios.fabricarRepositorio(FactoryRepositorios.SALA, FactoryRepositorios.BANCODADOS);

    }
    
    public static Fachada getInstance() {
        if (myself == null) {
            myself = new Fachada();
        }
        return myself;
    }
    
   
    public void inserirFilmeBD(Filme t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    public void alterarFilmeBD(Filme t) {
        DaoManagerHiber.getInstance().update(t);
    }

    public Filme recuperarFilmeBD(Integer g) {
        try {
            return (Filme) DaoManagerHiber.getInstance().recover("from Filme where codigo=" + g).get(0);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public void excluirFilmeBD(Filme t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    public List<Filme> recuperarTodosFilmesBD() {
        return DaoManagerHiber.getInstance().recover("from Filme");
    }

    public void inserirSalaBD(Sala t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    public void alterarSalaBD(Sala t) {
        DaoManagerHiber.getInstance().update(t);
    }

    public Sala recuperarClienteBD(Integer g) {
        try {
            return (Sala) DaoManagerHiber.getInstance().recover("from Sala where cpf=" + g);
        } catch (IndexOutOfBoundsException e) {
            return null;
        }
    }

    public void excluirSalaBD(Sala t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    public List<Sala> recuperarTodosSalaBD() {
        return DaoManagerHiber.getInstance().recover("from Sala");
    }

    public void inserirTipoSessaoBD(TipoSessao t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    public void alterarTipoSessaoBD(TipoSessao t) {
        DaoManagerHiber.getInstance().update(t);
    }

    public TipoSessao recuperarServicoBD(Integer g) {
        try {
            return (TipoSessao) DaoManagerHiber.getInstance().recover("from TipoSessao where codigo=" + g);
        } catch (IndexOutOfBoundsException e) {
            return null;

        }
    }

    public void excluirTipoSessaoBD(TipoSessao t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    public List<TipoSessao> recuperarTipoSessaoBD() {
        return DaoManagerHiber.getInstance().recover("from TipoSessao");
    }

    public void inserirSessaoBD(Sessao t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    public void alterarSessaoBD(Sessao t) {
        DaoManagerHiber.getInstance().update(t);
    }

    public Sessao recuperarSessaoBD(Integer g) {
        try {
            return (Sessao) DaoManagerHiber.getInstance().recover("from Sessao where codigo=" + g);
        } catch (IndexOutOfBoundsException e) {
            return null;

        }
    }

    public void excluirSessaoBD(Sessao t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    public List<Sessao> recuperarTodosSessaoBD() {
        return DaoManagerHiber.getInstance().recover("from Sessao");
    }

    public void inserirIngressoBD(Ingresso t) {
        DaoManagerHiber.getInstance().persist(t);
    }

    public void alterarIngressoBD(Ingresso t) {
        DaoManagerHiber.getInstance().update(t);
    }

    public Ingresso recuperarIngressoBD(Integer g) {
        try {
            return (Ingresso) DaoManagerHiber.getInstance().recover("from Ingresso where codigo=" + g).get(0);
        } catch (IndexOutOfBoundsException in) {
            return null;
        }
    }

    public void excluirIngressoBD(Ingresso t) {
        DaoManagerHiber.getInstance().delete(t);
    }

    public List<Ingresso> recuperarTodosIngressoBD() {
        return DaoManagerHiber.getInstance().recover("from Ingresso");
    }

}


