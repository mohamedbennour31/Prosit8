package tn.esprit.gestionzoo.entities;

public interface Omnivore<T> extends Carnivore,Herbivore
{
    void eatPlantAndMeat(T food);
}
