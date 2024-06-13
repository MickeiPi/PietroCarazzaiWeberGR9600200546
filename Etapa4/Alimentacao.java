public class Alimentacao extends Loja{
    
    private Data dataAlvara;

    public Alimentacao(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, Data dataAlvara, int tamanho){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao, tamanho);
        this.dataAlvara = dataAlvara;
    }

    public Data getDataAlvara(){
        return dataAlvara;
    }

    public void setDataAlvara(Data dataAlvara){
        this.dataAlvara = dataAlvara;
    }

    public String toString(){
        return "Nome da Loja: " + getNome()
                + "\n Quantidade de Funcionarios: " + getQuantidadeFuncionarios()
                + "\n Salario Base dos Funcionarios: " + getSalarioBaseFuncionario()
                + "\n Endereço: " + getEndereco()
                + "\n Data de Fundação: " + getDataFundacao()
                + "\n Data do Alvara: " + getDataAlvara();
    }

}
