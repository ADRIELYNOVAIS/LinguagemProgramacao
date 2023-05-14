package Lista05;

public class Lampada {
    private String marca, modelo, tipo;
    private int potencia, voltagem,  durabilidade;
    private float preco;
    private boolean ligada;
    
    public Lampada(String marca, String modelo, String tipo, int potencia, int voltagem, float preco, int durabilidade) {
        // construtor , na instancia do  objeto, receberei todos esses paramentros
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
        this.potencia = potencia;
        this.voltagem = voltagem;
        this.preco = preco;
        this.ligada = false;
        this.durabilidade = durabilidade;
    
    }

    
    public void setMarca( String marca ){
        this.marca = marca;
    }

    public void getModelo( String modelo){
        this.modelo = modelo;
    }

    public void getTipo( String tipo ){
        this.tipo = tipo;
    }

    public void getPotencia( int potencia ){
        this.potencia = potencia;
    }

    public void getVoltagem( int voltagem ){
        this.voltagem = voltagem;
    }

    public void  getPreco( float preco ){
        this.preco = preco;
    }

    public void  getDurabilidade( int durabilidade ){
        this.durabilidade = durabilidade;
    }

    public void getLigada( boolean ligada){
        this.ligada = ligada;
    }

    public String getMarca(){
        return marca;
    }

    public String getModelo(){
        return modelo;
    }

    public String getTipo(){
        return tipo;
    }

    public int getPotencia(){
        return potencia;
    }

    public int getVoltagem(){
        return voltagem;
    }

    public float getPreco(){
        return preco;
    }

    public int getDurabilidade(){
        return durabilidade;
    }

    public boolean getLigada(){
        return ligada;
    }
    
    public void ligar() {
        this.ligada = true;
    }
    
    public void desligar() {
        this.ligada = false;
    }
    
    public boolean estaLigada() {
        return this.ligada;
    }
    
    public void substituir(int durabilidade) {
        this.durabilidade = durabilidade;
    }
}
