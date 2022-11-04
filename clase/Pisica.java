package clase;

public class Pisica extends Animal {

    public Pisica() {
        super();
    }

    public Pisica(int size, String name) {
        super(size, name);
        // super inseamna ca apeleaza constructorul clasa parinte
        areBlana = true;

    }

    @Override
    public void makeSounds() {
       System.out.println("Miau Miau");
    }

    @Override
    public void move() {
        System.out.println("Merge elegant.");
    }
    
}
