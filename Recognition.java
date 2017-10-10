
package passbyop;

import java.io.IOException;


public class Recognition {
    int z;

    Recognition()
    {
    
       String dir = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\PassByop\\Images\\";
       String file = "C:\\Users\\Lenovo\\Documents\\NetBeansProjects\\PassByop\\camera.jpg";

     try {
       EigenFaceCreator creator = new EigenFaceCreator();

      // creator.USE_CACHE = -1;
       System.out.println("Constructing face-spaces from "+dir+" ...");
       creator.readFaceBundles(dir);

       System.out.println("Comparing "+file+" ...");
       String result = creator.checkAgainst(file);

       System.out.println("Most closly resembling: "+result+" with "+creator.DISTANCE+" distance.");
       
       if(creator.DISTANCE!=0.0 || "camera.jpg".equals(result) )
       {
           System.out.println("Image not found");
           z=0;
           try{
                new TestFaceRecognition1();//.setVisible(true);
               
           }   catch(UnsupportedOperationException use){
                     use.printStackTrace();
                 } 
       }
       else //if(creator.DISTANCE==0.0 )
       {
        System.out.println("Image Found");
        z=1;
         try{
                String[] command = {"cmd.exe", "/C", "Start", "C:\\Users\\Lenovo\\Desktop\\proj\\ishani\\locker.bat"};
            Process p =  Runtime.getRuntime().exec(command);      
                 }
                catch (IOException ex) {
               }
                 catch(UnsupportedOperationException use){
                     use.printStackTrace();
                 } 
     }
     } catch (IOException | IllegalArgumentException | ClassNotFoundException e) { e.printStackTrace(); }
}

   static void prUsage() {
       System.err.println("Usage: java TestFaceRecognition <directory of training images> <image to test against>");
   }

   //public boolean setResult()
  int faceMatch(){
      return z;
  }
  }  

