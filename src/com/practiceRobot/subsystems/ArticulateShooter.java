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
 *
 * @author rsinghal
 */
public class ArticulateShooter extends BadSubsystem implements IArticulateShooter 
{

    private SpeedController winch;
    
    private static ArticulateShooter instance;
    public ArticulateShooter getInstance()
    {
        if(instance == null)
            instance = new ArticulateShooter();
        
        return instance;
    }
    
    public ArticulateShooter()
    {
        winch = new Talon(RobotMap.winchPort);
    }
    
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

    public void raiseShooter() 
    {
        winch.set(.3);
    }

    public void lowerShooter() 
    {
        winch.set(-1);
    }

    public void moveShooter(double speed) 
    {
        winch.set(speed);
    }
    
}
