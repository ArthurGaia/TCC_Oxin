package controller.interfaces;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 * 
 * Interface Produto
 */
public interface IProduto {
    public int getIdProduto();
    
    public int getIdUnidadeMedidaProduto();
    
    public String getNomeProduto();
    
    public float getValorUnitarioProduto();
    
    public String getTipoProduto();
    
    public String getDescricaoProduto();
    
    public Date getDataCriacaoProduto();
    
    public Date getDataModificacaoProduto();
}
