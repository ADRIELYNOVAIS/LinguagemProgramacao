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
