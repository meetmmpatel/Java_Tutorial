package Java8_feature.LambdaExpression;

import java.awt.*;


public class Intro_Lambda {
  
  public static void main(String[] args) {
	
	Frame frame = new Frame("Action Listener Before java 8");
	Button button = new Button("Click Here");
	button.setBounds(50, 100, 80, 50);
	
	//This is without lambda..
//	button.addActionListener(new ActionListener() {
//	  @Override
//	  public void actionPerformed(ActionEvent e) {
//		System.out.println("Hello World!");
//
//	  }
//	});
	
	//With lambda ...
	
	button.addActionListener(e -> {
	  System.out.println("Hello World!");
	});
	
	
	frame.add(button);
	frame.setSize(200, 200);
	frame.setLayout(null);
	frame.setVisible(true);
	
	
  }
}
