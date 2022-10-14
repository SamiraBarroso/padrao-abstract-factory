package ufjf.br;

public class Aluguel {

    private Cliente cliente;
    private Imovel imovel;

    public Aluguel (FabricaAbstrata fabrica) {
        this.cliente = fabrica.createCliente();
        this.imovel = fabrica.createImovel();
    }

    public String emitirRecibo() {
        return "Locação de: " + this.imovel.getInfos() +
                " por: "+ this.cliente.getInfos() ;
    }

}
