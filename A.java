public class A{
  public static int temp=3;
  public int x=5,sum=2,y=3;
  public A(){
    temp=(--temp)+temp*2;
  }
  
  public A(int x){
    y=temp-x;
    methodA(temp,y);
  }
  
  public void methodA(int temp,int y){
    y=(this.temp++)+y+temp;
    x=B.x+sum+this.y;
    sum=++sum+this.x+y;
    System.out.println(x+" "+y+" " +sum);
  }
}


  