/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passbyop;

        import java.awt.*;
	import java.awt.event.*;
	import java.sql.*;
        import javax.swing.*;
	import javax.swing.JPasswordField.*;
        import javax.swing.event.*;
        import org.opencv.core.Core;

	class Login extends JFrame implements ActionListener
	{
	JLabel l1,l2;
	JTextField t1,t2;
	JButton b1,b2;

	Login()
	{
	super("User Details");
        
        setLayout(new BorderLayout());
	setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\proj\\Final_bg.png")));
	setLayout(new FlowLayout());

       
	l1=new JLabel(" User Name : ");
	l2=new JLabel(" E-mail : ");
        l1.setFont(new Font("Calibri",Font.BOLD,18));
	l1.setForeground(Color.white);
	l2.setFont(new Font("Calibri",Font.BOLD,18));
	l2.setForeground(Color.white);
	

	t1=new JTextField(25);
	t2=new JTextField(25);
	 
        b1=new JButton(" Create Password ");
	b2=new JButton(" Cancel ");

        JPanel p1=new JPanel();
	JPanel p2=new JPanel();
        
	Container c=getContentPane();
	c.setLayout(null);
	c.add(p1);
        p1.setOpaque(false);
	c.add(p2);
        p2.setOpaque(false);

	setSize(400,500);
	setResizable(false);
	
	java.awt.Dimension screen=java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	java.awt.Rectangle frame=getBounds();
	this.setLocation((screen.width-frame.width)/2,(screen.height-frame.height)/2);
        
        p1.setBounds(20,20,300,300);
	p2.setBounds(20,350,300,100);
	
	l1.setBounds(40,80,100,30);
	t1.setBounds(180,80,100,30);

	l2.setBounds(40,160,100,30);
	t2.setBounds(180,160,100,30);

	p1.setLayout(null);
	
	p1.add(l1);p1.add(t1);
	p1.add(l2);p1.add(t2);

	b1.setBounds(50,40,150,30);
	b2.setBounds(220,40,80,30);
	b1.setBackground(Color.WHITE);
        b1.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        b2.setBackground(Color.WHITE);
        b2.setBorder(BorderFactory.createLineBorder(Color.GRAY, 2));
        
	t1.setFont(new Font("Times New Roman",Font.BOLD/Font.ITALIC,18));
	t2.setFont(new Font("Times New Roman",Font.BOLD/Font.ITALIC,18));

	p2.setLayout(null);
	p2.add(b1);p2.add(b2);

	b1.addActionListener(this);
	b2.addActionListener(this);

}

	public void actionPerformed(ActionEvent ae)
	{
	JButton b=(JButton)ae.getSource();
	if(b==b1)
	{
	 String s1=t1.getText();
	 String s2=t2.getText();
        
        b1.addActionListener(new ActionListener() { 

             @Override
             public void actionPerformed(ActionEvent e) {
                 try{
                 new Snapshot16();//.setVisible(true);
                 }
                 catch(UnsupportedOperationException use){
                     use.printStackTrace();
                 }
//                 throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                 
             }
        
});
        
	}

		if(b==b2)
		{
			System.exit(0);
		}
	}
}


	public class PassByopCreate 
	{
	//public static void main(String ar[])
	{
            System.loadLibrary(Core.NATIVE_LIBRARY_NAME);
		
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
}


