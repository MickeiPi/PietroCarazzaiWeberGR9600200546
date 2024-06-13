public class Vestuario extends Loja{
    
    private boolean produtosImportados;

    public Vestuario(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, boolean produtosImportados){
        super(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);
        this.produtosImportados = produtosImportados;
    }

    public boolean getProdutosImportados(){
        return produtosImportados;
    }

    public void setProdutosImportados(boolean produtosImportados){
        this.produtosImportados = produtosImportados;
    }

    public String toString(){
        return "Nome da Loja: " + getNome()
                + "\n Quantidade de Funcionarios: " + getQuantidadeFuncionarios()
                + "\n Salario Base dos Funcionarios: " + getSalarioBaseFuncionario()
                + "\n Endereço: " + getEndereco()
                + "\n Data de Fundação: " + getDataFundacao()
                + "\n Loja Venderá Produtos Importados: " + getProdutosImportados();
    }

}
