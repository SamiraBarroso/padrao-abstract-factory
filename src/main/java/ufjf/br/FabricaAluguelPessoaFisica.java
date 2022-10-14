package ufjf.br;

public class FabricaAluguelPessoaFisica implements FabricaAbstrata{
    @Override
    public Cliente createCliente() {
        return new PessoaFisica();
    }
    @Override
    public Imovel createImovel() {
        return new ImovelResidencial();
    }
}
