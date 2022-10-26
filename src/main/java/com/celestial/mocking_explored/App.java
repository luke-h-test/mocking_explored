/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial.mocking_explored;

/**
 *
 * @author selvy
 */
public class App
{
    public static void main( String[] args )
    {
        TextFileLoader tfl = new TextFileLoader();
        Iterable<String> lines = tfl.loadFile("C:\\tmp\\KeyboardHandler.java.txt");
        
        lines.forEach((element) ->{
            System.out.println(element);
        });
    }
    
}
