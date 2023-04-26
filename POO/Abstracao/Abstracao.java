
public class Abstracao {
    public static void main(String[] args) {
        
        //são criados objetos do tipo Cat e Dog que são armazenados em variáveis do tipo Animal
        Animal cat = new Cat("Fluffy", 3);
        Animal dog = new Dog("Buddy", 5);
        
        cat.getInfo();
        cat.makeSound();
        
        dog.getInfo();
        dog.makeSound();
    }
}