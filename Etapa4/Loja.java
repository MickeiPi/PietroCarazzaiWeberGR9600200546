public class Loja {

    //atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;
    private Endereco endereco;
    private Data dataFundacao;
    private int tamanho;
    private Produto estoqueProdutos[] = new Produto[tamanho];

    //construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario, Endereco endereco, Data dataFundacao, int tamanho){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.tamanho = tamanho;
    }

    public Loja(String nome, int quantidadeFuncionarios, Endereco endereco, Data dataFundacao, int tamanho){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.endereco = endereco;
        this.dataFundacao = dataFundacao;
        this.tamanho = tamanho;
    }

    //Getters e setters
    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public int getQuantidadeFuncionarios(){
        return quantidadeFuncionarios;
    }

    public void setQuantidadeFuncionarios(int quantidadeFuncionarios){
        this.quantidadeFuncionarios = quantidadeFuncionarios;
    }

    public double getSalarioBaseFuncionario(){
        if (salarioBaseFuncionario == 0) {
            return -1;
        } else {
            return salarioBaseFuncionario;
        }
    }

    public void setSalarioBaseFuncionario(double salarioBaseFuncionario){
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public Data getDataFundacao(){
        return dataFundacao;
    }

    public void setDataFundacao(Data dataFundacao){
        this.dataFundacao = dataFundacao;
    }

    public Produto[] getEstoqueProdutos(){
        return estoqueProdutos;
    }

    public void setEstoqueProdutos(Produto[] estoqueProdutos){
        this.estoqueProdutos = estoqueProdutos;
    }


    //metodos
    public String toString(){
        return "Nome da Loja: " + nome
                + "\n Quantidade de Funcionarios: " + quantidadeFuncionarios
                + "\n Salario Base dos Funcionarios: " + salarioBaseFuncionario
                + "\n Endereço: " + endereco
                + "\n Data de Fundação: " + dataFundacao
                + "\n Total de espaço no estoque: " + tamanho;
    }

    public double gastosComSalario(){
        if (salarioBaseFuncionario >= 0) {
            return salarioBaseFuncionario * quantidadeFuncionarios;
        } else {
            return -1;
        }
    }

    public char tamanhoDaLoja(){
        if (quantidadeFuncionarios < 10) {
            return 'P';
        } else if (quantidadeFuncionarios <= 30) {
            return 'M';
        } else {
            return 'G';
        }
    }

    public void imprimeProdutos(){
        System.out.println("Produtos Cadastrados: ");
        for(int i = 0; i < tamanho; i++){
            if (estoqueProdutos[i] != null) {
                System.out.println("Produto " + i + ": " + estoqueProdutos[i]);
            }
        }
    }

    public boolean insereProduto(Produto produto){
        for(int i = 0; i < tamanho; i++){
            if (estoqueProdutos[i] == null) {
                estoqueProdutos[i] = produto; 
                System.out.println("Produto adicionado: " + produto);
                return true;
            }
        }
        System.out.println("Sem espaço no estoqueProdutos para adição!");
        return false;
    }

    public boolean removeProduto(String produto){
        for(int i = 0; i < tamanho; i++){
            if (produto.equals(estoqueProdutos[i])) {
                System.out.println("Produto removido: " + estoqueProdutos[i]);
                estoqueProdutos[i] = null;
                return true;
            }
        }
        System.out.println("Sem estoqueProdutos deste produto para remoção!");
        return false;
    }
}
