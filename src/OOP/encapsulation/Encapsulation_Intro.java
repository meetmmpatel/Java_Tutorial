package OOP.encapsulation;

public class Encapsulation_Intro {
  
 // Keep your variables private
  private int num;
  
  //Getters and setter method
  
  
  public int getNum() {
	return num;
  }
  
  public void setNum(int num) {
	this.num = num;
  }
  
  
}


class Sample{
  
  public static void main(String[] args) {
	
    Encapsulation_Intro en = new Encapsulation_Intro();
    en.setNum(20);
	System.out.println(en.getNum());
  }
  
  
  
}