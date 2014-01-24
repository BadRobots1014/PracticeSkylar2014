/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems;

import com.practiceRobot.interfaces.Logger;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author Manu S.
 */
public abstract class BadSubsystem extends Subsystem implements Logger
{
    protected BadSubsystem()
    {
        initialize();
    }
    
    protected abstract void initialize();
    
    public abstract String getConsoleIdentity();
    
    public void log(String out)
    {
        System.out.println(getConsoleIdentity() + ":" + out);
    }
    
}
