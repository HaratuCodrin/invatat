import clase.*;

class ClasaDeBaza {

    public static void main(String[] args) {
        
        Animal[] animale = new Animal[2];
        
        animale[0] = new Caine(21, "Patrocle");
        animale[1] = new Pisica(15, "Felicia");

        // animale[0].setName("Patrocle");
        // animale[1].setName("Felicia");

         for(Animal animal : animale) {
             System.out.println(animal.areBlana);
         }
        
            
    }

}