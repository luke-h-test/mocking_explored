/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.celestial.mocking_explored;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;


/**
 *
 * @author selvy
 */
public class DataLoaderTest
{
    @Test
    public void test_count_chars_in_DataSource_no_mocking()
    {
        // arrange
        TextFileSource tfl = new TextFileSource();        
        String fname = "C:\\tmp\\KeyboardHandler.java.txt";
        DataLoader dl = new DataLoader(tfl);
        long expected = 1383;
        
        // act
        long result = dl.loadData(fname);
        
        // assert
        assertEquals( expected, result );
    }
    
    @Test
    public void test_whats_the_problem_we_are_trying_to_solve()
    {
        class B
        {
            int doSomething(int x, int y){ return x + y;}
        }
        class A
        {
            B b = new B();
            
            int doSomething(int x, int y, int z)
            {
                return b.doSomething(x, y) + z;
            }
        }
        // arrange
        // In order to run this test A must create an instance of B
        // this is tightly coupled code.  If B were accessing the file system
        // to load a file and that file was not there, the test would fail
        A cut = new A();
        int x = 3;
        int y = 6;
        int z = 9;
        int expected = 18;
        
        // act
        int result = cut.doSomething(x, y, z);
        
        // assert
        assertEquals(expected, result);
    }
}
