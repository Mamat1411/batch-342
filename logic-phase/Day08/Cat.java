package Day08;

public class Cat extends Animal{
    @Override
    public void animalSound(){
        System.out.println("Meow Meow");
    }

    @Override
    public void animalSound(String sound){
        System.out.println("Sound " + sound);
    }
}
