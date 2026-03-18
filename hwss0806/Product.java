package hwss0806;

import java.util.Scanner;

public class Product {
    private int id;
    private String name;
    private double price;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
    public static int AUTO_ID = 1;
    public final String WAREHOUSE_CODE = "KHO-01";
    public Product() {
        this.id = AUTO_ID;
        AUTO_ID++;
    }
    public Product(String name, double price) {
        this();
        this.name = name;
        this.price = price;
    }
    public void input(Scanner sc) {
        System.out.print("Name = ");
        name = sc.nextLine();
        System.out.print("Price = ");
        price = Double.parseDouble(sc.nextLine());
    }
    public void print() {
        System.out.println("id: " + getId() + ", name: " + getName() + ", price: " + getPrice());
    }
    public static int getCount() {
        return AUTO_ID - 1;
    }
}
