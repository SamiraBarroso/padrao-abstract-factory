package ufjf.br;

public class PessoaJuridica implements Cliente{
    @Override
    public String getInfos() {
        return "Pessoa Jurídica - cnpj = xx.xxx.xxx/0001-xx" ;
    }
}
