package controller.construtor;

import controller.impl.ComissoesPagas;
import controller.impl.ComissoesProdutoCalculadas;
import controller.impl.Cooperador;
import controller.impl.Produto;
import controller.impl.UnidadeMedida;
import controller.impl.Vendas;
import controller.interfaces.IComissoesPagas;
import controller.interfaces.IComissoesProdutoCalculadas;
import controller.interfaces.ICooperador;
import controller.interfaces.IProduto;
import controller.interfaces.IUnidadeMedida;
import controller.interfaces.IVendas;
import java.util.Date;

/**
 *
 * @author ATHUR GAIA
 */
public class ConstrutorObjetos {

    public ICooperador getICooperador(int idCooperador, String cpfCooperador, 
            String nomeCooperador)
    {
        return new Cooperador(idCooperador, cpfCooperador, nomeCooperador);
    }
    
    public ICooperador getICooperador(int idCooperador, String cpfCooperador, 
            String nomeCooperador, int idadeCooperador, 
            String enderecoCooperador, Date dataEntradaCooperador, 
            Date dataUltmComissaoCooperador, String status, 
            Date dataStatusCooperador)
    {
        return new Cooperador(idCooperador, cpfCooperador, nomeCooperador, 
                idadeCooperador, enderecoCooperador, 
                dataEntradaCooperador, dataUltmComissaoCooperador, 
                status, dataStatusCooperador);
    }
    
    public IUnidadeMedida getIUnidadeMedida(int idUnidadeMedida)
    {
        return new UnidadeMedida(idUnidadeMedida);
    }
    
    public IUnidadeMedida getIUnidadeMedida(int idUnidadeMedida, 
            String nomeUnidadeMedida, String siglaUnidadeMedida,
            float valorKgUnidadeMedida)
    {
        return new UnidadeMedida(idUnidadeMedida, nomeUnidadeMedida, 
                siglaUnidadeMedida, valorKgUnidadeMedida);
    }
    
    public IProduto getIProduto(int idProduto, int idUnidadeMedidaProduto)
    {
        return new Produto(idProduto, idUnidadeMedidaProduto);
    }
    
    public IProduto getIProduto(int idProduto, int idUnidadeMedidaProduto, 
            String nomeProduto, float valorUnitarioProduto, 
            String tipoProduto, String descricaoProduto, 
            Date dataCriacaoProduto, Date dataModificacaoProduto)
    {
        return new Produto(idProduto, idUnidadeMedidaProduto, nomeProduto, 
                valorUnitarioProduto, tipoProduto, descricaoProduto, 
                dataCriacaoProduto, dataModificacaoProduto);
    }
    
    public IVendas getIVendas(int idVenda, int idCooperadorVenda, 
            int idProdutoVenda, int idUnidadeMedidaVenda) 
    {
        return new Vendas(idVenda, idCooperadorVenda, idProdutoVenda, 
                idUnidadeMedidaVenda);
    }
    
    public IVendas getIVendas(int idVenda, int idCooperadorVenda, 
            int idProdutoVenda, int idUnidadeMedidaVenda, float pesoVenda, 
            float valorVenda,Date dataVenda, String statusVenda, 
            String observacoesVenda)
    {
        return new Vendas(idVenda, idCooperadorVenda, idProdutoVenda, 
                idUnidadeMedidaVenda, pesoVenda, valorVenda, dataVenda, 
                statusVenda, observacoesVenda);
    }
    
    public IComissoesProdutoCalculadas getIComissoesProdutoCalculadas(
            int idComissaoCalculada, 
            int idVendaComissaoCalculada, int idCooperadorComissaoCalculada, 
            int idProdutoComissaoCalculada, 
            int idUnidadeMedidaComissaoCalculada, 
            int idAliquotaProdutoComissaoCalculada)
    {
        return new ComissoesProdutoCalculadas(idComissaoCalculada, 
                idVendaComissaoCalculada, 
                idCooperadorComissaoCalculada, idProdutoComissaoCalculada, 
                idUnidadeMedidaComissaoCalculada, 
                idAliquotaProdutoComissaoCalculada);
    }
    
    public IComissoesProdutoCalculadas getIComissoesProdutoCalculadas(
            int idComissaoCalculada, 
            int idVendaComissaoCalculada, int idCooperadorComissaoCalculada, 
            int idProdutoComissaoCalculada, 
            int idUnidadeMedidaComissaoCalculada, 
            int idAliquotaProdutoComissaoCalculada, 
            float valorComissaoCalculada, Date dataComissaoCalculada, 
            String statusComissaoCalculada)
    {
        return new ComissoesProdutoCalculadas(idComissaoCalculada, 
                idVendaComissaoCalculada, 
                idCooperadorComissaoCalculada, idProdutoComissaoCalculada, 
                idUnidadeMedidaComissaoCalculada, 
                idAliquotaProdutoComissaoCalculada, valorComissaoCalculada, 
                dataComissaoCalculada, statusComissaoCalculada);
    }
    
    public IComissoesPagas getIComissoesPagas(int idComissaoPaga, 
            int idCooperadorComissaoPaga)
    {
        return new ComissoesPagas(idComissaoPaga, idCooperadorComissaoPaga);
    }
    
    public IComissoesPagas getIComissoesPagas(int idComissaoPaga, 
            int idCooperadorComissaoPaga, float valorComissaoPaga, 
            Date dataInicioComissaoPaga, Date dataFimComissaoPaga, 
            Date dataCadastroComissaoPaga, Date dataPagaComissaoPaga, 
            String statusComissaoPaga, String observacoesComissaoPaga)
    {
        return new ComissoesPagas(idComissaoPaga, idCooperadorComissaoPaga, 
                valorComissaoPaga, dataInicioComissaoPaga, dataFimComissaoPaga, 
                dataCadastroComissaoPaga, dataPagaComissaoPaga, 
                statusComissaoPaga, observacoesComissaoPaga);
    }
}
