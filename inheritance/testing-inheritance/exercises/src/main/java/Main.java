package main.java;
//added by Tiff
public class Main {
    public static void main (String[] args) {
    HouseCat meow = new HouseCat("Sam", 12.5);

// Cat can not be instantiated because abstract
//    Cat ralph = new Cat(12);


    meow.eat();
    System.out.println(meow.isTired());
    System.out.println(meow);
    }
}
