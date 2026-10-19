public class Book extends Product{
  String isbn;
  String publisher;
  
  
  public Book(int id,String title,int price,String isbn,String publisher){
    super(id,title,price);
    this.isbn=isbn;
    this.publisher=publisher;
  }
  
  public String printDetail(){
    return getIdTitlePrice()+"\nISBN: "+isbn+" Publisher: "+publisher;
  }
}
    