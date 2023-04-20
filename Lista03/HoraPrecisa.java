public class HoraPrecisa extends HoraAproximada {
    // HoraAproximada horas = new HoraAproximada(); --ver como pode ficar isso
    private int segundos, centesimosSegundos;

    public void inicializarHoraPrecisa( int minutos, int horas, int segundos, int centesimosSegundos ){
       if( validationHoraPrecisa( segundos, centesimosSegundos )){
        this.segundos = segundos;
        this.centesimosSegundos = centesimosSegundos;
        this.minutos = minutos;
        this.horas = horas; 
    } else{
        this.segundos = 0;
        this.centesimosSegundos = 0;
        this.minutos = 0;
        this.horas = 0;
    }
    }

    private boolean validationHoraPrecisa( int segundos, int centesimosSegundos ){
        if( segundos >= 0 && segundos <= 60){
            if(centesimosSegundos >= 0 && centesimosSegundos <= 60){
                return true;
            }
        } return false;
    }

    public void mostrarHora(){
        System.out.println("Horas = "+ horas +":"+ minutos+":"+segundos+":"+centesimosSegundos );
    }
}
