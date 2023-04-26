public class Data {
    
private int dia, mes, ano;

    public Data( int dia, int mes, int ano ){
       if( validationDia(dia) && validationMes(mes) && validationAno( ano )){
            this.dia = dia;
            this.mes = mes;
            this.ano = ano;
        }
    
    }

    public void setDia( int dia ) {

        if( validationDia( dia )) {
        this.dia = dia;
    }
    }

    public int getDia(){
        return dia;
    }

    public void setMes( int mes ){
        if( validationMes( mes )){
        this.mes = mes;
    }
    }

    public int getMes(){
        return mes;
    }

    public void setAno( int ano ){
        if(validationAno( ano )){
        this.ano = ano ;
    }
    }

    public int getAno(){
        return ano;
    }

    private boolean validationDia( int dia ){

        if( dia > 0 && dia < 31 ){
            return true;
        } return false;
    }

    private boolean validationMes( int mes ){

        if( mes > 0 && mes <=12 ){
            return true;
        } return false;
    }

    private boolean validationAno( int ano ){

        if( ano > 0  ){
            return true;
        } return false;
    }

    public void mostrarData(){
        System.out.println("Data: "+ dia +"/"+ mes +"/"+ ano);
    }

    public void imprirDataPorExtenso( int dia, int mes , int ano){
        switch ( mes ) {
            case 1:
                System.out.println("Data: "+ dia +" de "+ " Janeiro " +" de "+ ano);
                break;
            case 2:
                System.out.println("Data: "+ dia +" de "+ " Fevereiro " +" de "+ ano);
                break;
            case 3:
                System.out.println("Data: "+ dia +" de "+ " Março " +" de "+ ano);
                break;
            case 4:
                System.out.println("Data: "+ dia +" de "+ " Abril " +" de "+ ano);
                break;    
            case 5:
                System.out.println("Data: "+ dia +" de "+ " Maio " +" de "+ ano);
                break;
            case 6:
                System.out.println("Data: "+ dia +" de "+ " Junho " +" de "+ ano);
                break;
            case 7:
                System.out.println("Data: "+ dia +" de "+ " Julho " +" de "+ ano);
                break;
            case 8:
                System.out.println("Data: "+ dia +" de "+ " Agosto " +" de "+ ano);
                break;
            case 9:
                System.out.println("Data: "+ dia +" de "+ " Setembro " +" de "+ ano);
                break;
            case 10:
                System.out.println("Data: "+ dia +" de "+ " Outubro " +" de "+ ano);
                break;
            case 11:
                System.out.println("Data: "+ dia +" de "+ " Novembro " +" de "+ ano);
                break;
            case 12:
                System.out.println("Data: "+ dia +" de "+ " Dezembro " +" de "+ ano);
                break;
            default:
                 System.out.println("Mes inválido");
    }
}

}

