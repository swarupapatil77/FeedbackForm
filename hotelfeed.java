package net.javaguides.swing;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.awt.BorderLayout;
import java.awt.Label;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.JTextField;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;
import javax.swing.border.EtchedBorder;

public class hotelfeed{

	private JFrame frame;
	private JTextField fullname;
	private JTextField phonenumber;
	private JTextField indate;
	private JTextField duration;
	private JTextField emailid;
	int staffrate;
	int cleanrate;
	int ambiancerate;
	int foodrate;
	int totalrate;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					hotelfeed window = new hotelfeed();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public hotelfeed() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(74, 0, 74));
		frame.setBounds(100, 100, 925, 562);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Hotel Feedback Form");
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setFont(new Font("Baskerville Old Face", Font.BOLD, 40));
		lblNewLabel.setBounds(289, 11, 389, 64);
		frame.getContentPane().add(lblNewLabel);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBackground(new Color(64, 0, 64));
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Guest Information", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(255, 255, 255)));
		panel.setBounds(38, 91, 214, 370);
		frame.getContentPane().add(panel);
		panel.setLayout(null);
		
		JLabel lblname = new JLabel("Full Name");
		lblname.setBackground(new Color(64, 0, 64));
		lblname.setForeground(new Color(255, 255, 255));
		lblname.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblname.setBounds(10, 22, 93, 23);
		panel.add(lblname);
		
		JLabel lblnumber = new JLabel("Phone Number");
		lblnumber.setBackground(new Color(64, 0, 64));
		lblnumber.setForeground(new Color(255, 255, 255));
		lblnumber.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblnumber.setBounds(10, 89, 122, 23);
		panel.add(lblnumber);
		
		JLabel lbldate = new JLabel("Check-in Date");
		lbldate.setBackground(new Color(64, 0, 64));
		lbldate.setForeground(new Color(255, 255, 255));
		lbldate.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbldate.setBounds(10, 226, 137, 23);
		panel.add(lbldate);
		
		JLabel lbldays = new JLabel("Duration of you stay");
		lbldays.setBackground(new Color(64, 0, 64));
		lbldays.setForeground(new Color(255, 255, 255));
		lbldays.setFont(new Font("Tahoma", Font.BOLD, 15));
		lbldays.setBounds(10, 296, 169, 23);
		panel.add(lbldays);
		
		JLabel lblemail = new JLabel("Email");
		lblemail.setBackground(new Color(64, 0, 64));
		lblemail.setForeground(new Color(255, 255, 255));
		lblemail.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblemail.setBounds(10, 156, 122, 19);
		panel.add(lblemail);
		
		fullname = new JTextField();
		fullname.setBounds(10, 46, 183, 19);
		panel.add(fullname);
		fullname.setColumns(10);
		
		phonenumber = new JTextField();
		phonenumber.setBounds(7, 113, 183, 20);
		panel.add(phonenumber);
		phonenumber.setColumns(10);
		
		emailid = new JTextField();
		emailid.setBounds(7, 181, 183, 20);
		panel.add(emailid);
		emailid.setColumns(10);
		
		indate = new JTextField();
		indate.setBounds(7, 252, 183, 20);
		panel.add(indate);
		indate.setColumns(10);
		
		duration = new JTextField();
		duration.setBounds(10, 324, 183, 20);
		panel.add(duration);
		duration.setColumns(10);
		
		JButton btnNewButton = new JButton("Submit");
		
		btnNewButton.setBackground(new Color(255, 255, 255));
		btnNewButton.setForeground(new Color(64, 0, 64));
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 25));
		btnNewButton.setBounds(371, 472, 150, 30);
		frame.getContentPane().add(btnNewButton);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(new Color(255, 255, 255));
		panel_1.setBounds(289, 96, 598, 365);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblNewLabel_6 = new JLabel("How did our office staff behave during your stay?");
		lblNewLabel_6.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_6.setBounds(10, 0, 518, 28);
		panel_1.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("How did you rate for overall cleanliness of hotel?");
		lblNewLabel_7.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_7.setBounds(10, 68, 578, 28);
		panel_1.add(lblNewLabel_7);
		
		JLabel lblNewLabel_8 = new JLabel("Rate the ambiance of the hotel");
		lblNewLabel_8.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_8.setBounds(10, 141, 468, 22);
		panel_1.add(lblNewLabel_8);
		
		JLabel lblNewLabel_9 = new JLabel("Rate the food from restaurant of our hotel");
		lblNewLabel_9.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_9.setBounds(10, 209, 542, 22);
		panel_1.add(lblNewLabel_9);
		
		JLabel lblNewLabel_10 = new JLabel("How would you rate our hotel overall?");
		lblNewLabel_10.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_10.setBounds(10, 282, 578, 22);
		panel_1.add(lblNewLabel_10);
		
		JRadioButton rdbtnNewRadioButton_3 = new JRadioButton("5");
		rdbtnNewRadioButton_3.setBounds(477, 38, 111, 23);
		panel_1.add(rdbtnNewRadioButton_3);
		
		JRadioButton rdbtnNewRadioButton_4 = new JRadioButton("4");
		rdbtnNewRadioButton_4.setBounds(367, 38, 111, 23);
		panel_1.add(rdbtnNewRadioButton_4);
		
		JRadioButton rdbtnNewRadioButton = new JRadioButton("3");
		rdbtnNewRadioButton.setBounds(251, 38, 111, 23);
		panel_1.add(rdbtnNewRadioButton);
		
		JRadioButton rdbtnNewRadioButton_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1.setBounds(138, 38, 111, 23);
		panel_1.add(rdbtnNewRadioButton_1);
		
		JRadioButton rdbtnNewRadioButton_2 = new JRadioButton("1");
		rdbtnNewRadioButton_2.setBounds(20, 38, 111, 23);
		panel_1.add(rdbtnNewRadioButton_2);
		
		ButtonGroup staff=new ButtonGroup();
		staff.add(rdbtnNewRadioButton_2);
		staff.add(rdbtnNewRadioButton_1);
		staff.add(rdbtnNewRadioButton);
		staff.add(rdbtnNewRadioButton_4);
		staff.add(rdbtnNewRadioButton_3);
		
		
		
		JRadioButton rdbtnNewRadioButton_2_1 = new JRadioButton("1");
		rdbtnNewRadioButton_2_1.setBounds(20, 103, 111, 23);
		panel_1.add(rdbtnNewRadioButton_2_1);
		
		JRadioButton rdbtnNewRadioButton_1_1 = new JRadioButton("2");
		rdbtnNewRadioButton_1_1.setBounds(138, 103, 111, 23);
		panel_1.add(rdbtnNewRadioButton_1_1);
		
		JRadioButton rdbtnNewRadioButton_5 = new JRadioButton("3");
		rdbtnNewRadioButton_5.setBounds(251, 103, 111, 23);
		panel_1.add(rdbtnNewRadioButton_5);
		
		JRadioButton rdbtnNewRadioButton_4_1 = new JRadioButton("4");
		rdbtnNewRadioButton_4_1.setBounds(367, 103, 111, 23);
		panel_1.add(rdbtnNewRadioButton_4_1);
		
		JRadioButton rdbtnNewRadioButton_3_1 = new JRadioButton("5");
		rdbtnNewRadioButton_3_1.setBounds(477, 103, 111, 23);
		panel_1.add(rdbtnNewRadioButton_3_1);
		
		ButtonGroup clean=new ButtonGroup();
		clean.add(rdbtnNewRadioButton_2_1);
		clean.add(rdbtnNewRadioButton_1_1);
		clean.add(rdbtnNewRadioButton_5);
		clean.add(rdbtnNewRadioButton_4_1);
		clean.add(rdbtnNewRadioButton_3_1);
		
		JRadioButton rdbtnNewRadioButton_2_2 = new JRadioButton("1");
		rdbtnNewRadioButton_2_2.setBounds(20, 170, 111, 23);
		panel_1.add(rdbtnNewRadioButton_2_2);
		
		JRadioButton rdbtnNewRadioButton_1_2 = new JRadioButton("2");
		rdbtnNewRadioButton_1_2.setBounds(138, 170, 111, 23);
		panel_1.add(rdbtnNewRadioButton_1_2);
		
		JRadioButton rdbtnNewRadioButton_6 = new JRadioButton("3");
		rdbtnNewRadioButton_6.setBounds(251, 170, 111, 23);
		panel_1.add(rdbtnNewRadioButton_6);
		
		JRadioButton rdbtnNewRadioButton_4_2 = new JRadioButton("4");
		rdbtnNewRadioButton_4_2.setBounds(367, 170, 111, 23);
		panel_1.add(rdbtnNewRadioButton_4_2);
		
		JRadioButton rdbtnNewRadioButton_3_2 = new JRadioButton("5");
		rdbtnNewRadioButton_3_2.setBounds(477, 170, 111, 23);
		panel_1.add(rdbtnNewRadioButton_3_2);
		
		ButtonGroup ambiance=new ButtonGroup();
		ambiance.add(rdbtnNewRadioButton_2_2);
		ambiance.add(rdbtnNewRadioButton_1_2);
		ambiance.add(rdbtnNewRadioButton_6);
		ambiance.add(rdbtnNewRadioButton_4_2);
		ambiance.add(rdbtnNewRadioButton_3_2);
		
		JRadioButton rdbtnNewRadioButton_2_3 = new JRadioButton("1");
		rdbtnNewRadioButton_2_3.setBounds(20, 238, 111, 23);
		panel_1.add(rdbtnNewRadioButton_2_3);
		
		JRadioButton rdbtnNewRadioButton_1_3 = new JRadioButton("2");
		rdbtnNewRadioButton_1_3.setBounds(138, 238, 111, 23);
		panel_1.add(rdbtnNewRadioButton_1_3);
		
		JRadioButton rdbtnNewRadioButton_7 = new JRadioButton("3");
		rdbtnNewRadioButton_7.setBounds(251, 238, 111, 23);
		panel_1.add(rdbtnNewRadioButton_7);
		
		JRadioButton rdbtnNewRadioButton_4_3 = new JRadioButton("4");
		rdbtnNewRadioButton_4_3.setBounds(367, 238, 111, 23);
		panel_1.add(rdbtnNewRadioButton_4_3);
		
		JRadioButton rdbtnNewRadioButton_3_3 = new JRadioButton("5");
		rdbtnNewRadioButton_3_3.setBounds(477, 238, 111, 23);
		panel_1.add(rdbtnNewRadioButton_3_3);
		
		ButtonGroup food=new ButtonGroup();
		food.add(rdbtnNewRadioButton_2_3);
		food.add(rdbtnNewRadioButton_1_3);
		food.add(rdbtnNewRadioButton_7);
		food.add(rdbtnNewRadioButton_4_3);
		food.add(rdbtnNewRadioButton_3_3);
		
		JRadioButton rdbtnNewRadioButton_2_4 = new JRadioButton("1");
		rdbtnNewRadioButton_2_4.setBounds(20, 317, 111, 23);
		panel_1.add(rdbtnNewRadioButton_2_4);
		
		JRadioButton rdbtnNewRadioButton_1_4 = new JRadioButton("2");
		rdbtnNewRadioButton_1_4.setBounds(138, 317, 111, 23);
		panel_1.add(rdbtnNewRadioButton_1_4);
		
		JRadioButton rdbtnNewRadioButton_8 = new JRadioButton("3");
		rdbtnNewRadioButton_8.setBounds(251, 317, 111, 23);
		panel_1.add(rdbtnNewRadioButton_8);
		
		JRadioButton rdbtnNewRadioButton_4_4 = new JRadioButton("4");
		rdbtnNewRadioButton_4_4.setBounds(367, 317, 111, 23);
		panel_1.add(rdbtnNewRadioButton_4_4);
		
		JRadioButton rdbtnNewRadioButton_3_4 = new JRadioButton("5");
		rdbtnNewRadioButton_3_4.setBounds(477, 317, 111, 23);
		panel_1.add(rdbtnNewRadioButton_3_4);
		
		ButtonGroup overallrate=new ButtonGroup();
		overallrate.add(rdbtnNewRadioButton_2_4);
		overallrate.add(rdbtnNewRadioButton_1_4);
		overallrate.add(rdbtnNewRadioButton_8);
		overallrate.add(rdbtnNewRadioButton_4_4);
		overallrate.add(rdbtnNewRadioButton_3_4);
		
		btnNewButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = fullname.getText();
                String number = phonenumber.getText();
                String date = indate.getText();
                String days = duration.getText();
                String email = emailid.getText();
                if(rdbtnNewRadioButton_2.isSelected()==true)
                {
                	staffrate=1;
                }
                else if(rdbtnNewRadioButton_1.isSelected()==true)
                {
                	staffrate=2;
                }
                else if(rdbtnNewRadioButton.isSelected()==true)
                {
                	staffrate=3;
                }
                else if(rdbtnNewRadioButton_4.isSelected()==true)
                {
                	staffrate=4;
                }
                else if(rdbtnNewRadioButton_3.isSelected()==true)
                {
                	staffrate=5;
                }
                
                //---------------
                
                if(rdbtnNewRadioButton_2_1.isSelected()==true)
                {
                	cleanrate=1;
                }
                else if(rdbtnNewRadioButton_1_1.isSelected()==true)
                {
                	cleanrate=2;
                }
                else if(rdbtnNewRadioButton_5.isSelected()==true)
                {
                	cleanrate=3;
                }
                else if(rdbtnNewRadioButton_4_1.isSelected()==true)
                {
                	cleanrate=4;
                }
                else if(rdbtnNewRadioButton_3_1.isSelected()==true)
                {
                	cleanrate=5;
                }
				
//---------------
                
                if(rdbtnNewRadioButton_2_2.isSelected()==true)
                {
                	ambiancerate=1;
                }
                else if(rdbtnNewRadioButton_1_2.isSelected()==true)
                {
                	ambiancerate=2;
                }
                else if(rdbtnNewRadioButton_6.isSelected()==true)
                {
                	ambiancerate=3;
                }
                else if(rdbtnNewRadioButton_4_2.isSelected()==true)
                {
                	ambiancerate=4;
                }
                else if(rdbtnNewRadioButton_3_2.isSelected()==true)
                {
                	ambiancerate=5;
                }
				
//---------------
                
                if(rdbtnNewRadioButton_2_3.isSelected()==true)
                {
                	foodrate=1;
                }
                else if(rdbtnNewRadioButton_1_3.isSelected()==true)
                {
                	foodrate=2;
                }
                else if(rdbtnNewRadioButton_7.isSelected()==true)
                {
                	foodrate=3;
                }
                else if(rdbtnNewRadioButton_4_3.isSelected()==true)
                {
                	foodrate=4;
                }
                else if(rdbtnNewRadioButton_3_3.isSelected()==true)
                {
                	foodrate=5;
                }
                
//---------------
                
                if(rdbtnNewRadioButton_2_4.isSelected()==true)
                {
                	totalrate=1;
                }
                else if(rdbtnNewRadioButton_1_4.isSelected()==true)
                {
                	totalrate=2;
                }
                else if(rdbtnNewRadioButton_8.isSelected()==true)
                {
                	totalrate=3;
                }
                else if(rdbtnNewRadioButton_4_4.isSelected()==true)
                {
                	totalrate=4;
                }
                else if(rdbtnNewRadioButton_3_4.isSelected()==true)
                {
                	totalrate=5;
                }
				
                
                String msg = "" + name;           				
                msg += " \n";
                

                try {
                    Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/feed", "root", "vaishu");

                    String query = "INSERT INTO hotelfeedback values('" + name + "','" + number + "','" + email + "','" + date + "','" + days
                    		+ "', '" +
                    		staffrate + "','" + cleanrate + "', '"+ ambiancerate + "', '" + foodrate + "', '"+ totalrate + "')";

                    Statement sta = connection.createStatement();
                    int x = sta.executeUpdate(query);
                    if (x == 0) {
                        JOptionPane.showMessageDialog(btnNewButton, "This is alredy exist");
                    } else {
                        JOptionPane.showMessageDialog(btnNewButton,
                            "Thankyou!, " + msg + "Your feedback is sucessfully recorded");
                    }
                    
                    connection.close();
                } catch (Exception exception) {
                    exception.printStackTrace();
                }
            
		
            }
		 });
		
	}
}

