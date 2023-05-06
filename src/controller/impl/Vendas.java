package controller.impl;

import controller.abs.ABSVendas;
import controller.interfaces.IVendas;
import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public class Vendas extends ABSVendas implements IVendas{

    public Vendas(int idVenda, int idCooperadorVenda, int idProdutoVenda, 
            int idUnidadeMedidaVenda) {
        super(idVenda, idCooperadorVenda, idProdutoVenda, idUnidadeMedidaVenda);
    }

    public Vendas(int idVenda, int idCooperadorVenda, int idProdutoVenda, 
            int idUnidadeMedidaVenda, float pesoVenda, float valorVenda, 
            Date dataVenda, String statusVenda, String observacoesVenda) {
        super(idVenda, idCooperadorVenda, idProdutoVenda, idUnidadeMedidaVenda, 
                pesoVenda, valorVenda, dataVenda, statusVenda, 
                observacoesVenda);
    }
    
}
