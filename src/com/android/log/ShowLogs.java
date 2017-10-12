/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.android.log;
import com.android.ui.AndroidLoging;
import com.android.ui.LogAnalysis;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
/**
 *
 * @author c_vivk
 */
public class ShowLogs {

          FileReader fr;    
          BufferedReader br;    

    public ShowLogs() throws FileNotFoundException, IOException {
       // this.fr = new FileReader("D:\\testout.txt");
        //this.br = new BufferedReader(fr);
       
        
    }
    public static String mainLog(){
              return null;
       /*            
        BufferedReader br;
        StringBuilder sb = null;
         String str = null;
              try {
                  br = new BufferedReader(new FileReader("C:\\Repository\\WeeklyReport.txt"));
                  str = br.readLine();
                  while(str != null){
                      sb.append(str);
                      str = br.readLine();
                  }
                  
              } catch (FileNotFoundException ex) {
                  Logger.getLogger(ShowLogs.class.getName()).log(Level.SEVERE, null, ex);
              } catch (IOException ex) {
                  Logger.getLogger(ShowLogs.class.getName()).log(Level.SEVERE, null, ex);
              }
       
             
             return String.valueOf(sb);
             */
    }
  
}
