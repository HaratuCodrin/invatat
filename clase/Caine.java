package clase;

public class Caine extends Animal {

    public Caine() {
        super();
    }

    public Caine(int size, String name) {
        super(size, name);
        areBlana = true;
    }

    @Override
    public void makeSounds() {
        System.out.println("Ham Ham Ham");
    }

    @Override
    public void move() {
        System.out.println("Da din codita.");
    }
    
}
