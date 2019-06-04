package com.zipcodewilmington.assessment1.part3;

import java.util.ArrayList;

/**
 * Created by leon on 2/16/18.
 */
public class PetOwner {
    String name;
    ArrayList<Pet> petList;

    /**
     * @param name name of the owner of the Pet
     * @param pets array of Pet object
     */
    public PetOwner(String name, Pet... pets) {
        this.name = name;
        petList = new ArrayList<Pet>(0);
        if (pets != null) {
            for (Pet each : pets) {
                addPet(each);
            }
        }
  }

    /**
     * @param pet pet to be added to the composite collection of Pets
     */
    public void addPet(Pet pet) {
        petList.add(pet);
        pet.setOwner(this);
    }

    /**
     * @param pet pet to be removed from the composite collection Pets
     */
    public void removePet(Pet pet) {
        if (petList.contains(pet)) {
            if (petList.size()==1){
            petList.set(0, null);
            }
            else {
            petList.remove(pet);}
        }
    }

    /**
     * @param pet pet to evaluate ownership of
     * @return true if I own this pet
     */
    public Boolean isOwnerOf(Pet pet) {
        return (petList.contains(pet));
    }

    /**
     * @return the age of the Pet object whose age field is the lowest amongst all Pets in this class
     */
    public Integer getYoungetPetAge() {
       Pet temp = petList.get(0);

        for (Pet each : petList){
            System.out.println(temp.getAge());
            if (each.getAge() < temp.getAge()){
                temp = each;
            }
        }

        return temp.getAge();
    }

    /**
     * @return the age of the Pet object whose age field is the highest amongst all Pets in this class
     */
    public Integer getOldestPetAge() {
        Pet temp = petList.get(0);
        for (Pet each : petList){
            if (each.getAge() > temp.getAge()){
                temp = each;
            }
        }
        return temp.getAge();
    }


    /**
     * @return the sum of ages of Pet objects stored in this class divided by the number of Pet object
     */
    public Float getAveragePetAge() {
        int sum = 0;
        for (Pet each : petList){
            sum += each.getAge();
            }
        return (float)(sum / petList.size());
    }

    /**
     * @return the number of Pet objects stored in this class
     */
    public Integer getNumberOfPets() {
         return petList.size();
    }

    /**
     * @return the name property of the Pet
     */
    public String getName() {
        return name;
    }

    /**
     * @return array representation of animals owned by this PetOwner
     */
    public Pet[] getPets() {
        Pet[] result = new Pet[this.petList.size()];
        result = petList.toArray(result);
        return result;
    }
}
