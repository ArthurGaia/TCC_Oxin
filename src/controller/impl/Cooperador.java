package controller.impl;

import controller.abs.ABSCooperador;
import controller.interfaces.ICooperador;
import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public class Cooperador extends ABSCooperador implements ICooperador{

    public Cooperador(int idCooperador, String cpfCooperador, 
            String nomeCooperador) {
        super(idCooperador, cpfCooperador, nomeCooperador);
    }

    public Cooperador(int idCooperador, String cpfCooperador, 
            String nomeCooperador, int idadeCooperador, 
            String enderecoCooperador, Date dataEntradaCooperador, 
            Date dataUltmComissaoCooperador, String status, 
            Date dataStatusCooperador) {
        super(idCooperador, cpfCooperador, nomeCooperador, 
                idadeCooperador, enderecoCooperador, 
                dataEntradaCooperador, dataUltmComissaoCooperador, 
                status, dataStatusCooperador);
    }
    
}
