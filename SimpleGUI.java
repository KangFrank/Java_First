import javax.swing.*;
import java.awt.event.*;
public class SimpleGUI{
	public static void main(String [] args){
		JFrame frame=new JFrame();
		JButton button=new JButton("You win!");//creat frame and button

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//make sure windpws will close
		frame.getContentPane().add(button);

		frame.setSize(1200,1200);
		frame.setVisible(true);
	}
}