public class ContaBancariaSimplificada {

    private String nameCorrentista;
    private double salary;
    private boolean isSpecial; 

    public void abreConta( String name, double salary, boolean isSpecial ){
        this.nameCorrentista = name;
        this.salary = salary;
        this.isSpecial = isSpecial;
    }

    public void contaSimples( String name ){
        this.nameCorrentista = name;
    }

    public void deposita( double salary ){
        this.salary = salary;
    }

    public void retira( int salary ) {
        this.salary = salary;
    }

    public String mostraDados(){
        String text;
        text = "Name:"+ nameCorrentista +"\nSalario:" + salary + "É especial:" + isSpecial;
        return text;
    }


}
