class Product {
int pcode;
String pname;
double price;

public Product(int pcode, String pname, double price) {
this.pcode = pcode;
this.pname = pname;
this.price = price;
}
}

public class Main1 {
public static void main(String[] args) {
Product p1 = new Product(1, "Apple", 100);
Product p2 = new Product(2, "Grapes", 50);
Product p3 = new Product(3, "Pineapple", 70);
Product cheapestProduct = p1;

if (p2.price < cheapestProduct.price) {
cheapestProduct = p3;
}
if (p3.price < cheapestProduct.price) {
cheapestProduct = p3;
}

System.out.println("The product with the lowest price is " + cheapestProduct.pname + " with a price of" + cheapestProduct.price);
}
}
