public class Shopping {
    
    private String nome;
    private Endereco endereco;
    private int quantidadeLoja;
    private Loja loja[];

    public Shopping(String nome, Endereco endereco, int quantidadeLoja){
        this.nome = nome;
        this.endereco = endereco;
        this.quantidadeLoja = quantidadeLoja;
        Loja loja[] = new Loja[quantidadeLoja];
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public Endereco getEndereco(){
        return endereco;
    }

    public void setEndereco(Endereco endereco){
        this.endereco = endereco;
    }

    public int getQuantidadeLoja(){
        return quantidadeLoja;
    }

    public void setQuantidadeFuncionarios(int quantidadeLoja){
        this.quantidadeLoja = quantidadeLoja;
    }

    public Loja[] getLojas(){
        return loja;
    }

    public void setLojas(Loja[] loja){
        this.loja = loja;
    }

    public String toString(){
        return "Nome da Loja: " + nome
                + "\n Localização da Loja: " + endereco
                + "\n Total de espaço para Loja: " + quantidadeLoja
                + "\n Total de espaço utilizado: "  + loja;
    }

    public boolean insereLoja(Loja lojaAdd){
        for(int i = 0; i < quantidadeLoja; i++){
            if (loja[i] == null) {
                loja[i] = lojaAdd;
                System.out.println("Loja adicionanda: " + lojaAdd);
                return true;
            }
        }
        System.out.println("Sem espaço para adição de mais lojas!");
        return false;
    }

    public boolean removeLoja(String lojaRemove){
        for(int i = 0; i < quantidadeLoja; i++){
            if (lojaRemove.equals(loja[i])) {
                System.out.println("Loja removida: " + loja[i]);
                loja[i] = null;
                return true;
            }
        }
        System.out.println("Loja inexistente para remoção!");
        return false;
    }

    public int quantidadeLojasPorTipo(String tipoLoja){
        for(int i = 0; i < quantidadeLoja; i++){
            if (tipoLoja == "Bijuteria") {
                System.out.println("Quantidade loja de bijuteria: " + i);
                return i;
            }
        }
        System.out.println("Tipo de loja inexistente!");
        return -1;
    }

    public String lojaSeguroMaisCaro(){
        for(int i = 0; i < quantidadeLoja; i++){
            if (loja[i] != null) {
                
            }
        }
    }

}
