package Lista05;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Data {
    private int dia, mes, ano;

    public Data( int dia, int mes, int ano ){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public boolean isDataValida() {
        //verifica se a data é válida
        if (ano < 0 || mes < 1 || mes > 12 || dia < 1 || dia > getNumeroDiasNoMes()) {
            return false;
        }

        return true;
    }

    private int getNumeroDiasNoMes() {
        int[] diasNoMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        if (mes == 2 && isAnoBissexto()) {
            return 29; 
        }

        return diasNoMes[mes - 1]; //subtrai 1 do indice do mes para obter o numero correto de dias
    }

    private boolean isAnoBissexto() {
        return (ano % 4 == 0 && ano % 100 != 0) || (ano % 400 == 0);
    }


    public boolean isPrevious(Data outraData){
        //verifica se uma data é anterior a outra
        if( this.ano < outraData.ano ){
            return true;
        }  if ( this.mes < outraData.mes ){
            return true;
        }  if ( this.dia < outraData.dia ){
            return true;
        } else{
            return false;
        }
        
    }

    public static String dayOfWeek(int dia, int mes, int ano) {
        Calendar calendar = Calendar.getInstance();
        calendar.set(ano, mes - 1, dia); // O mês em Calendar começa em 0 (janeiro = 0)
        // precisa receber como parametro, pois essa função é externa a classe e não pode modificar acessar os atributos da classe

        Date data = calendar.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("EEEE");
        return sdf.format(data);
    }

}
