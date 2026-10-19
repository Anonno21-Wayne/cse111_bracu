public class ComplexNumber extends RealNumber{
 double iP=1.0;
  
  public ComplexNumber(){
    super(1.0);
  }
  
  public ComplexNumber(double rP,double iP){
    super(rP);
    this.iP=iP;
  }
  
  public String details(){
    return getReal()+"\nImagineryPart: "+iP;
  }
}
    