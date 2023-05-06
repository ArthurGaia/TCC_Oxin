package controller.abs;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public abstract class ABSComissoesProdutoCalculadas {
    private int idComissaoCalculada;
    private int idVendaComissaoCalculada;
    private int idCooperadorComissaoCalculada;
    private int idProdutoComissaoCalculada;
    private int idUnidadeMedidaComissaoCalculada;
    private int idAliquotaProdutoComissaoCalculada;
    private float valorComissaoCalculada;
    private Date dataComissaoCalculada;
    private String statusComissaoCalculada;

    public ABSComissoesProdutoCalculadas(int idComissaoCalculada, 
            int idVendaComissaoCalculada, int idCooperadorComissaoCalculada, 
            int idProdutoComissaoCalculada, 
            int idUnidadeMedidaComissaoCalculada, 
            int idAliquotaProdutoComissaoCalculada) {
        this.idComissaoCalculada = idComissaoCalculada;
        this.idVendaComissaoCalculada = idVendaComissaoCalculada;
        this.idCooperadorComissaoCalculada = idCooperadorComissaoCalculada;
        this.idProdutoComissaoCalculada = idProdutoComissaoCalculada;
        this.idUnidadeMedidaComissaoCalculada = idUnidadeMedidaComissaoCalculada;
        this.idAliquotaProdutoComissaoCalculada = idAliquotaProdutoComissaoCalculada;
    }

    public ABSComissoesProdutoCalculadas(int idComissaoCalculada, 
            int idVendaComissaoCalculada, int idCooperadorComissaoCalculada, 
            int idProdutoComissaoCalculada, 
            int idUnidadeMedidaComissaoCalculada, 
            int idAliquotaProdutoComissaoCalculada, 
            float valorComissaoCalculada, Date dataComissaoCalculada, 
            String statusComissaoCalculada) {
        this.idComissaoCalculada = idComissaoCalculada;
        this.idVendaComissaoCalculada = idVendaComissaoCalculada;
        this.idCooperadorComissaoCalculada = idCooperadorComissaoCalculada;
        this.idProdutoComissaoCalculada = idProdutoComissaoCalculada;
        this.idUnidadeMedidaComissaoCalculada = idUnidadeMedidaComissaoCalculada;
        this.idAliquotaProdutoComissaoCalculada = idAliquotaProdutoComissaoCalculada;
        this.valorComissaoCalculada = valorComissaoCalculada;
        this.dataComissaoCalculada = dataComissaoCalculada;
        this.statusComissaoCalculada = statusComissaoCalculada;
    }

    public int getIdComissaoCalculada() {
        return idComissaoCalculada;
    }

    public int getIdVendaComissaoCalculada() {
        return idVendaComissaoCalculada;
    }

    public int getIdCooperadorComissaoCalculada() {
        return idCooperadorComissaoCalculada;
    }

    public int getIdProdutoComissaoCalculada() {
        return idProdutoComissaoCalculada;
    }

    public int getIdUnidadeMedidaComissaoCalculada() {
        return idUnidadeMedidaComissaoCalculada;
    }

    public int getIdAliquotaProdutoComissaoCalculada() {
        return idAliquotaProdutoComissaoCalculada;
    }

    public float getValorComissaoCalculada() {
        return valorComissaoCalculada;
    }

    public Date getDataComissaoCalculada() {
        return dataComissaoCalculada;
    }

    public String getStatusComissaoCalculada() {
        return statusComissaoCalculada;
    }
     
}
