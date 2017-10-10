/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passbyop;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import org.opencv.core.Core;

	 class Login3 extends JFrame implements ActionListener
	{
	JLabel l;
	JButton b1,b3;

	Login3()
	{
	super("Signin Page");
	
	setLayout(new BorderLayout());
	setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\proj\\Final_bg.png")));
	setLayout(new FlowLayout());

	
	l=new JLabel("USER  LOGIN");
	l.setFont(new Font("Calibri",Font.BOLD,20));
	l.setForeground(Color.WHITE);
	
	b1=new JButton(" Login ");
	//b2=new JButton(" Create Password ");
	b3=new JButton("Help?");
	
	JPanel p1=new JPanel();
	JPanel p2=new JPanel();
	
	Container c=getContentPane();
	c.setLayout(null);
	c.add(p1);
	c.add(p2);
	p1.setOpaque(false);
	p2.setOpaque(false);

	setSize(400,500);
	setResizable(false);
	
	java.awt.Dimension screen=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	java.awt.Rectangle frame=getBounds();
	this.setLocation((screen.width-frame.width)/2,(screen.height-frame.height)/2);

	p1.setBounds(0,20,500,500);
	
	
	l.setBounds(70,10,200,30);

	p1.setLayout(null);
	
	p1.add(l);
	
	b1.setBounds(100,130,180,30);
	b3.setBounds(20,400, 80, 30);
        b1.setBackground(Color.WHITE);
        b1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        b3.setBackground(Color.WHITE);
        b3.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
      
	
	
	p1.setLayout(null);
	p1.add(b1);
	//p1.add(b2);
	p1.add(b3);
	b1.addActionListener(this);
	//b2.addActionListener(this);
	b3.addActionListener(this);
	
	}
      //  @Override
	public void actionPerformed(ActionEvent ae)
	{
            JButton b = (JButton)ae.getSource();
            if(b == b1){        //login
                 
                 try{
                new SnapshotCreate();//.setVisible(true);
                 }
                 catch(UnsupportedOperationException use){
                     use.printStackTrace();
                 } 
            }
        /*    else if(b == b2){                       //create
                b2.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                       Login ob1=new Login();
		ob1.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
			ob1.show();
                    }
                    
                });
                
            }*/
            else if(b == b3){                       //help
                b3.addActionListener(new ActionListener(){
                    @Override
                    public void actionPerformed(ActionEvent e) {
                        try{
                            new PassByopHelp().show();
                        }
                        catch(Exception ex){
                            
                        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                        }
                    }
                    
                });
            }
	}
    }/**
 *
 * @author Lenovo
 */
public class PassSignin {
   // public static void main(String ar[])
    PassSignin()
	{
	  System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
	Login3 ob1=new Login3();
		ob1.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				System.exit(0);
			}
		});
			ob1.show();
	}
    
}
