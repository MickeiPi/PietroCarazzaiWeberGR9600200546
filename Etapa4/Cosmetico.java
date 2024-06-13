public class Cosmetico extends Loja {

    private double taxaComercializacao;

    public Cosmetico(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double taxaComercializacao, int tamanho){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanho);
        this.taxaComercializacao = taxaComercializacao;

    }

    public double getTaxaComercializacao(){
        return taxaComercializacao;
    }

    public void setTaxaComercializacao(double taxaComercializacao){
        this.taxaComercializacao = taxaComercializacao;
    }

    public String toString(){
        return "Nome da Loja: " + getNome()
                + "\n Quantidade de Funcionarios: " + getQuantidadeFuncionarios()
                + "\n Salario Base dos Funcionarios: " + getSalarioBaseFuncionario()
                + "\n Endereço: " + getEndereco()
                + "\n Data de Fundação: " + getDataFundacao()
                + "\n Taxa do Comércio: " + getTaxaComercializacao();
    }

}
