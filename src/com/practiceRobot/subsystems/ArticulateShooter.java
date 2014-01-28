/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems;

import com.practiceRobot.subsystems.interfaces.IArticulateShooter;

/**
 *
 * @author rsinghal
 */
public class ArticulateShooter extends BadSubsystem implements IArticulateShooter {

    protected void initialize() 
    {
    }

    public String getConsoleIdentity() 
    {
        return "ArticulateShooter";
    }

    protected void initDefaultCommand() 
    {
    }

    public void raiseShooter() {
    }

    public void lowerShooter() {
    }
    
}
