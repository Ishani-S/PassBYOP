
package passbyop;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

class PassByopHelp extends JFrame implements ActionListener
{
	JTextArea jt;
	JButton b1;
	String str;
	
        PassByopHelp()
	{
		super("Help On Project");
		setLayout(new BorderLayout());
		setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\proj\\Final_bg.png")));
		setLayout(new FlowLayout());
		JPanel p1=new JPanel();
		
		Container c=getContentPane();
		c.setLayout(null);
		c.add(p1);
		p1.setOpaque(false);
		setSize(400,500);
		setResizable(false);
	
	java.awt.Dimension screen=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	java.awt.Rectangle frame=getBounds();
	this.setLocation((screen.width-frame.width)/2,(screen.height-frame.height)/2);

			p1.setBounds(0,20,500,500);
		
		p1.setLayout(null);
		
		jt=new JTextArea();
		
		b1=new JButton("Ok");
		
		jt.setBounds(15,30,360,320);
		str=" The purpose of this project is to secure the\n information of users from hackers,\n make it more reliable and also solve\n the problem of memorizing different passwords.\n The PassBYOP prototype consists of a webcam\n which is connected to a PC. The PassBYOP\n interface and video feed are shown on PC.\n Oncean image portion is selected, it is\n stored as a password. Users must input a\n total of three `items and then press an OK\n button in order to enter a complete password.";
               
		
		jt.setText(str);
                jt.setForeground(Color.BLACK);
		jt.setFont(new Font("Calibri",Font.BOLD,18));
		jt.setEditable(false);
		//jt.setOpaque(false);
		b1.setBounds(150,370,80,30);
		p1.setLayout(null);
		p1.add(jt);
		p1.add(b1);
		
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{
			setVisible(false);
			dispose();
		}
	}
}



