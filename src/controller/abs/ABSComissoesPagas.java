/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.abs;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public abstract class ABSComissoesPagas {
    private int idComissaoPaga;
    private int idCooperadorComissaoPaga;
    private float valorComissaoPaga;
    private Date dataInicioComissaoPaga;
    private Date dataFimComissaoPaga;
    private Date dataCadastroComissaoPaga;
    private Date dataPagaComissaoPaga;
    private String statusComissaoPaga;
    private String observacoesComissaoPaga;

    public ABSComissoesPagas(int idComissaoPaga, int idCooperadorComissaoPaga) {
        this.idComissaoPaga = idComissaoPaga;
        this.idCooperadorComissaoPaga = idCooperadorComissaoPaga;
    }

    public ABSComissoesPagas(int idComissaoPaga, int idCooperadorComissaoPaga, float valorComissaoPaga, Date dataInicioComissaoPaga, Date dataFimComissaoPaga, Date dataCadastroComissaoPaga, Date dataPagaComissaoPaga, String statusComissaoPaga, String observacoesComissaoPaga) {
        this.idComissaoPaga = idComissaoPaga;
        this.idCooperadorComissaoPaga = idCooperadorComissaoPaga;
        this.valorComissaoPaga = valorComissaoPaga;
        this.dataInicioComissaoPaga = dataInicioComissaoPaga;
        this.dataFimComissaoPaga = dataFimComissaoPaga;
        this.dataCadastroComissaoPaga = dataCadastroComissaoPaga;
        this.dataPagaComissaoPaga = dataPagaComissaoPaga;
        this.statusComissaoPaga = statusComissaoPaga;
        this.observacoesComissaoPaga = observacoesComissaoPaga;
    }

    public int getIdComissaoPaga() {
        return idComissaoPaga;
    }

    public int getIdCooperadorComissaoPaga() {
        return idCooperadorComissaoPaga;
    }

    public float getValorComissaoPaga() {
        return valorComissaoPaga;
    }

    public Date getDataInicioComissaoPaga() {
        return dataInicioComissaoPaga;
    }

    public Date getDataFimComissaoPaga() {
        return dataFimComissaoPaga;
    }

    public Date getDataCadastroComissaoPaga() {
        return dataCadastroComissaoPaga;
    }

    public Date getDataPagaComissaoPaga() {
        return dataPagaComissaoPaga;
    }

    public String getStatusComissaoPaga() {
        return statusComissaoPaga;
    }

    public String getObservacoesComissaoPaga() {
        return observacoesComissaoPaga;
    }
    
    
}
