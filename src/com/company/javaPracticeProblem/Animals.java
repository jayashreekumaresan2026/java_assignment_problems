package com.company.javaPracticeProblem;

class Animal {
    int size;
    String breed;
    String name;
    Animal(){
        System.out.println("hello i am parent constructor");
    }
    void get_details(int size ,String breed,String name){
        this.size=size;
        this.breed=breed;
        this.name=name;
    }

    void show_details() {
        System.out.println(size);
        System.out.println(breed);
        System.out.println(name);

    }
}

class Dog extends Animal{
    private String action;
    Dog(){
        System.out.println("hello i am child constructor");
    }
    void get_details(int size ,String breed,String name,String action)
    {
        this.size=size;
        this.breed=breed;
        this.name=name;
        this.action=action;
    }

    @Override
    void show_details() {
        super.show_details();
        System.out.println(size);
        System.out.println(breed);
        System.out.println(name);
        System.out.println(action);

    }
    void setAction(String action) {
        this.action = action;

    }
    String getAction(){
        return action;

    }
}

public class Animals {
    public static void main(String[] args) {

        Dog obj = new Dog();
        obj.size = 10;
        obj.breed="national";
        obj.name="huch";
        obj.setAction("bark");
//        obj.get_details();
//        obj.get_details(10,"national","huch","bark");
        obj.show_details();
    }

}

