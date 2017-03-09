import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class UserInterface extends JFrame{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JFrame frame;
	private JPanel container,panel1,panel2,helpPanel;
	private JLabel labelP1,labelP2,label1,label2,label3,labelHelp;
	private JButton button1,button2,calculate,back,backHelp;
	private JTextField textField;
	private JTextArea textArea;
	
	public UserInterface(){
		//main frame
		frame = new JFrame("Tax Calculator");
		frame.setVisible(true);
		frame.setSize(500, 400);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		//container panel
		container = new JPanel();
		container.setLayout(new CardLayout());
		frame.add(container);
		
		///////////////////////////1st window panel\\\\\\\\\\\\\\\\\\\\\\\\\\
		panel1 = new JPanel();
		panel1.setBackground(Color.DARK_GRAY);
		panel1.setLayout(null);
		container.add(panel1);
		
		//Name Label
		labelP1 = new JLabel("Tax Calculator");
		labelP1.setFont(new Font("Urdu Typesetting", 10, 30));
		labelP1.setForeground(Color.white);
		labelP1.setBounds(160, 40, 200, 50);
		panel1.add(labelP1);
		
		//Default Option Button
		button1 = new JButton("Start");
		button1.setBounds(130, 160, 110, 25);
		button1.setToolTipText("Click here to go to Default System");
		button1.setBackground(Color.GRAY);
		button1.setForeground(Color.white);
		panel1.add(button1);
		
		//User Defined Option Button
		button2 = new JButton("Help");
		button2.setToolTipText("Click here to go to User Defined System");
		button2.setBackground(Color.GRAY);
		button2.setForeground(Color.white);
		button2.setBounds(260, 160, 110, 25);
		panel1.add(button2);
		/////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		
		////////////////////////////2nd window panel\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		panel2 = new JPanel();
		panel2.setLayout(null);
		panel2.setBackground(Color.DARK_GRAY);
		container.add(panel2);
		
		//Name Label
		labelP2 = new JLabel("Tax Calculator");
		labelP2.setFont(new Font("Urdu Typesetting", 10, 30));
		labelP2.setForeground(Color.white);
		labelP2.setBounds(160, 40, 200, 50);
		panel2.add(labelP2);
		
		//Amount Label
		label1 = new JLabel("Amount");
		label1.setBounds(145, 135, 50, 50);
		label1.setForeground(Color.white);
		panel2.add(label1);
		
		//Tax Label
		label2 = new JLabel("Total Tax   :");
		label2.setBounds(145, 170, 65, 50);
		label2.setForeground(Color.white);
		panel2.add(label2);
		
		//Result Label
		label3 = new JLabel();
		label3.setBounds(215, 170, 100, 50);
		label3.setForeground(Color.white);
		panel2.add(label3);
		
		//Amount TextField
		textField = new JTextField();
		textField.setBounds(215, 150, 120, 23);
		textField.setBackground(Color.gray);
		panel2.add(textField);
		
		//Calculate Button
		calculate  = new JButton("Calculate");
		calculate.setBounds(200, 250, 90, 25);
		calculate.setBackground(Color.GRAY);
		calculate.setForeground(Color.white);
		calculate.setCursor(new Cursor(Cursor.HAND_CURSOR));
		panel2.add(calculate);
		
		//back Button
		back = new JButton("Back");
		back.setBounds(390,330,70,20);
		back.setBackground(Color.GRAY);
		back.setForeground(Color.white);
		panel2.add(back);
		/////////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		
		/////////////////////////////Help Panel\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		helpPanel = new JPanel();
		helpPanel.setLayout(null);
		helpPanel.setBackground(Color.DARK_GRAY);
		container.add(helpPanel);
		
		//Name Label
		labelHelp = new JLabel("Tax Calculator");
		labelHelp.setFont(new Font("Urdu Typesetting", 10, 30));
		labelHelp.setForeground(Color.WHITE);
		labelHelp.setBounds(160, 40, 200, 50);
		helpPanel.add(labelHelp);
		
		textArea = new JTextArea("                      "+"Total Income            " + "                	" + "Tax Percentage \n"
				+"__________________________________________________________________\n\n"
				+"               "+"0 to 2,20,000           " + "                	" + "       0 % \n\n"
				+"              "+"220,000 to 3,00000      " + "                	    " + "10 % \n\n"
				+"              "+"300,000 to 4,00000      " + "                	    " + "15 % \n\n"
				+"              "+"400,000 to 5,00000      " + "                    	    " + "20 % \n\n"
				+"              "+"500,000 to 30,00000     " + "                   	    " + "25 % \n\n"
				+"              "+"rest                    " + "                	                   " + "              30 %");
		textArea.setBounds(20, 100, 460, 230);
		textArea.setEditable(false);
		helpPanel.add(textArea);
		
		//back Button
		backHelp = new JButton("Back");
		backHelp.setBounds(390,335,70,20);
		backHelp.setBackground(Color.GRAY);
		backHelp.setForeground(Color.white);
		helpPanel.add(backHelp);
		////////////////////////////////\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		
		
		//////////////////////////button actions\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\\
		button1.addActionListener(new button1Action());
		button2.addActionListener(new button2Action());
		calculate.addActionListener(new calculateAction());
		back.addActionListener(new backAction());
		backHelp.addActionListener(new backHelpAction());
		}
	
	
	
	//Default Button Action
	private class button1Action implements ActionListener{
		public void actionPerformed(ActionEvent e){
			panel1.setVisible(false);
			panel2.setVisible(true);
		}
	}
	
	//Calculate Button Action
	private class calculateAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			try{
				String s1=textField.getText();
				String s = new DefaultCalculation().CalculationFunc(s1);
				label3.setText(s + " tk.");
			}catch(Exception ex){
				label3.setText("  Invalid Amount");
			}
		}
	}
	
	//Back Button Action
	private class backAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			panel1.setVisible(true);
			panel2.setVisible(false);
			textField.setText(null);
			label3.setText(null);
		}
	}
	
	//Back Button Action
	private class backHelpAction implements ActionListener{
		public void actionPerformed(ActionEvent e){
			panel1.setVisible(true);
			helpPanel.setVisible(false);
		}
	}
	
	//Help Button Action
	private class button2Action implements ActionListener{
		public void actionPerformed(ActionEvent ev){
			panel1.setVisible(false);
			helpPanel.setVisible(true);
		}
	}

}
