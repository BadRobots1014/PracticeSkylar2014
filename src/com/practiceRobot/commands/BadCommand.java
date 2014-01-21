/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.commands;

import com.practiceRobot.OI;

/**
 *
 * @author Steve
 */
public abstract class BadCommand extends CommandBase
{
    protected static final boolean CONSOLE_OUTPUT_ENABLED = true;
    
    protected BadCommand()
    {
        
    }
    
    /**
     * Subclasses should implement their own implementations on initialize. This
     * method is meant to instantiate any hardware or variables that will be 
     * needed. This is specific to each class and can be left blank.
     */
    protected abstract void initialize();
        
    public void log(String str) 
    {
        if (CONSOLE_OUTPUT_ENABLED && OI.CONSOLE_OUTPUT_ENABLED) 
        {
            System.out.println(getConsoleIdentity()+": "+str);
        }
    }
    
    public abstract String getConsoleIdentity();
    
}