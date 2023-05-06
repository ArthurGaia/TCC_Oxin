package controller.impl;

import controller.abs.ABSProduto;
import controller.interfaces.IProduto;
import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public class Produto extends ABSProduto implements IProduto{

    public Produto(int idProduto, int idUnidadeMedidaProduto) {
        super(idProduto, idUnidadeMedidaProduto);
    }

    public Produto(int idProduto, int idUnidadeMedidaProduto, 
            String nomeProduto, float valorUnitarioProduto, 
            String tipoProduto, String descricaoProduto, 
            Date dataCriacaoProduto, Date dataModificacaoProduto) {
        super(idProduto, idUnidadeMedidaProduto, nomeProduto, 
                valorUnitarioProduto, tipoProduto, descricaoProduto, 
                dataCriacaoProduto, dataModificacaoProduto);
    }
    
}
