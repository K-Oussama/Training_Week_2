package com.piscine_oo.helloworld;

import com.piscine_oo.helloworld.beverages.*;



public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World !");

       // Coffee
        Beverage coffee = new Coffee();
        BeverageWithMilk coffeeWithMilk = new BeverageWithMilk(coffee);
        System.out.println(coffee.getDescription() + " costs " + coffee.getBasePrice());

        double coffeeWithMilkPrice = coffee.getBasePrice() + ((Supplement) coffeeWithMilk).getSupplementPrice();
        System.out.println("Coffee with Milk price: " + coffeeWithMilkPrice);



        // Create a Tea with Cinnamon and Milk
        Beverage tea = new Tea();
        BeverageWithCinnamon teaWithCinnamon = new BeverageWithCinnamon(tea);
        System.out.println(tea.getDescription() + " costs " + tea.getBasePrice());

        double teaWithCinnamonAndMilkPrice = tea.getBasePrice() + ((Supplement) teaWithCinnamon).getSupplementPrice();
        System.out.println("Tea with Cinnamon : " + teaWithCinnamonAndMilkPrice);



    }
}
