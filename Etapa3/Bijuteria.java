public class Bijuteria extends Loja{
    
    private double metaVendas;

    public Bijuteria(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, double metaVendas){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.metaVendas = metaVendas;
    }

    public double getMetaVendas(){
        return metaVendas;
    }

    public void setMetaVendas(double metaVendas){
        this.metaVendas = metaVendas;
    }

    public String toString(){
        return "Nome da Loja: " + getNome()
                + "\n Quantidade de Funcionarios: " + getQuantidadeFuncionarios()
                + "\n Salario Base dos Funcionarios: " + getSalarioBaseFuncionario()
                + "\n Endereço: " + getEndereco()
                + "\n Data de Fundação: " + getDataFundacao()
                + "\n Meta de Vendas: " + getMetaVendas();
    }

}
