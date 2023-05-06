package controller.impl;

import controller.abs.ABSComissoesProdutoCalculadas;
import controller.interfaces.IComissoesProdutoCalculadas;
import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public class ComissoesProdutoCalculadas extends ABSComissoesProdutoCalculadas 
        implements IComissoesProdutoCalculadas{

    public ComissoesProdutoCalculadas(int idComissaoCalculada, 
            int idVendaComissaoCalculada, int idCooperadorComissaoCalculada, 
            int idProdutoComissaoCalculada, 
            int idUnidadeMedidaComissaoCalculada, 
            int idAliquotaProdutoComissaoCalculada) {
        super(idComissaoCalculada, idVendaComissaoCalculada, 
                idCooperadorComissaoCalculada, idProdutoComissaoCalculada, 
                idUnidadeMedidaComissaoCalculada, 
                idAliquotaProdutoComissaoCalculada);
    }

    public ComissoesProdutoCalculadas(int idComissaoCalculada, 
            int idVendaComissaoCalculada, int idCooperadorComissaoCalculada, 
            int idProdutoComissaoCalculada, 
            int idUnidadeMedidaComissaoCalculada, 
            int idAliquotaProdutoComissaoCalculada, 
            float valorComissaoCalculada, Date dataComissaoCalculada, 
            String statusComissaoCalculada) {
        super(idComissaoCalculada, idVendaComissaoCalculada, 
                idCooperadorComissaoCalculada, idProdutoComissaoCalculada, 
                idUnidadeMedidaComissaoCalculada, 
                idAliquotaProdutoComissaoCalculada, valorComissaoCalculada, 
                dataComissaoCalculada, statusComissaoCalculada);
    }
    
}
