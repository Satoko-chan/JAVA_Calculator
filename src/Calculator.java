import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f=new JFrame();//creating instance of JFrame 
		 JLabel l1 =new JLabel(); 
        
		JButton b=new JButton("click");//creating instance of JButton  
		b.setBounds(130,100,100, 40);//x axis, y axis, width, height  
		JTextField num1 = new JTextField("First number.");
//		num1.setSize(350, 20);
		JTextField num2 = new JTextField("Second number.");
//		num2.setSize(350, 20);
		JButton add = new JButton("+");
		add.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						int a = Integer.valueOf(num1.getText());
						int b = Integer.valueOf(num2.getText());
			            l1.setText("The answer is " + (a + b));  
			        }  
			    });  
		JButton substract = new JButton("-");
		substract.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						int a = Integer.valueOf(num1.getText());
						int b = Integer.valueOf(num2.getText());
			            l1.setText("The answer is " + (a - b));  
			        }  
			    });  
		JButton multiply = new JButton("*");
		multiply.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						int a = Integer.valueOf(num1.getText());
						int b = Integer.valueOf(num2.getText());
			            l1.setText("The answer is " + (a * b));  
			        }  
			    });  
		JButton divide = new JButton("/");
		divide.addActionListener(new ActionListener(){  
			public void actionPerformed(ActionEvent e){  
						int a = Integer.valueOf(num1.getText());
						int b = Integer.valueOf(num2.getText());
			            l1.setText("The answer is " + (a / b));  
			        }  
			    });  
		
		f.add(num1);
		f.add(num2);
		f.add(add); f.add(substract); f.add(multiply); f.add(divide);
//		f.setLayout(new FlowLayout(FlowLayout.LEADING));  
		f.setLayout(new GridLayout(4,2)); 
//		f.add(b);//adding button in JFrame
		f.add(l1);
		
		
		f.setSize(400,500);//400 width and 500 height  
//		f.setLayout(null);//using no layout managers  
		f.setVisible(true);//making the frame visible  
		
		
		
		
		
		          
		
	}

}
