public class ContaBancariaSimplificada {

    private String nameCorrentista;
    private double salary;
    private boolean isSpecial; 

    public void abreConta( String name, double salary, boolean isSpecial ){
        //usa os argumentos passados para inicializar os dados
        this.nameCorrentista = name;
        this.salary = salary;
        this.isSpecial = isSpecial;
    }

    public void contaSimples( String name ){
        // caso fosse name = name iria gerar um ocultamento, por isso usamos o referenciamento this
        this.nameCorrentista = name;
        salary = 0.0;
        isSpecial = false;    
    }

    public void deposita( double value ){
        
        if( validation( value ) ){
           salary += value;
        } value = 0;
    }

    private boolean validation( double value ){
        if( value < 0 ){
            return true;
        } return false;
    }

    public void retira( int value ) {
        //metodo set, recebe um valor e modifica ele, sem retorno
        //não usamos o metedo set para campos de id, por questao de segurança
        if( isSpecial == false ){
            if( value <= salary ){
                salary= salary - value;
            }
        } salary = salary - value;
    }

    public void mostraDados(){    
      System.out.println( "Name:"+ nameCorrentista +"\nSalario:" + salary + "É especial:" + isSpecial);   
    }


}
