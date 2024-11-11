package tn.esprit.gestionzoo.entities;

public class Terrestrial extends Animal implements Omnivore<Food> {
    protected int nbrLegs;
    public Terrestrial() {

    }
    public Terrestrial(String family, String name, int age, boolean isMammal ,int nbrLegs) {
        super(family,name,age,isMammal);;
        this.nbrLegs = nbrLegs;
    }
    public int getNbrLegs() {
        return nbrLegs;
    }

    @Override
    public String toString() {
        return "Terrestrial{" +
                super.toString() +
                "nbrLegs=" + nbrLegs +
                '}';
    }

    @Override
    public void eatPlantAndMeat(Food food) {
        System.out.println("This animal eats meat");
    }


    @Override
    public void eatMeat(Object meat) {
        System.out.println("This animal eats meat");
    }

    @Override
    public void eatPlant(Object plant) {
        System.out.println("This animal eats plant");
    }
}
