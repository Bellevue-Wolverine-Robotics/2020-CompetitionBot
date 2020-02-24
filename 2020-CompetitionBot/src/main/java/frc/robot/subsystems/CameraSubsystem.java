package frc.robot.subsystems;

import static frc.robot.Constants.*;

import edu.wpi.cscore.UsbCamera;
import edu.wpi.first.cameraserver.CameraServer;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CameraSubsystem extends SubsystemBase {

	private UsbCamera intakeCamera = CameraServer.getInstance().startAutomaticCapture(0);
	private UsbCamera shooterCamera = CameraServer.getInstance().startAutomaticCapture(1);

	public CameraSubsystem() {
		this.intakeCamera.setResolution(320,480);
		this.intakeCamera.setFPS(20);
		this.shooterCamera.setResolution(320,480);
		this.shooterCamera.setFPS(20);

		Shuffleboard.getTab(TAB_KEY)
			.add(INTAKE_CAMERA_KEY, this.intakeCamera);
		Shuffleboard.getTab(TAB_KEY)
			.add(SHOOTER_CAMERA_KEY, this.shooterCamera);
	}

	public UsbCamera getIntakeCamera() {
		return this.intakeCamera;
	}
	public UsbCamera getShooterCamera() {
		return this.shooterCamera;
	}

}
