public class Cat extends Animal {
    //As classes concretas Cat e Dog herdam da classe Animal e implementam o método abstrato makeSound() com comportamentos específicos para cada tipo de animal.
    public Cat(String name, int age) {
        super(name, age);
    }
    
    public void makeSound() {
        System.out.println("Meow!");
    }
}
