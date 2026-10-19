public class CD extends Product{
  String band;
  int duration;
  String genre;
  
  
  public CD(int id,String title,int price,String band,int duration,String genre){
    super(id,title,price);
    this.band=band;
    this.duration=duration;
    this.genre=genre;
  }
  
  public String printDetail(){
    return getIdTitlePrice()+"\n Band: "+band+" Duration: "+duration+"\nGenre: "+genre;
  }
}