public class Data {
    
private int dia, mes, ano;

public void inicializarData( int d, int m, int a ){
    // nao precisa do this,  pois o nome dos parametros não ocultam o nome das variavies
    if( validationDate(d, m, a)) {
    dia = d;
    mes = m;
    ano = a;
} else{
    dia = 0;
    mes = 0;
    ano = 0;
}

}

private boolean validationDate( int d, int m, int a ){
    if( d > 1 && d < 31 ){
        if( m > 1 && m <= 12 ){
            return true;
        }
    } return false;
}

public void mostrarData(){
    System.out.println("Data: "+ dia +"/"+ mes +"/"+ ano);
}

}

