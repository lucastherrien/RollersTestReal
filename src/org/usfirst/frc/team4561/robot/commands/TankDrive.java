package org.usfirst.frc.team4561.robot.commands;

import org.usfirst.frc.team4561.robot.Robot;
import org.usfirst.frc.team4561.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Command;

public class TankDrive extends Command {

	public TankDrive(){
		requires(Robot.DriveTrain);
	}
	@Override
	protected boolean isFinished() {
		// TODO Auto-generated method stub
		return false;
	}
	
	protected void execute(){
		if(RobotMap.TOURING_MODE == true){
			Robot.DriveTrain.arcadeDrive(Robot.oi.getLeftStickY()*.5, Robot.oi.getRightStickY()*.5);
		}
		Robot.DriveTrain.tankDrive(Robot.oi.getLeftStickY(), Robot.oi.getRightStickY());
	}
	
	protected void stop(){
		Robot.DriveTrain.tankDrive(0, 0);
	}

}
