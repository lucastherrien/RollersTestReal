/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4561.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import org.usfirst.frc.team4561.robot.commands.*;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	private static Joystick leftStick = new Joystick (RobotMap.LEFT_JOYSTICK_PORT);
	private static Joystick rightStick = new Joystick (RobotMap.RIGHT_JOYSTICK_PORT);
	private static JoystickButton intake = new JoystickButton(rightStick, RobotMap.INTAKE_BUTTON);
	private static JoystickButton release = new JoystickButton(rightStick, RobotMap.RELEASE_BUTTON);
	private static JoystickButton rightIntake = new JoystickButton(rightStick, RobotMap.RIGHT_ROLLER_BACKWARDS_BUTTON);
	private static JoystickButton leftIntake = new JoystickButton(rightStick, RobotMap.LEFT_ROLLER_BACKWARDS_BUTTON);
	private static JoystickButton touring = new JoystickButton(rightStick, RobotMap.TOURING_BUTTON);
	
	public OI() {
		intake.whileHeld(new SquareWaveRollerControl());
		release.whileHeld(new RELEASE());
		rightIntake.whileHeld(new RightRollerBackwards2());
		leftIntake.whileHeld(new LeftRollerBackwards2());
		touring.whenPressed(new TouringMode());
	}


	public double getRightStickY() {
		
		double rightStickY = rightStick.getY(); 
		
		return rightStickY;
		
	}
	
	public double getRightStickX() {
		
		double rightStickX = rightStick.getX(); 
		
		return rightStickX;
		
	}
	
	public double getLeftStickY() {
		
		double leftStickY = leftStick.getY(); 
		
		return leftStickY;
		
	}
	
public double getLeftStickX() {
		
		double leftStickX = leftStick.getX(); 
		
		return leftStickX;
		
	}

	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
}
