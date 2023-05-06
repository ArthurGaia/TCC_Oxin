package controller.abs;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public abstract class ABSProduto {
    private int idProduto;
    private int idUnidadeMedidaProduto;
    private String nomeProduto;
    private float valorUnitarioProduto;
    private String tipoProduto;
    private String descricaoProduto;
    private Date dataCriacaoProduto;
    private Date dataModificacaoProduto;

    public ABSProduto(int idProduto, int idUnidadeMedidaProduto) {
        this.idProduto = idProduto;
        this.idUnidadeMedidaProduto = idUnidadeMedidaProduto;
    }

    public ABSProduto(int idProduto, int idUnidadeMedidaProduto, String nomeProduto, float valorUnitarioProduto, String tipoProduto, String descricaoProduto, Date dataCriacaoProduto, Date dataModificacaoProduto) {
        this.idProduto = idProduto;
        this.idUnidadeMedidaProduto = idUnidadeMedidaProduto;
        this.nomeProduto = nomeProduto;
        this.valorUnitarioProduto = valorUnitarioProduto;
        this.tipoProduto = tipoProduto;
        this.descricaoProduto = descricaoProduto;
        this.dataCriacaoProduto = dataCriacaoProduto;
        this.dataModificacaoProduto = dataModificacaoProduto;
    }

    public int getIdProduto() {
        return idProduto;
    }

    public int getIdUnidadeMedidaProduto() {
        return idUnidadeMedidaProduto;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public float getValorUnitarioProduto() {
        return valorUnitarioProduto;
    }

    public String getTipoProduto() {
        return tipoProduto;
    }

    public String getDescricaoProduto() {
        return descricaoProduto;
    }

    public Date getDataCriacaoProduto() {
        return dataCriacaoProduto;
    }

    public Date getDataModificacaoProduto() {
        return dataModificacaoProduto;
    }
    
    
}
