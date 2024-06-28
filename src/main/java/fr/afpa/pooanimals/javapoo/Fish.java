package fr.afpa.pooanimals.javapoo;

public class Fish extends Animal {
    private String preffereWaterDepth;

    public Fish(String species, String ecosystem, String preffereWaterDepth) {
        super(species, ecosystem);

        this.preffereWaterDepth = preffereWaterDepth;

    }

    // Getter
    public String getPreffereWaterDepth() {
        return preffereWaterDepth;
    }

    // Setter
    public void setPreffereWaterDepth(String preffereWaterDepth) {
        this.preffereWaterDepth = preffereWaterDepth;
    }

    @Override
    public String toString() {
        return "Animal { "
                + super.toString()
                + "\n Eau préferé" + getPreffereWaterDepth()
                + '}';
    }

}