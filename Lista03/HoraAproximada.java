public class HoraAproximada {
    int horas, minutos;

    public void inicializarHora( int h, int m ){

        if( validationHora( h , m ) ){
            horas = h;
            minutos = m;
        } else{
            h = 0;
            m = 0;
        }
    
    }

    private boolean  validationHora( int h, int m ){
        if( h >=0 && h <= 24 ){
            if( m >= 0 && m <= 60 ){
                return true;
            }
        } return false;
    }

    public void mostrarHora(){
        System.out.println("Horas = "+ horas +":"+ minutos );
    }
    
}
