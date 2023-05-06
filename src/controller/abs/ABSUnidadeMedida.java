package controller.abs;

/**
 *
 * @author ATHUR GAIA
 */
public abstract class ABSUnidadeMedida {
    private int idUnidadeMedida;
    private String nomeUnidadeMedida;
    private String siglaUnidadeMedida;
    private float valorKgUnidadeMedida;

    public ABSUnidadeMedida(int idUnidadeMedida) {
        this.idUnidadeMedida = idUnidadeMedida;
    }

    public ABSUnidadeMedida(int idUnidadeMedida, String nomeUnidadeMedida, String siglaUnidadeMedida,float valorKgUnidadeMedida) {
        this.idUnidadeMedida = idUnidadeMedida;
        this.nomeUnidadeMedida = nomeUnidadeMedida;
        this.siglaUnidadeMedida = siglaUnidadeMedida;
        this.valorKgUnidadeMedida = valorKgUnidadeMedida;
    }

    public int getIdUnidadeMedida() {
        return idUnidadeMedida;
    }

    public String getNomeUnidadeMedida() {
        return nomeUnidadeMedida;
    }

    public String getSiglaUnidadeMedida() {
        return siglaUnidadeMedida;
    }
    
    public float getValorKgUnidadeMedida() {
        return valorKgUnidadeMedida;
    }
    
    
}
