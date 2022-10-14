package ufjf.br;

public class FabricaAluguelPessoaJuridica implements FabricaAbstrata{
    @Override
    public Cliente createCliente() {
        return new PessoaJuridica();
    }
    @Override
    public Imovel createImovel() {
        return new ImovelComercial();
    }
}
