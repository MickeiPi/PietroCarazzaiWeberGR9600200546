public class Produto {
    
    private String nome;
    private double preco;
    private Data dataValidade;

    public Produto(String nome, double preco, Data dataValidade){
        this.nome = nome;
        this.preco = preco;
        this.dataValidade = dataValidade;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public double getPreco(){
        return preco;
    }

    public void setPreco(double preco){
        this.preco = preco;
    }

    public Data getDataValidade(){
        return dataValidade;
    }

    public void setDataValidade(Data dataValidade){
        this.dataValidade = dataValidade;
    }

    @Override
    public String toString(){
        return "Nome do Produto: " + nome
                + "\n Preço do Produto: " + String.format("%.2f", preco) + " R$"
                + "\n Data de Validade: " + dataValidade;
    }

    public /*static*/ boolean estaVencido(Data dataValidade){
        Data dataAtual = new Data();
        
        if (dataValidade.getAno() < dataAtual.getAno() || ((dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() < dataAtual.getMes()) || (dataValidade.getAno() == dataAtual.getAno() && dataValidade.getMes() == dataAtual.getMes() && dataValidade.getDia() < dataAtual.getDia()))) {
            return true;
        } else {
            return false;
        }
    }

}
