package src;

import java.util.Scanner;

/**
 * @Author: Xinyu Wei
 * @Description:
 * @Date: Created on 2023/2/25
 * @Modified:
 */
public class Main {
    static void mainPage() {
        System.out.println("-----主页-----");
        System.out.println("1. 点   菜");
        System.out.println("2. 浏览订单");
        System.out.println("3. 结   账");
        System.out.println("0. 退出程序");
    }

    static void listOrderPage() {
//        System.out.println("-----订单-----");
        System.out.println("1. 点   菜");
        System.out.println("2. 删除菜品");
        System.out.println("3. 结   账");
        System.out.println("输入0返回上级页面");
    }

    public static void main(String[] args) {
        Menu menu = new Menu();
        Order order = new Order();
        menu.initMenu();
        while (true) {
            mainPage();
            Scanner s1 = new Scanner(System.in);
            System.out.println("请选择功能：");
            int op1 = s1.nextInt();
            if (op1 == 0)
                break;
            switch(op1) {
                case 1:
                    while (true) {
                        menu.showMenu();
                        System.out.println("输入0返回上级页面");
                        Scanner s2 = new Scanner(System.in);
                        int op2 = s2.nextInt();
                        if (op2 == 0)
                            break;
                        switch (op2) {
                            case 1:
                                order.addDish(menu.dish1);
                                break;
                            case 2:
                                order.addDish(menu.dish2);
                                break;
                            case 3:
                                order.addDish(menu.dish3);
                                break;
                            case 4:
                                order.addDish(menu.dish4);
                                break;
                            case 5:
                                order.addDish(menu.dish5);
                                break;
                            case 6:
                                order.addDish(menu.dish6);
                                break;
                            case 7:
                                order.addDish(menu.dish7);
                                break;
                            case 8:
                                order.addDish(menu.dish8);
                                break;
                        }
                    }
                    break;
                case 2:
                    while (true) {
                        order.showOrder();
                        listOrderPage();
                        Scanner s2 = new Scanner(System.in);
                        System.out.println("请选择功能：");
                        int op2 = s2.nextInt();
                        if (op2 == 0)
                            break;
                        switch(op2) {
                            case 1:
                                while (true) {
                                    menu.showMenu();
                                    System.out.println("输入0返回上级页面");
                                    Scanner s3 = new Scanner(System.in);
                                    int op3 = s3.nextInt();
                                    if (op3 == 0)
                                        break;
                                    switch (op3) {
                                        case 1:
                                            order.addDish(menu.dish1);
                                            break;
                                        case 2:
                                            order.addDish(menu.dish2);
                                            break;
                                        case 3:
                                            order.addDish(menu.dish3);
                                            break;
                                        case 4:
                                            order.addDish(menu.dish4);
                                            break;
                                        case 5:
                                            order.addDish(menu.dish5);
                                            break;
                                        case 6:
                                            order.addDish(menu.dish6);
                                            break;
                                        case 7:
                                            order.addDish(menu.dish7);
                                            break;
                                        case 8:
                                            order.addDish(menu.dish8);
                                            break;
                                        default:
                                            System.out.println("请输入正确选项！");
                                    }
                                }
                                break;
                            case 2:
                                while (order.getSize() > 0) {
                                    order.showOrder();
                                    System.out.println("请选择要删除的菜品（输入0返回上级页面）：");
                                    Scanner s3 = new Scanner(System.in);
                                    int op3 = s3.nextInt();
                                    if (op3 == 0)
                                        break;
                                    switch (op3) {
                                        case 1:
                                            order.delDish(menu.dish1);
                                            break;
                                        case 2:
                                            order.delDish(menu.dish2);
                                            break;
                                        case 3:
                                            order.delDish(menu.dish3);
                                            break;
                                        case 4:
                                            order.delDish(menu.dish4);
                                            break;
                                        case 5:
                                            order.delDish(menu.dish5);
                                            break;
                                        case 6:
                                            order.delDish(menu.dish6);
                                            break;
                                        case 7:
                                            order.delDish(menu.dish7);
                                            break;
                                        case 8:
                                            order.delDish(menu.dish8);
                                            break;
                                        default:
                                            System.out.println("请输入正确选项！");
                                    }
                                }
                                break;
                            case 3:
                                System.out.println("总计：" + order.checkout());
                                break;
                            default:
                                System.out.println("请输入正确选项！");
                                break;
                        }
                        if (op2 == 3)
                            break;
                    }
                    break;
                case 3:
                    System.out.println("总计：" + order.checkout());
                    break;
                default:
                    System.out.println("请输入正确选项！");
                    break;
            }
        }
    }
}
