package com.algorithm.chapter1.CatAndDog;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 猫狗队列
 * @Author YongQiang
 * @Date 2020/1/22 16:12
 * @Version 1.0
 */
public class CatAndDogQueue {
    private Queue<PetEnterQueue> dogQ;
    private Queue<PetEnterQueue> catQ;
    private long count;

    public CatAndDogQueue() {
        this.dogQ=new LinkedList<PetEnterQueue>();
        this.catQ=new LinkedList<PetEnterQueue>();
        this.count=0;
    }

    public void add(Pet pet){
        if (pet.getPetType().equals("dog")){
            this.dogQ.add(new PetEnterQueue(pet,this.count++));
        }
        else if (pet.getPetType().equals("cat")){
            this.catQ.add(new PetEnterQueue(pet,this.count++));
        }
        else {
            throw new RuntimeException("err,not dog or cat");
        }
    }

    public Pet PollAll(){
        if (!this.dogQ.isEmpty()&&!this.catQ.isEmpty()){
            if (this.dogQ.peek().getCount()<this.catQ.peek().getCount()){
                return this.dogQ.poll().getPet();
            }
            else {
                return this.catQ.poll().getPet();
            }
        }else if (!this.dogQ.isEmpty()){
            return this.dogQ.poll().getPet();
        }
        else if (!this.catQ.isEmpty()){
            return this.catQ.poll().getPet();
        }
        else {
            throw new RuntimeException("err,queue is empty");
        }
    }

    public Dog pollDog(){
        if (!this.isDogQueueEmpty()){
            return (Dog)this.dogQ.poll().getPet();
        }
        else {
            throw new RuntimeException("Dog queue is empty!");
        }
    }

    public Cat pollCat(){
        if (!this.isCatQueueEmpty()){
            return (Cat)this.catQ.poll().getPet();
        }
        else {
            throw new RuntimeException("Cat queue is empty!");
        }
    }

    public boolean isEmpty(){
        return this.dogQ.isEmpty()&&this.catQ.isEmpty();
    }

    public boolean isDogQueueEmpty(){
        return this.dogQ.isEmpty();
    }

    public boolean isCatQueueEmpty(){
        return this.catQ.isEmpty();
    }
}
