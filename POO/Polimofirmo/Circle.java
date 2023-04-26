package Polimofirmo;

public class Circle implements Shape {
    //A classe Circle possui um construtor que recebe um raio e implementa o método getArea() para calcular a área do círculo.
    private double radius;
    
    public Circle(double radius) {
        this.radius = radius;
    }
    
    public double getArea() {
        return Math.PI * radius * radius;
    }
}