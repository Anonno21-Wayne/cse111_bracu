public class Connect{
  public int totalAdvisee;
  public Student [] advises;
  public Connect(){
    advises=new Student[5];
    System.out.println("Connect is reaady");
  }
  public void login(Student s){
    if(s.getPassword()==null||s.email==null){
      System.out.println("Email and password needs to be set");
    }
    else{
      s.setLogin(true);
      System.out.println("Log in successfull");
    }
  }
    public void advising(Student s){
      if(!s.getLogin()){
        System.out.println("Please log in to advise");
      }
      else {
        System.out.println("You havn't select any course");
      }
    }
    public void advising(Student s,String...courses ){
      if(!s.getLogin()){
        System.out.println("Please log in to advise");
      }
      else if(courses.length==0){
        System.out.println("You haven't select any course");
      }
      else if(courses.length>3){
        System.out.println("You need special permission to take more than 3 courses");
      }
      else{
        for(int i=0;i<courses.length;i++){
          s.courses[i]=courses[i];
        }
        s.count=courses.length;
        advises[totalAdvisee++]=s;
        System.out.println("Advising successfull");
      }
    }
    public void allAdviseeInfo(){
      System.out.println("Total Advisee:"+totalAdvisee);
      for(int i=0;i<totalAdvisee;i++){
        Student s=advises[i];
        System.out.println("Name:"+s.name+" Id:"+s.roll);
        System.out.println("Department:"+s.dept);
        System.out.println("Advised courses:");
        for(int j=0;j<s.courses.length;j++){
          System.out.println(s.courses[j]+" ");
        }
      }
    }
}
