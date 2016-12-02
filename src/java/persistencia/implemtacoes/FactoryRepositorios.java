/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia.implemtacoes;

import persistencia.comportamentos.RepositorioGenerico;

/**
 *
 * @author ogi
 */
public class FactoryRepositorios {
    public static final int TIPOSESSAO = 1;
    public static final int FILME = 2;
    public static final int SALA = 3;
    public static final int INGRESSO = 4;
    public static final int SESSAO = 5;
    public static final int BANCODADOS = 1;
   

    public static RepositorioGenerico fabricarRepositorio(int tipoNegocio, int tipoPersistencia) {
       
        if (tipoPersistencia == BANCODADOS) {
            switch (tipoNegocio) {
                case 1:
                    return new RepositorioTipoSessaoBD();
                case 4:
                    return new RepositorioFilmeBD();
                case 2:
                    return new RepositorioSalaBD();
                case 3:
                    return new RepositorioIngressoBD();
                case 5:
                    return new RepositorioSessaoBD();
                default:
                    break;
            }
        }
        return null;
    }
}
