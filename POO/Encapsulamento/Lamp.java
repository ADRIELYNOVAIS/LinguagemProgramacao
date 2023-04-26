package Encapsulamento;

public class Lamp {
    private boolean on;
    private int brightness;
    
    public Lamp() {
        on = false;
        brightness = 0;
    }
    
    public void turnOn() {
        on = true;
    }
    
    public void turnOff() {
        on = false;
    }
    
    public void setBrightness(int brightness) {
        this.brightness = brightness;
    }
    
    public int getBrightness() {
        return brightness;
    }
}


