package org.usfirst.frc.team4561.robot.commands;

import org.usfirst.frc.team4561.robot.Robot;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class LeftRollerBackwards extends Command {

    public LeftRollerBackwards() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(Robot.LeftRoller);
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	setTimeout(.25); //.125
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	Robot.LeftRoller.setMotorPower(-1);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return isTimedOut();
    }

    // Called once after isFinished returns true
    protected void end() {
    	Robot.LeftRoller.setMotorPower(0);
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    	end();
    }
}
