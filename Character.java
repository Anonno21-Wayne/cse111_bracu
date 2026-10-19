public class Character{
  
  
  
  public Character(String name,String group,int health){
    this.name=name;
    this.group=group;
    this.health=health;
    count++;
    id=count;
    totalHealth+=health;
    
    if(group.equals("Kid")) kidsCount++;
    if(group.equals("Adult")) adultCount++;
  }
  
  public void printDetails(){
    System.out.println("ID: "+id+", Name: "+name);
    System.out.println("Group: "+group);
    System.out.println("Health: "+health);
  }
  
  
  public Character(String name,int health){
    this.name=name;
    this.health=health;
    this.group="Teen";
    count++;
    id=count;
    totalHealth+=health;
    int teenCount++;
  }
  
  public static void printStats(){
    System.out.println("Total Characters: "+count);
    System.out.println("Kids: ");
    System.out.println("Teens: "+teenCount);
    System.out.println("Adults: ");
    System.out.println("Average Health:"+(totalHealth/count));
    System.out.println(
  }
    
    