package frc.robot.subsystems;

import com.revrobotics.ColorSensorV3;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj.I2C;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj.shuffleboard.WidgetType;
import edu.wpi.first.wpilibj.util.Color;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Control Panel subsystem that controls the color sensor, linear actuator, and rotator wheels.
 */
public class ControlPanelSubsystem extends SubsystemBase {

	/**
	 * The speed of the motors controlling the wheels.
	 */
	private static final double MOTOR_SPEED = 0.0;

	/**
	 * The gear reduction for the motors controlling the wheels
	 */
	private static final double GEAR_REDUCTION = 1.0;

	private final ColorSensorV3 colorSensor = new ColorSensorV3(I2C.Port.kOnboard);

	public ControlPanelSubsystem() {
		
	}

	@Override
	public void periodic() {

	}

	public void extendWheels() {
		throw new UnsupportedOperationException();
	}

	public void retractWheels() {
		throw new UnsupportedOperationException();
	}

	public boolean areWheelsExtended() {
		throw new UnsupportedOperationException();
	}

	public void startWheels() {
		this.setWheels(MOTOR_SPEED * GEAR_REDUCTION);
	}

	public void stopWheels() {
		this.setWheels(0.0);
	}

	private void setWheels(double speed) {
		throw new UnsupportedOperationException();
	}

	public int getTargetRotations() {
		return 3;
	}

	public Color getTargetColor() {
		throw new UnsupportedOperationException();
	}

	public Color getSensorColor() {
		return this.colorSensor.getColor();
	}

}
