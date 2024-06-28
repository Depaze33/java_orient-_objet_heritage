package fr.afpa.pooanimals.javapoo;

abstract public class Animal {
    // declaration des attributs
    public String species;
    public  String ecosystem;

    // Declaration du constructeur
    public Animal(String species, String ecosystem) {
        this.species = species;
        this.ecosystem = ecosystem;
    }

    public String getSpecies() {
        return species;
    }

    public String getEcosystem() {
        return ecosystem;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public void setEcosystem(String ecosystem) {
        this.ecosystem = ecosystem;
    }

    @Override
        public String toString() {
            return "Animal { "
                    + "\n Espèce" + getSpecies()
                    + "\n Lieu de vie " + getEcosystem()
                    + '}';
        }

}
