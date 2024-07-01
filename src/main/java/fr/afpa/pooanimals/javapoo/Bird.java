package fr.afpa.pooanimals.javapoo;

//Classe fille - classe mère : Animal
//Definision de l'attribut (pas besoin de redefinir les attributs de la classe mère)
public class Bird extends Animal {
    private int wingSpan;

    public Bird(String species, String ecosystem, int wingSpan) {
        super(species, ecosystem);

        this.wingSpan = wingSpan;

    }

    // Getter
    public int getWingSpan() {
        return wingSpan;
    }

    // Setter
    public void setWingSpan(int wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return  super.toString()
                + "\n Envergure " + getWingSpan()
                + '}';
    }
    @Override
    public void displayLocomotionType() {
System.err.println("Le mode de locomation est le vol");
        
    }

}
