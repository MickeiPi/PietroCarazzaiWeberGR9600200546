

public class Data {
    
    private int dia, mes, ano;

    public Data(int dia, int mes, int ano){
        if (mes >= 1 && mes >= 12 && dia > 0) {
            if (mes == 2 && verificaAnoBissexto()) {
                System.out.println("Data Válida");
            } else if(mes == 2){
                System.out.println("Data Válida");
            } else if(mes == 4 || mes == 6 || mes == 9 || mes == 11){
                System.out.println("Data Válida");
            } else {
                System.out.println("Data Válida");
            }
            
        } else{
            System.out.println("eRRO: Data Inválida");
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
      
    }

    public int getDia(){
        return dia;
    }

    public void setDia(int dia){
        this.dia = dia;
    }
    
    public int getMes(){
        return mes;
    }

    public void setMes(int mes){
        this.mes = mes;
    }

    public int getAno(){
        return ano;
    }

    public void setAno(int ano){
        this.ano = ano;
    }

    @Override
    public String toString(){
        return "Data: " + getDia() + "/" + getMes() + "/" + getAno();
    }

    public boolean verificaAnoBissexto(){
        if ((ano % 4 == 0 && ano % 100 != 0) || ano % 400 == 0) {
            return true;
        }else{
            return false;
        }
    }
}
