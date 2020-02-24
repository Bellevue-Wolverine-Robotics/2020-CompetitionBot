package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class JamFixSubsystem extends SubsystemBase {

	private final WPI_TalonSRX motor = new WPI_TalonSRX(JAM_FIX_MOTOR);

	public JamFixSubsystem() {
		this.motor.setInverted(true);
	}

	public void startFix() {
		this.motor.set(-0.5);
	}

	public void stopFix() {
		this.motor.set(0.0);
	}

}
