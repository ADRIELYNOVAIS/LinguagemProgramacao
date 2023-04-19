public class LampadaTresEstados {

    private String brand, model, type;
    private int power, voltage, price, durability;
    private EstadoLampada estado;

    public LampadaTresEstados(String brand, String model, String type, int power, int voltage, int price, int durability) {
        this.brand = brand;
        this.model = model;
        this.type = type;
        this.power = power;
        this.voltage = voltage;
        this.price = price;
        this.estado = EstadoLampada.APAGADA;
        this.durability = durability;
    }

    public void ligar() {
        if (estado == EstadoLampada.APAGADA || estado == EstadoLampada.MEIA_LUZ) {
            estado = EstadoLampada.ACESA;
        }
    }

    public void desligar() {
        if (estado == EstadoLampada.ACESA || estado == EstadoLampada.MEIA_LUZ) {
            estado = EstadoLampada.APAGADA;
        }
    }

    public void meiaLuz() {
        if (estado == EstadoLampada.ACESA) {
            estado = EstadoLampada.MEIA_LUZ;
        }
    }

    public EstadoLampada getEstado() {
        return estado;
    }

    public int getDurabilidade() {
        return durability;
    }

    public void substituirDurabilidade(int novaDurabilidade) {
        durability = novaDurabilidade;
    }

    public int luminosidade( ){
        if( EstadoLampada.ACESA != null ){
            return 100;
        } return 0;
    }
}

enum EstadoLampada {
    APAGADA, ACESA, MEIA_LUZ;
}
