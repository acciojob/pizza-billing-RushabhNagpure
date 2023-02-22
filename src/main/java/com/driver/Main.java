package com.driver;

public class Main {
  public static void main(String[] args) {
    DeluxePizza dp = new DeluxePizza(true);
    System.out.println(dp.getPrice());
//    dp.addTakeaway();
    dp.addExtraCheese();
    dp.addExtraToppings();
    dp.addTakeaway();
    System.out.println(dp.getBill());

    //comment
    Pizza p = new Pizza(false);
    p.addExtraCheese();
    p.addExtraToppings();
//    p.addTakeaway();
    System.out.println(p.getBill());
  }
}