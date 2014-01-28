/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems;


import com.practiceRobot.subsystems.interfaces.Logger;
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
    
    /**
     * Subsystems should overwrite this method. 
     * This is used to instantiate any hardware. 
     * Specific to each class.
     */
    protected abstract void initialize();
    
    /**
     * @return whatever string you want. Probably gonna be
     * the name of the class that calls this.
     */
    public abstract String getConsoleIdentity();
    
    /**
     * Print stuff into the console. The getConsoleIdentity()
     * will probably return the name of the class that is
     * calling this.
     * @param out whatever you want to say
     */
    public void log(String out)
    {
        System.out.println(getConsoleIdentity() + ":" + out);
    }
    
}
