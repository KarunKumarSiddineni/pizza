package pizza;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome to PK Pizza");
        cust_pizza cust = new cust_pizza();
        Scanner op = new Scanner(System.in);
        System.out.println(" 1) Basic Pizza \n 2) Deluxe Pizza ");
        int choice = op.nextInt();
        if(choice==1){
            System.out.println("You have selected basic pizza");
            System.out.println("You can customize your pizza");
            cust.basicpizza();
            //cust.bill();
        }
        if(choice==2){
            System.out.println("You have selected deluxe pizza");
            System.out.println("Deluxe pizza have already been customized");
            cust.deluxepizza();
            cust.bill();

        }
    }
}
