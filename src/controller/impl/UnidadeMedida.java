package controller.impl;

import controller.abs.ABSUnidadeMedida;
import controller.interfaces.IUnidadeMedida;

/**
 *
 * @author ATHUR GAIA
 */
public class UnidadeMedida extends ABSUnidadeMedida implements IUnidadeMedida{

    public UnidadeMedida(int idUnidadeMedida) {
        super(idUnidadeMedida);
    }

    public UnidadeMedida(int idUnidadeMedida, String nomeUnidadeMedida, 
            String siglaUnidadeMedida, float valorKgUnidadeMedida) {
        super(idUnidadeMedida, nomeUnidadeMedida, siglaUnidadeMedida,valorKgUnidadeMedida);
    }
    
}
