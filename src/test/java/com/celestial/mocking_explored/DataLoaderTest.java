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
    
}
