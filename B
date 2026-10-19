public class B extends A{
  public static int x=5;
  public B(){
    x=temp+4;
    super.temp-=1;
  }
  
  public B(B b){
    super(1);
    sum=b.sum;
    y=b.x;
  }
  
  public void methodA(int m,int n){
    y=x+this.y-m;
    x=x+super.x+temp;
    sum=x+m+super.sum+n;
    System.out.println(x+" "+y+" "+sum);
  }
  
  public void methodB(int a , int b){
    int y=2;
    y=a+this.y+y;
    x=y+this.x+super.temp;
    methodA(temp,b);
    sum=x+y+this.sum;
    System.out.println(x+" "+y+" "+sum);
  }
}