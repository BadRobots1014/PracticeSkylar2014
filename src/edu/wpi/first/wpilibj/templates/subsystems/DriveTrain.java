/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.subsystems;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.SpeedController;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.templates.RobotMap;
import edu.wpi.first.wpilibj.templates.commands.CommandBase;
import edu.wpi.first.wpilibj.templates.subsystems.interfaces.*;
/**
 *
 * @author Manu S.
 */
public class DriveTrain implements IDriveTrain
{
    protected SpeedController frontRight;
    protected SpeedController frontLeft;
    protected SpeedController backRight;
    protected SpeedController backLeft;
    RobotDrive train;

    private static DriveTrain instance;
    
    public DriveTrain()
    {
        
    }
    
    public static DriveTrain getInstance() 
    {
        if(instance == null)
        {
            instance = new DriveTrain();
        }
        return instance;
    }
    
    public void initialize()
    {
        frontRight = new Talon(RobotMap.frontRight);
        frontLeft = new Talon(RobotMap.frontLeft);
        backRight = new Talon(RobotMap.backRight);
        backLeft = new Talon(RobotMap.backLeft);
        
        train = new RobotDrive(frontRight, frontLeft, backRight, backLeft);
    }
    
    public void drive(double rightDrive, double leftDrive)
    {
        train.tankDrive(leftDrive, rightDrive);
    }

    protected void initDefaultCommand() 
    {
        
    }

}
