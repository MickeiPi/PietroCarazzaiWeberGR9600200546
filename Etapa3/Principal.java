import java.util.Scanner;

public class Principal{

public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    
    Endereco endereco;
    Data dataFundacao;
    Data dataValidade;
    Produto produto = null;
    Loja loja1 = null;
    int dia = 1;
    int mes = 1;
    int ano = 1;

    while (true) {
        System.out.println("(1) Criar uma loja");
        System.out.println("(2) Criar um produto");
        System.out.println("(3) Sair");
        System.out.println("O que Deseja: ");
        String scan = scanner.nextLine();
        
        if (scan.equals("1")) {
            
            // Criando a Loja
            System.out.println("Nome da loja: ");
            String nome = scanner.nextLine();

            System.out.println("Quantidade de funcionários: ");
            int quantidadeFuncionarios = scanner.nextInt();

            System.out.println("Salario base dos funcionários: ");
            double salarioBaseFuncionario = scanner.nextDouble();
            
            System.out.println("Informações do endereco da loja: ");
            
            System.out.println("Nome da Rua: ");
            String nomeDaRua = scanner.nextLine();

            System.out.println("Cidade: ");
            String cidade = scanner.nextLine();

            System.out.println("Estado: ");
            String estado = scanner.nextLine();

            System.out.println("Pais: ");
            String pais = scanner.nextLine();

            System.out.println("CEP: ");
            String cep = scanner.nextLine();

            System.out.println("Número: ");
            String numero = scanner.nextLine();

            System.out.println("Complemento: ");
            String complemento = scanner.nextLine();
            
            dataFundacao = new Data(dia, mes, ano);
            endereco = new Endereco(nomeDaRua, cidade, estado, pais, cep, numero, complemento);
            loja1 = new Loja(nome, quantidadeFuncionarios, salarioBaseFuncionario, endereco, dataFundacao);

            loja1.setNome(nomeDaRua);
            loja1.setQuantidadeFuncionarios(quantidadeFuncionarios);
            loja1.setSalarioBaseFuncionario(salarioBaseFuncionario);
            loja1.setEndereco(endereco);
            loja1.setDataFundacao(dataFundacao);

            } else if (scan.equals("2")){

                //Criando um Produto
                System.out.println("Nome do produto: ");
                String nome = scanner.nextLine();

                System.out.println("Preço do produto: ");
                double preco = scanner.nextDouble();

                System.out.println("Informe a data de validade do produto: ");
                
                System.out.println("Dia: ");
                dia = scanner.nextInt();

                System.out.println("Mês: ");
                mes = scanner.nextInt();

                System.out.println("Ano: ");
                ano = scanner.nextInt();

                dataValidade = new Data(dia, mes, ano);
                produto = new Produto(nome, preco, dataValidade);
                produto.setNome(nome);
                produto.setPreco(preco);
                produto.setDataValidade(dataValidade);

            } else if (scan.equals("3")){
                System.out.println("Você escolheu sair");
                break;
            } else {
                System.out.println("Opção inválida");
            }
        }
        
        scanner.close();
    }
}