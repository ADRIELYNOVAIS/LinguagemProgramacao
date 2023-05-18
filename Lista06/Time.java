package Lista06;

public class Time {
    private int hora, minuto, segundo;

    public Time(){

        this.hora = 0 ;
        this.minuto = 0;
        this.segundo = 0;
    }

    public Time( int hora ){
        if( validateHora( hora )){

            this.hora = hora;
            this.minuto = 0;
            this.segundo = 0;

        } else{
            this.hora = 0 ;
            this.minuto = 0;
            this.segundo = 0;
        }
    }

    public Time( int hora, int minuto ){
        if( validateHora( hora ) && validateMinuto(minuto)){

            this.hora = hora;
            this.minuto = minuto;
            segundo = 0;

        } else{
            this.hora = 0 ;
            this.minuto = 0;
            segundo = 0;
        }
    }


    public Time( int hora, int minuto, int segundo ){

        if( validateTime( hora, minuto,  segundo )){

            this.hora = hora;
            this.minuto = minuto;
            this.segundo = segundo;

        } else{
            this.hora = 0 ;
            this.minuto = 0;
            this.segundo = 0;
        }
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

        if ( validateHora(hora)) {
            if (validateMinuto(minuto)) {
                if(validateSegundo(segundo)){
                    return true;
                }
            }
        } return false;
    }

    private boolean validateSegundo( int segundo ){
        if ( segundo >= 0 && segundo < 60) {
            return true;
        }return false;
    }

    private boolean validateMinuto( int minuto ){
        if( minuto >= 0 && minuto < 60){
            return true;
        } return false;
    }

    private boolean validateHora( int hora ){
        if ( hora >= 0 && hora < 24) {
            return true;
        } return false;
    }

    public void addSegonds(int segs) {

        if (validateSegundo(segs) ) {
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

        if (validateSegundo(segs) && validateMinuto(min)) {
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
