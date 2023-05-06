package controller.interfaces;

import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 * 
 * Interface Cooperador
 */
public interface ICooperador {
    
    public int getIdCooperador();                    // ID_COOPERADOR
            
    public String getCpfCooperador();                // CPF_COOP
    
    public String getNomeCooperador();               // NOME_COOP
    
    public int getIdadeCooperador();                 // IDADE_COOP
    
    public String getEnderecoCooperador();           // ENDERECO
    
    public Date getDataEntradaCooperador();          // DATA_ENTRADA
    
    public Date getDataUltmComissaoCooperador();     // DATA_ULTIMACOMISSAOPAGA
    
    public String getStatus();                       // STATUS
    
    public Date getDataStatusCooperador();           // DATA_STATUS_COOPERADOR
}
