package Day08;

public class Animal {
    protected String feet;
    protected String sound;

    public void animalSound(){
        System.out.println("This is an animal sound");
    }

    public void animalSound(String sound){
        System.out.println(sound);
    }
}
