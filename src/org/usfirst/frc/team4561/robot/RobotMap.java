/*----------------------------------------------------------------------------*/
/* Copyright (c) 2017-2018 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package org.usfirst.frc.team4561.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */



public class RobotMap {
	
	//Joystick Ports
	public static final int LEFT_JOYSTICK_PORT = 0;
	public static final int RIGHT_JOYSTICK_PORT = 1;
	
	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;
	
	//Left Motor Ports
	public static final int FRONT_LEFT_MOTOR_PORT = 7;
	public static final int MID_LEFT_MOTOR_PORT = 8;
	public static final int BACK_LEFT_MOTOR_PORT = 3;
	
	//Right Motor Ports
	public static final int FRONT_RIGHT_MOTOR_PORT = 4;
	public static final int MID_RIGHT_MOTOR_PORT = 5;
	public static final int BACK_RIGHT_MOTOR_PORT = 6;
	
	public static final int LEFT_ROLLER_PORT = 2;
	public static final int RIGHT_ROLLER_PORT = 1;
	
	//Transmission Motor Ports
	public static final int TRANSMISSION_SPEED_BUTTON = 6;
	public static final int TRANSMISSION_TORQUE_BUTTON = 4;
	
	//roller buttons
	public static final int RELEASE_BUTTON = 3;
	public static final int INTAKE_BUTTON = 5;
	public static final int RIGHT_ROLLER_BACKWARDS_BUTTON = 4;
	public static final int LEFT_ROLLER_BACKWARDS_BUTTON = 6;
	
	public static final int STOP_ROLLERS_BUTTON = 2;
	
	//Drive Mode 
	public static final int DRIVE_MODE = 0; // 1 is arcade drive, 0 is tank drive

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
