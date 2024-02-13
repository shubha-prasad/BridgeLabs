package com;

class Flower{
    void lily(){
        System.out.println("is a flower");
    }
    void rose()
    {
        System.out.println("is also a flower");
    }
    class Fruit extends Flower{
       void apple()
       {
           System.out.println("is a fruit");
       }
    }
    public class SingleLevelinheritance
    {
        Flower flower = new Flower();
        flower.lily();
        flower.rose();

        fruit fruit = new Fruit();
        fruit.lily();
        fruit.rose();
        fruit.apple();
    }


        }

