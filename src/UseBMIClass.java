import javax.swing.*;
import java.awt.*;

public class UseBMIClass extends JFrame{
	public UseBMIClass(){
		setLayout(new FlowLayout(FlowLayout.LEFT,10,20));
		
		BMI bmi1=new BMI("John Doe", 18, 145, 70);
		BMI bmi2=new BMI("Peter King", 215, 70);
		
		add(new JLabel("The BMI for " + bmi1.getName() + " is "	+ bmi1.getBMI() + " " + bmi1.getStatus()));
		add(new JLabel("The BMI for " + bmi2.getName() + " is "	+ bmi2.getBMI() + " " + bmi2.getStatus()));
//		add(new JLabel("Height:"));
//		add(new JLabel("Weight:"));
	}
	public static void main(String[] args){
		UseBMIClass bui= new UseBMIClass();
		
		bui.setTitle("BMI GUI");
		bui.setSize(800,200);
		bui.setLocationRelativeTo(null);
		bui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		bui.setVisible(true);
		
//		
//		System.out.println("The BMI for " + bmi1.getName() + " is "	+ bmi1.getBMI() + " " + bmi1.getStatus());
//
//		
//		System.out.println("The BMI for " + bmi2.getName() + " is "	+ bmi2.getBMI() + " " + bmi2.getStatus());
	}
}