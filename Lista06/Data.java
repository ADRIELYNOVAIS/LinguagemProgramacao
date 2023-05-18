package Lista06;

public class Data {
    private int dia, mes, ano;

    public Data( int dia, int mes, int ano ){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public Data(){
        dia = 1;
        mes = 1;
        ano = 1970;
    }

    public Data( Data objetoData ){
        dia = objetoData.dia;
        mes = objetoData.mes;
        ano = objetoData.ano;
    }

    public int quantosDias(int dia, int mes, int ano) {
        Data outraData = new Data(dia, mes, ano);
        int diferencaAnos = outraData.ano - this.ano;
        int diferencaMeses = outraData.mes - this.mes;
        int diferencaDias = outraData.dia - this.dia;
    
        return (diferencaAnos * 365) + (diferencaMeses * 30) + diferencaDias;
    }

    
}
