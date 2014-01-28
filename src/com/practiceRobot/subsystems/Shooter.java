/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems;

import com.practiceRobot.subsystems.interfaces.IShooter;

/**
 *
 * @author Manu S.
 */
public class Shooter extends BadSubsystem implements IShooter
{

    private static Shooter instance;
    
    public Shooter getInstance()
    {
        if(instance == null)
        {
            instance = new Shooter();
        }
        
        return instance;
    }
    
    protected void initialize() 
    {
    }

    public String getConsoleIdentity() 
    {
        return "Shooter";
    }

    protected void initDefaultCommand() 
    {
    }
    
}
