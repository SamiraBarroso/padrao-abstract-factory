package ufjf.br;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AluguelTest {

    @Test
    void deveEmitirHReciboPessoaFisica() {
        FabricaAbstrata fabrica = new FabricaAluguelPessoaFisica();
        Aluguel aluguel = new Aluguel(fabrica);
        assertEquals("Locação de: Imóvel Residencial por: Pessoa Fisica - cpf = xxx.xxx.xxx-xx", aluguel.emitirRecibo());
    }

    @Test
    void deveEmitirReciboPessoaJuridica() {
        FabricaAbstrata fabrica = new FabricaAluguelPessoaJuridica();
        Aluguel aluguel = new Aluguel(fabrica);
        assertEquals("Locação de: Imóvel Comercial por: Pessoa Jurídica - cnpj = xx.xxx.xxx/0001-xx", aluguel.emitirRecibo());
    }
}