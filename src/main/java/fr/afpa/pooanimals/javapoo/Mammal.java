package fr.afpa.pooanimals.javapoo;

//Classe fille - classe mère : Animal
//Definision de l'attribut (pas besoin de redefinir les attributs de la classe mère)
public class Mammal extends Animal {
    private String furColor;

    // Constructeur heritier de la classe mère
    public Mammal(String species, String ecosystem, String furColor) {
        super( species, ecosystem);

        this.furColor = furColor;
    
        
    }
    //Getter
    public String getFurColor() {
        return furColor;
    }
    //Setter
    public void setFurColor(String furColor) {
        this.furColor= furColor;
    }

    @Override
    public String toString() {
        return super.toString()
                + "\nCouleur de la fourrure " + getFurColor()
                + '}';
    }
    @Override
    public void displayLocomotionType() {
        System.out.println("Le mode de locomotion est la marche ou la course");
        
    }


}
