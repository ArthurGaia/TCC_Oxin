package controller.interfaces;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 * 
 * Interface Aliquota Produto
 */
public interface IAliquotaProduto {
    public int getIdAliquotaProduto();
    
    public int getIdProduto();
    
    public int getIdUnidadeMedida();
    
    public float getPesoAliquotaProduto();
   
    public int getValorPrctProduto();
    
    public Date getDataCadastroAliquotaProduto();
    
    public Date getDataModificacaoAliquotaProduto();
}

