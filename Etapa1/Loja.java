

public class Loja {

    //atributos
    private String nome;
    private int quantidadeFuncionarios;
    private double salarioBaseFuncionario;

    //construtores
    public Loja(String nome, int quantidadeFuncionarios, double salarioBaseFuncionario){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
        this.salarioBaseFuncionario = salarioBaseFuncionario;
    }

    public Loja(String nome, int quantidadeFuncionarios){
        this.nome = nome;
        this.quantidadeFuncionarios = quantidadeFuncionarios;
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

    //metodos
    @Override
    public String toString(){
        return "Nome da Loja: " + nome
                + "\n Quantidade de Funcionarios: " + quantidadeFuncionarios
                + "\n Salario Base dos Funcionarios: " + salarioBaseFuncionario;
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
        } else if (quantidadeFuncionarios <= 30 && quantidadeFuncionarios >= 10) {
            return 'M';
        } else {
            return 'G';
        }
    }
}
