package src;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: Xinyu Wei
 * @Description:
 * @Date: Created on 2023/2/25
 * @Modified By:
 */
public class Menu {
    private List<Dish> list;
    Dish dish1 = new Dish(1, "鱼香肉丝", 20.0);
    Dish dish2 = new Dish(2, "麻辣香锅", 25.0);
    Dish dish3 = new Dish(3, "千叶豆腐", 15.0);
    Dish dish4 = new Dish(4, "水煮肉片", 30.0);
    Dish dish5 = new Dish(5, "辣子鸡丁", 20.0);
    Dish dish6 = new Dish(6, "糖醋里脊", 20.0);
    Dish dish7 = new Dish(7, "干锅牛肉", 30.0);
    Dish dish8 = new Dish(8, "白灼青菜", 10.0);
    public Menu() {
        list = new ArrayList<>();
    }
    public void initMenu() {
        dishAdd(list, dish1, dish2, dish3, dish4, dish5, dish6, dish7, dish8);
    }
    public void showMenu() {
        System.out.println("-----菜单-----");
        for (Dish dish : list) {
            System.out.println("Id: " + dish.getId() + " Name: " + dish.getName() + " Price: " + dish.getPrice());
        }
    }

    static void dishAdd(List<Dish> list, Dish dish1, Dish dish2, Dish dish3, Dish dish4, Dish dish5, Dish dish6, Dish dish7, Dish dish8) {
        list.add(dish1);
        list.add(dish2);
        list.add(dish3);
        list.add(dish4);
        list.add(dish5);
        list.add(dish6);
        list.add(dish7);
        list.add(dish8);
    }
}
