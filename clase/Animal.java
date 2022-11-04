package clase;

public abstract class Animal {
    // private, public, protected
    // atribute 
    protected int size;
    protected String name;
    public boolean areBlana;

     
    // constructor default (asta se face automat daca nu creem unul noi singuri)
    public Animal() {
        
    }

    //constructor facut de noi
    public Animal(int size, String name) {
        this.size = size;
        this.name = name;
    }
    
    public abstract void makeSounds();
    public abstract void move();

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

}
