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
public class DataLoader
{
    private final IDataSource dataSource;
    
    public  DataLoader( IDataSource ds )
    {
        dataSource = ds;
    }
    
    public  long    loadData(String fname)
    {
        var data = dataSource.loadData(fname);
        long count = 0;
        for( var datum : data )
        {
            count += datum.length();
        }
        
        return count;
    }
}
