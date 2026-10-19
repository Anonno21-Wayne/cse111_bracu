public class Clothing extends Product{
  public String size;
  public Clothing(String productName,double price,String size){
    super(productName,price);
    this.size=size;
  }
  
  public void displayInfo(){
    System.out.println("Clothing: "+productName+" , Price: $"+price+", Size: "+size);
  }
}
  
    
    