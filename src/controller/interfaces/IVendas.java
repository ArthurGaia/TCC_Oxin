package controller.interfaces;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 * 
 * Interface Vendas
 */
public interface IVendas {
    public int getIdVenda();
    
    public int getIdCooperadorVenda();
    
    public int getIdProdutoVenda();
    
    public int getIdUnidadeMedidaVenda();
    
    public float getPesoVenda();
    
    public float getValorVenda();
    
    public Date getDataVenda();
    
    public String getStatusVenda();
    
    public String getObservacoesVenda();
    
}
