package controller.interfaces;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public interface IComissoesPagas {
    public int getIdComissaoPaga();
    
    public int getIdCooperadorComissaoPaga();
    
    public float getValorComissaoPaga();
    
    public Date getDataInicioComissaoPaga();
    
    public Date getDataFimComissaoPaga();
    
    public Date getDataCadastroComissaoPaga();
    
    public Date getDataPagaComissaoPaga();
    
    public String getStatusComissaoPaga();
    
    public String getObservacoesComissaoPaga();
}
