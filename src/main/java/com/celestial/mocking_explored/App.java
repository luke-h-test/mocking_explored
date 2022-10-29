/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial.mocking_explored;

import java.util.ArrayList;

/**
 *
 * @author selvy
 */
public class App
{
    public static void main( String[] args )
    {
        TextFileSource tfl = new TextFileSource();
        
        // We create a lambda expression to do the work in the TextFileLoader
        ICollectionLoader<ArrayList<String>> functor = (c, l) -> {
            c.add(l);
            return c;
        };
        
        String fname = "C:\\tmp\\KeyboardHandler.java.txt";
        
        Iterable<String> lines = tfl.loadData(fname, functor);
        
        lines.forEach((element) ->{
            System.out.println(">> " + element);
        });
        
        // Example using the DataLoader
        
        BasicDataProcessor dl = new BasicDataProcessor(tfl);
        long noOfChars = dl.loadData(fname);
        
        System.out.println( "No of characters in the file are: " + noOfChars );
    }
    
}
