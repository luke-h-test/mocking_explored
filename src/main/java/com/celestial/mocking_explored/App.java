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
        TextFileLoader tfl = new TextFileLoader();
        
        // We create a lambda expression to do the work in the TextFileLoader
        ICollectionLoader<ArrayList<String>> functor = (c, l) -> {
            c.add(l);
            return c;
        };
        
        Iterable<String> lines = tfl.loadFile("C:\\tmp\\KeyboardHandler.java.txt", functor);
        
        lines.forEach((element) ->{
            System.out.println(">> " + element);
        });
    }
    
}
