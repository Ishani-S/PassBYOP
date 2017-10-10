
package passbyop;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
import java.nio.channels.FileChannel;
import java.nio.channels.FileLock;


public class PassByop {
    int k;
    int testImages(){
        
	  File f = new File("C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\PassByop\\Images\\camera1.jpg");

	  if(f.exists()){
		  System.out.println("File exists!");
                  k=1;
                  
	  }
          else{
		  System.out.println("File not found!");
                  k=0;
	  }
          return k;

}
    public static void main(String args[]) throws IOException
    {
        PassByop p=new PassByop();
        int l = p.testImages();
        
        if(l==1)
        {
            
            try{
                new PassSignin();
                }
                 catch(UnsupportedOperationException use){
                     use.printStackTrace();
                 } 
        }
        else
        {
           try{
               
                new PassByopLogin();
                                     
                 }
                 catch(UnsupportedOperationException use){
                     use.printStackTrace();
                 } 
        }
    }
    
    int returnMatch()
    {
        Recognition r = new Recognition();
        int l = r.faceMatch();
        System.out.println(l);
        return l;
    }
    
}

