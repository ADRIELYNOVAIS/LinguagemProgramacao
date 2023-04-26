package Heranca;
public class Car extends Vehicle {
    //A classe Car é uma extensão da classe Vehicle e possui um atributo adicional numDoors e um método getInfo() que chama o método getInfo() da superclasse e exibe o número de portas do carro
    private int numDoors;
    
    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;
    }
    
    public void getInfo() {
        super.getInfo(); // chama o método getInfo() da superclasse
        System.out.println("Number of doors: " + numDoors);
    }
}