package org.usfirst.frc.team4561.robot.commands;

import org.usfirst.frc.team4561.robot.Robot;
import org.usfirst.frc.team4561.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class ArcadeDrive extends Command {
	
	public ArcadeDrive() {
		requires(Robot.DriveTrain);
	}
	
	protected void execute() {
		if(RobotMap.TOURING_MODE == true){
			Robot.DriveTrain.arcadeDrive(Robot.oi.getLeftStickX()*.5, Robot.oi.getRightStickY()*.5);
		}
		else{
			Robot.DriveTrain.arcadeDrive(Robot.oi.getRightStickY(), Robot.oi.getLeftStickX());
		}
	}	  
	  
	protected void initialize() {}
	  
	protected void end() {}
	  
	protected void interrupted() {
		end();
	}
    
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}

}
