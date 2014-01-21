/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.wpi.first.wpilibj.templates.commands;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 * @author rsinghal
 */
public class DriveCommand extends CommandBase
{

    public DriveCommand()
    {
        requires((Subsystem) driveTrain);
    }
    
    protected void initialize() 
    {
        
    }

    protected void execute() 
    {
        driveTrain.drive(rightDrive, leftDrive);
    }

    protected boolean isFinished() 
    {
        return false;
    }

    protected void end() 
    {
        
    }

    protected void interrupted() 
    {
        
    }
    
}
