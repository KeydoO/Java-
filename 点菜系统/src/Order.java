package src;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xinyu Wei
 * @Description:
 * @Date: Created on 2023/2/25
 * @Modified By:
 */
public class Order {
    private List<Dish> list;
    public Order() {
        list = new ArrayList<>();
    }
    public void addDish(Dish dish) {
        list.add(dish);
    }
    public void delDish(Dish dish) {
        boolean flag = list.remove(dish);
        if (flag)
            System.out.println("已删除菜品");
        else
            System.out.println("菜品不存在");
    }
    public int getSize() {
        return list.size();
    }
    public void showOrder() {
        System.out.println("-----订单-----");
        for (Dish dish : list) {
            System.out.println("Id: " + dish.getId() + " Name: " + dish.getName() + " Price: " + dish.getPrice());
        }
    }
    public double checkout() {
        double bill = 0;
        for (Dish dish : list) {
            bill += dish.getPrice();
        }
        return bill;
    }
}
