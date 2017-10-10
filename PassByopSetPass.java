
package passbyop;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import org.opencv.core.Core;

class Login2 extends JFrame implements ActionListener
{
	
	JButton b1,b2,b3;

	Login2()
	{
	super("Setting Password");

        /*setLayout(new BorderLayout());
        setContentPane(new JLabel(new ImageIcon("C:\\Users\\Lenovo\\Desktop\\proj\\bk9.jpg")));
        setLayout(new FlowLayout());*/
	
	b1=new JButton(" Done ");
	b2=new JButton(" Retry ");
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
	
	p1.setLayout(null);
	
	b1.setBounds(100,130,180,30);
	b2.setBounds(100,200,180,30);
	b3.setBounds(20,400, 80, 30);
	
	p1.setLayout(null);
	p1.add(b1);
	p1.add(b2);
	p1.add(b3);
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
	
	}
	public void actionPerformed(ActionEvent ae)
	{
		JButton b=(JButton)ae.getSource();
		 if(b==b1)
		{
			 JOptionPane.showMessageDialog(b, "Password Created Successfully!");
		}
                 else if(b==b2){
                     
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
                 else if(b==b3){
                     b3.addActionListener(new ActionListener(){
                         @Override
                         public void actionPerformed(ActionEvent e) {
                            try{
                                new PassByopHelp().show();
                            }
                            catch(Exception exe){
                             throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                            }
                         }
                         
                     });
                 }
		
	}
	}
public class PassByopSetPass {
//	public static void main(String ar[])
	{
		
	Login2 ob1=new Login2();
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
