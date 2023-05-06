package controller.impl;

import controller.abs.ABSAliquotaProduto;
import controller.interfaces.IAliquotaProduto;
import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public class AliquotaProduto extends ABSAliquotaProduto implements IAliquotaProduto{

    public AliquotaProduto(int idAliquotaProduto, int idProduto, int idUnidadeMedida) {
        super(idAliquotaProduto, idProduto, idUnidadeMedida);
    }

    public AliquotaProduto(int idAliquotaProduto, int idProduto, int idUnidadeMedida, float pesoAliquotaProduto, int valorPrctProduto, Date dataCadastroAliquotaProduto, Date dataModificacaoAliquotaProduto) {
        super(idAliquotaProduto, idProduto, idUnidadeMedida, pesoAliquotaProduto, valorPrctProduto, dataCadastroAliquotaProduto, dataModificacaoAliquotaProduto);
    }
    
}
