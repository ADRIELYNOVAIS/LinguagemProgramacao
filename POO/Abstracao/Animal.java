public abstract class Animal {
    private String name;
    private int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public abstract void makeSound(); // método abstrato que não possui implementação
    
    public void getInfo() {
        //O método getInfo() é uma operação que pode ser utilizada por todas as classes filhas para obter informações do animal.
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

