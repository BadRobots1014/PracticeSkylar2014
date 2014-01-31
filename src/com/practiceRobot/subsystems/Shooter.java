/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.practiceRobot.subsystems;

import com.practiceRobot.RobotMap;
import com.practiceRobot.subsystems.interfaces.IShooter;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;

/**
 *
 * @author Manu S.
 */
public class Shooter extends BadSubsystem implements IShooter
{
    private SpeedController controller;
    private static Shooter instance;
    
    public Shooter getInstance()
    {
        if(instance == null)
        {
            instance = new Shooter();
        }
        
        return instance;
    }
    
    private Shooter()
    {
        controller = new Talon(RobotMap.shooterSpeedPort);
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

    public void setSpeed(double speed) 
    {
        controller.set(speed);
    }
    
}
