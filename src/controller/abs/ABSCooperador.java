package controller.abs;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public abstract class ABSCooperador {
    private int idCooperador;
    private String cpfCooperador;
    private String nomeCooperador;
    private int idadeCooperador;
    private String enderecoCooperador;
    private Date dataEntradaCooperador;
    private Date dataUltmComissaoCooperador;
    private String status;
    private Date dataStatusCooperador;

    public ABSCooperador(int idCooperador, String cpfCooperador, String nomeCooperador) {
        this.idCooperador = idCooperador;
        this.cpfCooperador = cpfCooperador;
        this.nomeCooperador = nomeCooperador;
    }

    public ABSCooperador(int idCooperador, String cpfCooperador, String nomeCooperador, int idadeCooperador, String enderecoCooperador, Date dataEntradaCooperador, Date dataUltmComissaoCooperador, String status, Date dataStatusCooperador) {
        this.idCooperador = idCooperador;
        this.cpfCooperador = cpfCooperador;
        this.nomeCooperador = nomeCooperador;
        this.idadeCooperador = idadeCooperador;
        this.enderecoCooperador = enderecoCooperador;
        this.dataEntradaCooperador = dataEntradaCooperador;
        this.dataUltmComissaoCooperador = dataUltmComissaoCooperador;
        this.status = status;
        this.dataStatusCooperador = dataStatusCooperador;
    }

    public int getIdCooperador() {
        return idCooperador;
    }

    public String getCpfCooperador() {
        return cpfCooperador;
    }

    public String getNomeCooperador() {
        return nomeCooperador;
    }

    public int getIdadeCooperador() {
        return idadeCooperador;
    }

    public String getEnderecoCooperador() {
        return enderecoCooperador;
    }

    public Date getDataEntradaCooperador() {
        return dataEntradaCooperador;
    }

    public Date getDataUltmComissaoCooperador() {
        return dataUltmComissaoCooperador;
    }

    public String getStatus() {
        return status;
    }

    public Date getDataStatusCooperador() {
        return dataStatusCooperador;
    }
    
    
}
