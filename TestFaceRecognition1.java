package passbyop;

import java.io.IOException;
import javax.swing.JOptionPane;
import javax.swing.*;
import javax.swing.JFrame;
import java.awt.*;


public class TestFaceRecognition1 extends JFrame {
    TestFaceRecognition1(){
      Panel panel;
        JLabel label;
    
   
    // Set frame properties
    setTitle("Try again"); // Set the title
    setSize(250,150); // Set size to the frame
    setLayout(new FlowLayout()); // Set the layout
    setVisible(true); // Make the frame visible
    setLocationRelativeTo(null);  // Center the frame
   
    // Create the panel
    panel=new Panel();
   label=new JLabel("Unauthenticated User!");
 
   panel.add(label);
    
 
    add(panel);
   
    }
    
}
