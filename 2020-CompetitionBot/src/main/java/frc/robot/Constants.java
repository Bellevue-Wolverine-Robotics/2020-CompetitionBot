package frc.robot;

public final class Constants {
	/*
	 * User Interface (Joysticks and Buttons)
	 */
	public static final int DRIVE_HID = 0;
	public static final int OPERATOR_HID = 1;

	public static final int TOGGLE_INTAKE_BUTTON = -1;
	public static final int INTAKE_BUTTON = -1;
	
	public static final int MOVE_CONVEYOR_BUTTON = -1;
	
	public static final int SHOOT_BUTTON = 1;

	public static final int TOGGLE_CLIMB_BUTTON = -1;

	public static final int CONTROL_PANEL_ROTATE_TO_COLOR_BUTTON = -1;
	public static final int CONTROL_PANEL_FULL_ROTATION_BUTTON = -1;

	/*
	 * Pneumatic Ports
	 */
	public static final int INTAKE_DEPLOY_LEFT = 0;
	public static final int INTAKE_RETRACT_LEFT = 1;

	public static final int INTAKE_DEPLOY_RIGHT = 2;
	public static final int INTAKE_RETRACT_RIGHT = 3;

	public static final int CLIMB_DEPLOY = 6;
	public static final int CLIMB_RETRACT = 7;

	/*
	 * CAN IDs
	 */
	public static final int LEFT_FRONT_DRIVE_MOTOR = 12;
	public static final int LEFT_BACK_DRIVE_MOTOR = 13;
	public static final int RIGHT_BACK_DRIVE_MOTOR = 14;
	public static final int RIGHT_FRONT_DRIVE_MOTOR = 15;
	public static final int SHOOT_MOTOR = 16;
	public static final int CONVEYOR_MOTOR = 17;
	public static final int INTAKE_MOTOR = 18;

}
