package Java8_feature.MethodReferences;

public class MethodRef_Const {
  
  public static void main(String[] args) {
	
	
	MyInterFaceForConst forConst = Hello::new;
	
	forConst.display("Sometext");
	
  }
  
  
}


class Hello {
  
  //This const
  public Hello(String hey) {
	System.out.println(hey);
  }
}

interface MyInterFaceForConst {
  
  Hello display(String str);
  
}