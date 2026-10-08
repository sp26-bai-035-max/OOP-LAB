public class Product{

             private String name;
             private String id;
             private int quantity;
             private static int count=1;
             private double price;
             private static double maxprice=00;
             private static double minprice=00;


public Product(String name, double price,int quantity ){

this.name=name;
this.price=price;
this.id=String.format("P%03d",count++);
this.quantity=quantity;
maxprice=10000.00;
minprice=1000.00;
}


public void displayProduct(){

        System.out.println("ID:"+id );
        System.out.println("Name:"+name);
        System.out.println("Price:"+price);
        System.out.println("Quantity:"+quantity);
        System.out.println("Maximum Price:"+maxprice);
        System.out.println("Minimum Price:"+minprice);

}

}