/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems;

import com.practiceRobot.RobotMap;
import com.practiceRobot.subsystems.interfaces.IArticulateShooter;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 * Controls the movement of the Shooter subsystem, up or down. 
 * @author Manu S. 
 */
public class ArticulateShooter extends BadSubsystem implements IArticulateShooter 
{
    private SpeedController winch;
    
    private static ArticulateShooter instance;
    public ArticulateShooter getInstance()
    {
        if(instance == null)
        {
            instance = new ArticulateShooter();
        }
        
        return instance;
    }
    
    public ArticulateShooter()
    {
        winch = new Talon(RobotMap.winchPort);
    }
    
    protected void initialize() 
    {
    }

    /**
     * Gets the console identity of this, which is 
     * generally the class name.
     * @return the class name.
     */
    public String getConsoleIdentity() 
    {
        return "ArticulateShooter";
    }

    protected void initDefaultCommand() 
    {
    }

    /**
     * Lifts the shooter up.
     */
    public void raiseShooter() 
    {
        winch.set(.3);
    }

    /**
     * Lowers the shooter quickly.
     */
    public void lowerShooter() 
    {
        winch.set(-1);
    }

    /**
     * Moves the winch at the specified speed.
     * Positive for up, and negative for down.
     * @param speed the speed we want the winch to
     * move at between -1.0 and 1.0
     */
    public void moveShooter(double speed) 
    {
        winch.set(speed);
    }
    
}
