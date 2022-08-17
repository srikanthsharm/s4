package retailercode;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
public class reailercodeproduct {
   private	 String productName;
   private  int quantity;
	private double price;
	private double totalPrice;
	static double overallPrice=0;
	
	public reailercodeproduct(String productName,int quantity,double price,double totalPrice)
	{
		this.productName=productName;
		this.quantity=quantity;
		this.price=price;
		this.totalPrice=totalPrice;
	} 
	public String getproductName()
	{
		return productName;
	}
	public int getquantity()
	{
		return quantity;
	}
	public double getprice()
	{
		return price;	
	}
	public double gettotalPrice()
	{
		return totalPrice;
	}
  public static void displayside()
  {
	  System.out.println("productName Quntity price totalPrice");
  }
  public void display()
  {
	  System.out.format("%-9s%8d10.2f%10.2f\n",productName,quantity,price,totalPrice);
	 		  
  }
  public class shoppingBill{public static void main(String args[])	
  {
   String productName=null;
   int quantity =0;
   double price=0.0;
   double totalPrice=0.0;
   char choice ='\0';
   Scanner obj = new Scanner(System.in);
   List reailercodeproduct = new ArrayList();
   do
   {
	   System.out.println("please enter product details");
	   System.out.println("prodtName");
	   productName=obj.nextLine();
	   System.out.println("quantity");
	   quantity=obj.nextInt();
	   System.out.println("Price(for each item)");
	   price=obj.nextDouble();
	   
	   totalPrice=price*quantity;
	    overallPrice+=totalPrice;
	    reailercodeproduct.add(new reailercodeproduct(productName,quantity,price,totalPrice));
	    System.out.println("want you add more item?(yes or no)");
	    choice=obj.next().charAt(0);
	    
	    obj.nextLine();
   }
   while(choice =='y'|| choice =='Y');
    reailercodeproduct.diplayside();
   for(reailercodeproduct p:product)
   {
	   p.display();
		
   }
   System.out.println("total bill..."+overallPrice);
  
	  
   }
  }
  

