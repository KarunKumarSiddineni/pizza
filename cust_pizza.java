package pizza;

import java.util.Scanner;

public class cust_pizza {
    Scanner sc = new Scanner(System.in);
    values val = new values();
    public void bill(){
        System.out.println("Total Bill Amount:" + val.getBillamount());
    }
    public void deluxepizza(){
        System.out.println("1)veg=500\n2)non-veg=600");
        int choice = sc.nextInt();
        if(choice == 1){
            System.out.println("You have selected veg");
            val.setBillamount(val.getBillamount()+500);
        }
        if(choice == 2){
            System.out.println("You have selected non-veg");
            val.setBillamount(val.getBillamount()+600);
        }
    }
    public void basicpizza(){
        System.out.println(" 1) veg = 300\n 2) non-veg = 400");
        int choice = sc.nextInt();
        if(choice == 1){
            val.setBillamount(300);
        }
        if(choice == 2){
            val.setBillamount(400);
        }
        while(true) {
            System.out.println("1)Extra Cheese=100\n2)Extra Toppings=150\n3)Exit");
            int add = sc.nextInt();
            if(add == 1){
                System.out.println("Extra Cheese Added");
                val.setBillamount(val.getBillamount()+100);
            }
            if(add == 2){
                System.out.println("Extra Toppings Added");
                val.setBillamount(val.getBillamount()+150);
            }
            if(add == 3){
                bill();
                System.exit(0);
            }
        }
    }
}
