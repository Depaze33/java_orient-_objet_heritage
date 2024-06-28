package fr.afpa.pooanimals.javapoo;

//Classe fille - classe mère : Animal
//Definision de l'attribut (pas besoin de redefinir les attributs de la classe mère)
public class Bird extends Animal {
    private String wingSpan;

    public Bird(String species, String ecosystem, String wingSpan) {
        super(species, ecosystem);

        this.wingSpan = wingSpan;

    }

    // Getter
    public String getWingSpan() {
        return wingSpan;
    }

    // Setter
    public void setWingSpan(String wingSpan) {
        this.wingSpan = wingSpan;
    }

    @Override
    public String toString() {
        return "Animal { "
                + super.toString()
                + "\n Envergure" + getWingSpan()
                + '}';
    }

}
