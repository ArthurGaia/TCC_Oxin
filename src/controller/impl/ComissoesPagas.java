package controller.impl;

import controller.abs.ABSComissoesPagas;
import controller.interfaces.IComissoesPagas;
import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public class ComissoesPagas extends ABSComissoesPagas 
        implements IComissoesPagas{

    public ComissoesPagas(int idComissaoPaga, int idCooperadorComissaoPaga) {
        super(idComissaoPaga, idCooperadorComissaoPaga);
    }

    public ComissoesPagas(int idComissaoPaga, int idCooperadorComissaoPaga, 
            float valorComissaoPaga, Date dataInicioComissaoPaga, 
            Date dataFimComissaoPaga, Date dataCadastroComissaoPaga, 
            Date dataPagaComissaoPaga, String statusComissaoPaga, 
            String observacoesComissaoPaga) {
        super(idComissaoPaga, idCooperadorComissaoPaga, valorComissaoPaga, 
                dataInicioComissaoPaga, dataFimComissaoPaga, 
                dataCadastroComissaoPaga, dataPagaComissaoPaga, 
                statusComissaoPaga, observacoesComissaoPaga);
    }
    
}
