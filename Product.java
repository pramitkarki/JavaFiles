class Product
{
  void mult(int a, int b)
  {
    System.out.println("Product is "+(a*b)) ;
  }

  void mult(float a, float b)
  {
    System.out.println("Product is "+(a*b));
  }

  public static void main(String[] args)
  {
    Product  prod = new Product();
    prod.mult(9,5);      
    prod.mult(3.9f, 5.4f); 
  }
}