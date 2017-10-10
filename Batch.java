/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package passbyop;

import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Batch {
   public static void main(String args[]) throws IOException{
     try {
            String[] command = {"cmd.exe", "/C", "Start", "C:\\Users\\Lenovo\\Desktop\\proj\\ishani\\locker.bat"};
            Process p =  Runtime.getRuntime().exec(command);           
        } catch (IOException ex) {
        }
   }
    
}
