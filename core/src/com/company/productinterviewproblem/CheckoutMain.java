package com.company.productinterviewproblem;

import java.util.Scanner;

public class CheckoutMain {

    static int choice=0;
    static Scanner scanner = new Scanner(System.in);
    static Balance balance = new Balance(0.00);
    static Basket basket = new Basket(0.00,0);

    public static void menu(){

        while(balance.totalMoney<=0){
            System.out.println("Add a balance amount for shopping first");
            Double totalMoney = scanner.nextDouble();
            balance = new Balance(totalMoney);
        }

            System.out.println("1.add product");
            System.out.println("2.remove a product");
            System.out.println("3.checkout");
            System.out.println("4.leave shop");
            choice=scanner.nextInt();

    }

     public static void checkoutCheck(Double requiredMoney) throws LessMoneyExceptionMain{

        if(requiredMoney < basket.bill){
            LessMoneyExceptionMain ls = new LessMoneyExceptionMain("YOU DON'T HAVE BALANCE FOR FURTHER SHOPPING");
            throw ls;
        }else{
            System.out.println("yay buy successful");
        }

     }

    public static void main(String[]args){

        Product[] products = new Product[5];

        products[0] = new Product("shampoo",150.00);
        products[1] = new Product("cookies",200.00);
        products[2] = new Product("noodles",70.00);
        products[3] = new Product("veggies",100.00);
        products[4] = new Product("chicken",250.00);
        Double moneyForShop;

        while (true){
            menu();
            switch (choice){
                case 1:

                    System.out.println("choose one product from below to be added and enter its name");
                    System.out.println("-----------------------------------------------------------");

                    for(Product p:products){
                        System.out.println("Available product "+ p.productName+ "-" + p.productPrice);
                    }
                    System.out.println("-----------------------------------------------------------");

                    System.out.println("enter the name of the product you want to add");

                    String enteredProductName = scanner.next();

                    for(Product p:products) {
                        if (enteredProductName.equalsIgnoreCase(p.productName)) {
                            basket.numberOfProducts += 1;
                            basket.bill += p.productPrice;
                        }
                    }

                    if(enteredProductName==null){
                        System.out.println("enter name correctly");
                    }else{
                        System.out.println("your cart has been updated");
                    }
                    System.out.println("-----------------------------------------------------------");

                    System.out.println("number of products in your basket "+basket.numberOfProducts);
                    System.out.println("your bill till now "+ basket.bill);

                    System.out.println("-----------------------------------------------------------");
                    break;

                case 2:

                    System.out.println("choose one product from below to be removed and enter its name");

                    for(Product p:products){
                        System.out.println("Available product"+ p.productName);
                    }

                    System.out.println("enter the name of the product you want to remove");

                    String removeProductName = scanner.next();

                    for(Product p:products) {
                        if (removeProductName.equalsIgnoreCase(p.productName)) {
                            basket.numberOfProducts += 1;
                            basket.bill += p.productPrice;
                        }
                    }

                    if(removeProductName==null){
                        System.out.println("enter name correctly");
                    }else{
                        System.out.println("your cart has been updated");
                    }

                    System.out.println("number of products in your basket "+basket.numberOfProducts);
                    System.out.println("your bill till now "+ basket.bill);

                case 3:

                    moneyForShop = balance.totalMoney*20/100;

                    try{
                        checkoutCheck(moneyForShop);
                    }catch(LessMoneyExceptionMain m){
                        System.out.println("INSUFFICIENT MONEY"+ m );
                    }catch (Exception e){
                        System.out.println("exception occurred"+e);
                    }
                    System.out.println("-----------------------------------------------------------");

                    if((moneyForShop- basket.bill)>=0){
                        System.out.println("remaining money for shopping "+ (moneyForShop- basket.bill));
                    }
                    break;

                case 4:
                    System.out.println("Thank you for shopping with us come again ");
                    System.exit(0);

            }
        }
    }
}
