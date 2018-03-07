package part_03;

import java.text.DecimalFormat;

/**
  Write 3 classes. These classes can reside in the same file for ease and clarity.
  The first class (the controller) should have at least two methods, one of which being a main method.
  The main method needs to utilize constructors to create at least two separate objects. Each class must
  have at least 3 variables all 3 variables in each class must be used and set. Think about the Vehicle
  objects we have discussed in class. A vehicle has a make, model, MPG, 2/4 doors, color etc. Do not use a
  Vehicle object in this exercise :)

  Be creative. Have some fun. Using Java objects you can model just about anything you want. Cars, animals, poker games,
  sports teams, trees, beers, people and so on.

 **/


class BookStore {
    public static void main(String[] args) {
        Books toKill = new Books("To Kill a Mockingbird", 2, 19.99 );
        Magazines vogue = new Magazines("Vogue", 1, 5.99);

        double total = subtotal(toKill.quantity, toKill.price) + subtotal(vogue.quantity, vogue.price);
        System.out.println("Your total cost is $" + df2.format(total));
    }

    private static DecimalFormat df2 = new DecimalFormat(".##");

    private static double subtotal(int quantity, double price){
        double tax = 1.05;
        double subtotal = quantity * price * tax;
        return subtotal;
    }
}

class Books {
    String title;
    int quantity;
    double price;

    public Books(String title, int quantity, double price) {
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }
}

class Magazines {
    String title;
    int quantity;
    double price;

    public Magazines(String title, int quantity, double price) {
        this.title = title;
        this.quantity = quantity;
        this.price = price;
    }
}