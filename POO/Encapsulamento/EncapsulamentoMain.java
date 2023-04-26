package Encapsulamento;

public class EncapsulamentoMain {
    public static void main(String[] args) {
        Lamp lamp = new Lamp();
        
        lamp.turnOn();
        lamp.setBrightness(50);
        
        //System.out.println("Lamp is on: " + lamp.isOn());
        System.out.println("Brightness: " + lamp.getBrightness());
    }
}