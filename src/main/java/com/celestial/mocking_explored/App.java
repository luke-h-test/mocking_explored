/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial.mocking_explored;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author selvy
 */
public class App
{
    public static void main( String[] args )
    {
        Iterable<String> lines = loadFile();
        
        lines.forEach((element) ->{
            System.out.println(element);
        });
    }
    
    public  static  Iterable<String>  loadFile()
    {
        FileReader fr = null;
        ArrayList<String> lines = new ArrayList<>();
        try
        {
            String fileName = "C:\\tmp\\KeyboardHandler.java.txt";
            File file = new File(fileName);
            fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            String line;
            while((line = br.readLine()) != null)
            {
                //process the line
                lines.add(line);
            }       
        } catch (IOException ex)
        {
            Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
        } 
        finally
        {
            try
            {
                fr.close();
            } catch (IOException ex)
            {
                Logger.getLogger(App.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        return lines;
    }
}
