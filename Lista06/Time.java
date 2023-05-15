package Lista06;

public class Time {
    private int hora, minuto, segundo;

    public Time(){

        this.hora = 0 ;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Time( int hora ){
        this.hora = hora;
        this.minuto = 0;
        this.segundo =0;
    }

    public Time( int hora, int minuto ){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = 0;
    }


    public Time( int hora, int minuto, int segundo ){
        this.hora = hora;
        this.minuto = minuto;
        this.segundo = segundo;
    }

    public Time( Time objeto ){

       if( validateTime( hora, minuto,  segundo )){

            this.hora = objeto.hora;
            this.minuto = objeto.minuto;
            this.segundo = objeto.segundo;

        } else{
            this.hora = 0 ;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    private boolean validateTime( int hora, int minuto, int segundo ){
        // Validar os valores passados

        if ( hora >= 0 && hora < 24) {
            if ( minuto >= 0 && minuto < 60) {
                if ( segundo >= 0 && segundo < 60) {
                    return true;
                }
            }
        } 
    }

    public void addSegonds(int segs) {

        if (segs > 0 && segs < 60 ) {
            //validar segundo
            int totalSegundos = hora * 3600 + minuto * 60 + segs ;
    
            if( totalSegundos < 86400 ){
            hora = totalSegundos / 3600;
            minuto = (totalSegundos % 3600) / 60;
            segundo = (totalSegundos % 3600) % 60;

           } else{
             totalSegundos -= 86400;
             hora = totalSegundos / 3600;
             minuto = (totalSegundos % 3600) / 60;
             segundo = (totalSegundos % 3600) % 60;
           }
        }
    }

    public void addSegonds(int segs, int min) {

        if ((segs > 0 && segs < 60 ) && (min > 0 && min < 60 )) {
            //validar segundo
            int totalSegundos = hora * 3600 + min * 60 + segs ;
    
            if( totalSegundos < 86400 ){
            hora = totalSegundos / 3600;
            minuto = (totalSegundos % 3600) / 60;
            segundo = (totalSegundos % 3600) % 60;

           } else{
             totalSegundos -= 86400;
             hora = totalSegundos / 3600;
             minuto = (totalSegundos % 3600) / 60;
             segundo = (totalSegundos % 3600) % 60;
           }
        }
    }

    public void addSegonds(int hrs, int min ,int segs) {

        if (validateTime( hrs, min, segs)) {
            //validar segundo
            int totalSegundos = hrs * 3600 + min * 60 + segs ;
    
            if( totalSegundos < 86400 ){
            hora = totalSegundos / 3600;
            minuto = (totalSegundos % 3600) / 60;
            segundo = (totalSegundos % 3600) % 60;

           } else{
             totalSegundos -= 86400;
             hora = totalSegundos / 3600;
             minuto = (totalSegundos % 3600) / 60;
             segundo = (totalSegundos % 3600) % 60;
           }
        }
    }

    public void addSegonds( Time objeto ) {

            int totalSegundos = objeto.hora * 3600 + objeto.minuto * 60 + objeto.segundo;
    
            if( totalSegundos < 86400 ){
            hora = totalSegundos / 3600;
            minuto = (totalSegundos % 3600) / 60;
            segundo = (totalSegundos % 3600) % 60;

           } else{
             totalSegundos -= 86400;
             hora = totalSegundos / 3600;
             minuto = (totalSegundos % 3600) / 60;
             segundo = (totalSegundos % 3600) % 60;
           }
        
    }
    

    public void prnTime(){
        System.out.println( hora+ ":" + minuto + ":" + segundo );
    }
    
}