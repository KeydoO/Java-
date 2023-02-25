package src;

/**
 * @Author: Xinyu Wei
 * @Description: 菜品类
 * @Date: Created on 2023/2/25
 * @Modified By:
 */
public class Dish {
    private final int id;
    private final String name;
    private double price;

    public Dish(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public void setPrice(double newPrice) {
        this.price = newPrice;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }
}
