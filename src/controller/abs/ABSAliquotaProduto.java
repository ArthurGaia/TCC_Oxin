package controller.abs;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public abstract class ABSAliquotaProduto {
    private int idAliquotaProduto;
    private int idProduto;
    private int idUnidadeMedida;
    private float pesoAliquotaProduto;
    private int valorPrctProduto;
    private Date dataCadastroAliquotaProduto;
    private Date dataModificacaoAliquotaProduto;

    public ABSAliquotaProduto(int idAliquotaProduto, int idProduto, int idUnidadeMedida) {
        this.idAliquotaProduto = idAliquotaProduto;
        this.idProduto = idProduto;
        this.idUnidadeMedida = idUnidadeMedida;
    }

    public ABSAliquotaProduto(int idAliquotaProduto, int idProduto, int idUnidadeMedida, float pesoAliquotaProduto, int valorPrctProduto, Date dataCadastroAliquotaProduto, Date dataModificacaoAliquotaProduto) {
        this.idAliquotaProduto = idAliquotaProduto;
        this.idProduto = idProduto;
        this.idUnidadeMedida = idUnidadeMedida;
        this.pesoAliquotaProduto = pesoAliquotaProduto;
        this.valorPrctProduto = valorPrctProduto;
        this.dataCadastroAliquotaProduto = dataCadastroAliquotaProduto;
        this.dataModificacaoAliquotaProduto = dataModificacaoAliquotaProduto;
    }

    public int getIdAliquotaProduto() {
        return idAliquotaProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdUnidadeMedida() {
        return idUnidadeMedida;
    }

    public float getPesoAliquotaProduto() {
        return pesoAliquotaProduto;
    }

    public int getValorPrctProduto() {
        return valorPrctProduto;
    }

    public Date getDataCadastroAliquotaProduto() {
        return dataCadastroAliquotaProduto;
    }

    public Date getDataModificacaoAliquotaProduto() {
        return dataModificacaoAliquotaProduto;
    }
    
    
}
