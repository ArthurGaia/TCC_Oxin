package controller.abs;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public abstract class ABSVendas {
    private int idVenda;
    private int idCooperadorVenda;
    private int idProdutoVenda;
    private int idUnidadeMedidaVenda;
    private float pesoVenda;
    private float valorVenda;
    private Date dataVenda;
    private String statusVenda;
    private String observacoesVenda;

    public ABSVendas(int idVenda, int idCooperadorVenda, int idProdutoVenda, int idUnidadeMedidaVenda) {
        this.idVenda = idVenda;
        this.idCooperadorVenda = idCooperadorVenda;
        this.idProdutoVenda = idProdutoVenda;
        this.idUnidadeMedidaVenda = idUnidadeMedidaVenda;
    }

    public ABSVendas(int idVenda, int idCooperadorVenda, int idProdutoVenda, int idUnidadeMedidaVenda, float pesoVenda, float valorVenda, Date dataVenda, String statusVenda, String observacoesVenda) {
        this.idVenda = idVenda;
        this.idCooperadorVenda = idCooperadorVenda;
        this.idProdutoVenda = idProdutoVenda;
        this.idUnidadeMedidaVenda = idUnidadeMedidaVenda;
        this.pesoVenda = pesoVenda;
        this.valorVenda = valorVenda;
        this.dataVenda = dataVenda;
        this.statusVenda = statusVenda;
        this.observacoesVenda = observacoesVenda;
    }

    public int getIdVenda() {
        return idVenda;
    }

    public int getIdCooperadorVenda() {
        return idCooperadorVenda;
    }

    public int getIdProdutoVenda() {
        return idProdutoVenda;
    }

    public int getIdUnidadeMedidaVenda() {
        return idUnidadeMedidaVenda;
    }

    public float getPesoVenda() {
        return pesoVenda;
    }

    public float getValorVenda() {
        return valorVenda;
    }

    public Date getDataVenda() {
        return dataVenda;
    }

    public String getStatusVenda() {
        return statusVenda;
    }

    public String getObservacoesVenda() {
        return observacoesVenda;
    }
    
    
}
