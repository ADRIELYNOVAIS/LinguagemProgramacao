public class Lampada {

    private String brand, model, type;
    private int power, voltage, price, durability;
    private boolean on;

    public Lampada(String brand, String model, String type, int power, int voltage, int price, int on, int durability) {

        this.brand = brand;
        this.model = model;
        this.type = type;
        this.power = power;
        this.voltage = voltage;
        this.price = price;
        this.on = false;
        this.durability = durability;

    }

    public void turnOn() {
        this.on = true;
    }

    public void turnOff() {
        this.on = false;
    }

    public boolean isOn() {
        return this.on;
    }

    public int getDurability() {
        return this.durability;
    }

    public void replace(int durability) {
        this.durability = durability;
    }

}
