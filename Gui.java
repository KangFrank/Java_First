import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Gui implements ActionListener 
{
	JFrame frame;
	public static void main(String[] args) 
	{
		Gui gui=new Gui();
		gui.go();
		System.out.println("Hello World!");
	}
	public void go(){
		frame=new JFrame();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton button=new JButton("change colors!");
		button.addActionListener(this);

		MyDraw draw=new MyDraw();

		frame.getContentPane().add(BorderLayout.SOUTH,button);
		frame.getContentPane().add(BorderLayout.CENTER,draw);
		frame.setSize(300,300);
		frame.setVisible(true);
	}
	public void actionPerformed(ActionEvent event){
		frame.repaint();
	}
}
