/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.android.log;

import static com.android.log.CaptureLog.log_dir;
import com.android.ui.Home;
import com.sun.javafx.binding.Logging;
import java.io.IOException;
import java.io.InputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author c_vivk
 */
public class CaptureLog {

    InputStream is = null;
    Process rt;
    public static final String log_dir = "/sdcard/qlog/";
    public static final String log_pull_dir = " C://bugs/";
    public static final String rm_dir = "adb shell rm -rf "+log_dir;
    public static final String mk_dir = "adb shell mkdir "+log_dir;
    
    public CaptureLog() {
        try {
            
        Runtime.getRuntime().exec(rm_dir);
        Runtime.getRuntime().exec(mk_dir);
        
        } catch (IOException ex) {
            Logger.getLogger(CaptureLog.class.getName()).log(Level.SEVERE, null, ex);
        }catch(RuntimeException re){
            Logger.getLogger(CaptureLog.class.getName()).log(Level.SEVERE, null, re);
        }
        
        if(Home.all_log){
            new LoggingThread("events").start();
            new LoggingThread("main").start();
            new LoggingThread("system").start();
            new LoggingThread("crash").start();
        }
        else if(Home.main_log){
            new LoggingThread("main").start();
        }
        else if(Home.events_log){
            new LoggingThread("events").start();
        }
        else if(Home.system_log){
            new LoggingThread("system").start();
        }
        else if(Home.crash_log){
            new LoggingThread("crash").start();
        }
        else if(Home.kernel_log){
            new LoggingThread("kernel").start();
        }
        else 
            new LoggingThread(("No log type selected")).start();
        
    }

   
}

class LoggingThread extends Thread{
    String log_name;
    LoggingThread(String log_nm){
        this.log_name = log_nm;
    }
    public void run(){
        try {
            System.out.println("Loging started....."+" \n"
                    + "all    = "+Home.all_log+" \n"
                    + "main   = "+Home.main_log+" \n"
                    + "events = "+Home.events_log+" \n"
                    + "system = "+Home.system_log+" \n"
                    + "crash  = "+Home.crash_log+" \n"
                    + "kernel = "+Home.kernel_log);
            if(log_name.contains("kernel")){
                Runtime.getRuntime().exec("adb shell dmesg " +  " > "+ log_dir + log_name+".txt");
            }
            else{
            Runtime.getRuntime().exec("adb shell logcat -b "+log_name +">"+ log_dir + log_name+".txt");
            }
        } catch (IOException ex) {
            Logger.getLogger(LoggingThread.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
