package com.algorithm.chapter1.CatAndDog;

/**
 * @Author YongQiang
 * @Date 2020/1/22 16:13
 * @Version 1.0
 */
public class PetEnterQueue {
    private Pet pet;
    private Long count;

    public PetEnterQueue(Pet pet, Long count) {
        this.pet = pet;
        this.count = count;
    }

    public Pet getPet() {
        return pet;
    }

    public Long getCount() {
        return count;
    }

    public String getEnterPetType(){
        return this.pet.getPetType();
    }
}
