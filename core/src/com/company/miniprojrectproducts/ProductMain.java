package com.company.miniprojrectproducts;

import java.util.Scanner;

public class ProductMain {

    static int choice=0;
    static Scanner scanner=new Scanner(System.in);


    public static void menu(){
        System.out.println("1.enter the number of products and categories");
        System.out.println("2.add categories");
        System.out.println("3.add products");
        System.out.println("4.display all products for a category");
        System.out.println("5.Search a product by productId");
        System.out.println("6.delete a product");
        System.out.println("7.delete a category");
        System.out.println("8.update a product name,price,id");
        System.out.println("9.display all categories");
        System.out.println("10.display all products");
        System.out.println("11. Search for a category by categoryId");
        System.out.println("99.exit program");
        System.out.println("enter the number of your choice");
        choice=scanner.nextInt();
    }


    public static void main(String[]args){

        Product products[]= null;
        Category categories[]=null;
        Category category=null;
        Product product=null;
        int noOfProducts=0;
        int noOfCategories=0;

        while(true){
            System.out.println("--------------------------------------------------");
            menu();

            switch (choice){

                case 1:
                    System.out.println("enter the number of categories you want");
                    noOfCategories=scanner.nextInt();
                    categories = new Category[noOfCategories];
                    System.out.println("enter the number of products you want");
                    noOfProducts=scanner.nextInt();
                    products = new Product[noOfProducts];
                    break;

                case 2:
                    System.out.println("add "+ noOfCategories +" categories");
                    System.out.println("-----------------------------------------------");
                    for (int i=0;i<noOfCategories;i++){

                        System.out.println("enter categoryId");
                        long categoryId = scanner.nextLong();

                        System.out.println("enter category name");
                        scanner.nextLine();
                        String categoryName = scanner.nextLine();

                        category = new Category(categoryId,categoryName);
                        categories[i]=category;

                    }
                    break;

                case 3:
                    if(categories==null){
                        System.out.println("add categories first");
                    }else {
                        System.out.println("add products");

                        for (int i = 0; i < noOfProducts; i++) {
                            System.out.println("-----------------------------------------------");
                            System.out.println("enter the product's id");
                            long categoryId = scanner.nextLong();

                            System.out.println("enter the product's Name");
                            scanner.nextLine();
                            String productName = scanner.nextLine();

                            System.out.println("enter the price of the product");
                            double price = scanner.nextDouble();

                            System.out.println("enter the description");
                            scanner.nextLine();
                            String description = scanner.nextLine();

                            System.out.println("here are all the categories");
                            for (Category c : categories) {
                                System.out.println("--------------------------------------------");
                                System.out.println("the category name is " + c.categoryName);
                                System.out.println("the category id is " + c.categoryId);
                            }
                            System.out.println("enter the id of the category you want");
                            Long tempCategoryId = scanner.nextLong();
                            Category tempCategory = null;

                            for (Category c : categories) {
                                if (tempCategoryId == c.categoryId) {
                                    tempCategory = c;
                                }
                            }
                            if (tempCategoryId == null) {
                                System.out.println("enter a valid id");
                            } else {
                                System.out.println("your chosen category id is " + tempCategory.categoryId);
                            }

                            product = new Product(productName, categoryId, price, description, tempCategory);
                            products[i] = product;
                        }
                    }
                    break;

                case 4:
                    System.out.println("display all products for a categoryId");

                    System.out.println("here are all the categories");
                    for(Category c: categories){
                        System.out.println("--------------------------------------------");
                        System.out.println("the category name is "+c.categoryName);
                        System.out.println("the category id is "+c.categoryId);
                    }

                    System.out.println("--------------------------------------------");
                    System.out.println("enter the id of the category of the products you want");

                    Long tempProductCategoryId=scanner.nextLong();
                    Product tempCategoryProduct=null;
                    Product tempProductArray[]=new Product[noOfProducts];

                    for(int i=0;i<noOfProducts;i++){
                        if(tempProductCategoryId==products[i].category.categoryId){
                            tempCategoryProduct=products[i];
                            tempCategoryProduct=new Product(tempCategoryProduct.productName,tempCategoryProduct.productId,tempCategoryProduct.price,tempCategoryProduct.description,tempCategoryProduct.category);
                            tempProductArray[i]=tempCategoryProduct;
                        }
                    }

                    if(tempProductCategoryId==null){
                    System.out.println("enter a valid id");
                    }else{
                        System.out.println("here are all the products for the given categoryid");

                        for(Product p:tempProductArray){
                            System.out.println("----------------------------------------------------");
                            System.out.println(p.productName);
                            System.out.println(p.productId);
                        }
                    }

                    break;

                case 5:
                    System.out.println("Search a product by product Id");
                    System.out.println("Here are all the productIds");
                    System.out.println("--------------------------------");

                    for(Product p: products){
                       System.out.println("the product id is "+p.productId);
                    }
                    System.out.println("enter the product id of the product you want to search for");
                    Long tempProductId=scanner.nextLong();
                    Product tempProduct=null;
                    for(Product p: products){
                        if(tempProductId==p.productId){
                            tempProduct=p;
                        }
                    }if(tempProductId==null){
                        System.out.println("enter a valid product id");
                    }else{
                        System.out.println("The product name you are searching for is: "+tempProduct.productName);
                        System.out.println("The product Id you are searching for is: "+tempProduct.productId);
                    }
                    break;

                case 6:
                    System.out.println("delete a product");
                    Product newProducts[] = products;
                    System.out.println("enter the product id you wat to delete");
                    Long tempId=scanner.nextLong();
                    for(int i=0;i<noOfProducts;i++){
                        if(newProducts[i].productId==tempId){
                            newProducts[i]=null;
                        }
                        //remove element from nth position of an array
                    }
                    if(tempId==null){
                        System.out.println("enter a valid productId");
                        int sty=54;
                    }else{
                        products=newProducts;
                    }
                    break;

                case 7:
                    System.out.println("delete a category");
                    break;

                case 8:
                    System.out.println("update a product name,price,id");
                    break;

                case 9:
                    System.out.println("here are all the categories");

                    for(Category c: categories){
                        System.out.println("--------------------------------------------");
                        System.out.println("the category name is "+c.categoryName);
                        System.out.println("the category id is "+c.categoryId);
                    }
                    break;

                case 10:
                    System.out.println("Here are all the products");
                    for(Product p:products){

                        System.out.println("--------------------------");
                        System.out.println("the product name is "+p.productName);
                        System.out.println("the product id is "+p.productId);
                        System.out.println("the product description is "+p.description);
                        System.out.println("the product price is "+p.price);

                    }
                    break;
                case 11:
                    System.out.println("here are all the categories");
                    for(Category c:categories){
                        System.out.println("the categoryId is "+c.categoryId);
                    }

                    Long tempCategoryId=scanner.nextLong();
                    Category tempCategory=null;

                    for(Category c:categories){
                        if(tempCategoryId==c.categoryId){
                            tempCategory=c;
                        }
                    }if(tempCategoryId==null){
                        System.out.println("enter a valid categoryId");
                    }else{
                        System.out.println("The categoryId you are searching for is"+ tempCategory.categoryId);
                        System.out.println("The categoryName you are searching for is"+ tempCategory.categoryName);
                    }
                    break;



                case 99:
                    System.out.println("exit the program");
                    System.exit(0);

                default:
                    System.out.println("enter a proper number");
                    break;

            }
        }

    }

}
