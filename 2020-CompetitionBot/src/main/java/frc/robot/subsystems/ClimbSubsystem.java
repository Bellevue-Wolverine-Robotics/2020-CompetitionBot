package frc.robot.subsystems;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ClimbSubsystem extends SubsystemBase {

	private final DoubleSolenoid climbSolenoid = new DoubleSolenoid(CLIMB_DEPLOY, CLIMB_RETRACT);

	public ClimbSubsystem() {
		this.climbSolenoid.set(DoubleSolenoid.Value.kReverse);
	}

    public void toggleClimbDeploy() {
        if (this.climbSolenoid.get() == DoubleSolenoid.Value.kForward) {
            this.climbSolenoid.set(DoubleSolenoid.Value.kReverse);
        } else {
            this.climbSolenoid.set(DoubleSolenoid.Value.kForward);
        }
    }

    public void stopClimbDeploy() {
        this.climbSolenoid.set(DoubleSolenoid.Value.kOff);
	}
	
}
