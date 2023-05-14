package Lista05;

public class Time {
    private int valor;
    
    public Time( int valor ) {

        if(validateTime(valor)){
            this.valor = valor;
        }else{
            this.valor = 0;
        }
        
    }
    
    private boolean validateTime(int timevalor){
        return ((timevalor>=0) && (timevalor<86401));
        //SegundosEmUmDia = 24*60*60 = 86400 
    }

    private int TimeTosegonds(int hora, int min, int seg){
        //converte tudo em segundos
        return hora*3600 + min*60 + seg;
    }

    public boolean isAm(int hora, int min, int seg){
        int valor = this.TimeTosegonds(hora, min, seg);

        if( validateTime(valor)){
            if(valor < (86400/2)){
                //verifica se a hora é anterior a 12horas
                return true;
            }else{
                return false;
            }
        } else{
            this.valor = 0;
            return false;
        }
        
    }


    public int cron(Time outraHora){
       /* retorna a quantidade de segundos transcorridos desde a hora
        enviada como parâmetro, se o parâmetros outraHora for anterior ao tempo do objeto
        considerar que o parâmetro se refere ao dia seguinte */
        if( outraHora.valor < this.valor){
           this.valor += 86400;
        } 
            return outraHora.valor - this.valor;
            
    }

    public void addSegonds(int segs){
        if(segs > 0)    {
            if( valor > 86401){
                // se for um novo dia, o valor que representa um dia é reiniciado
                valor = 0;
                valor +=segs;
            }else{
                valor +=segs;
            }
        }else{
            segs = 0;
            valor +=segs;
        }
    }

    private String SecondsToTime(){
        //pega os segundos que representa o dia e transforma em hora/minutos e segundo para representar uma hora
        String result = "";
        int hora;
        int min;
        int sec;

        hora = valor/3600;
        min = (valor % 3600)/60;
        sec = (valor % 3600)%60;

        result = Integer.toString(hora) + ":"
               + Integer.toString(min) + ":"
               + Integer.toString(sec);

        return result;
    }

    public void prnTime(){
        System.out.println(SecondsToTime());
    }

}
