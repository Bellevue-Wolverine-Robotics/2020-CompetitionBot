package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {

    //private final WPI_TalonSRX intakeMotor = new WPI_TalonSRX(INTAKE_MOTOR);

    private final DoubleSolenoid intakeSolenoid = new DoubleSolenoid(INTAKE_DEPLOY, INTAKE_RETRACT);

    public IntakeSubsystem() {
        this.intakeSolenoid.set(DoubleSolenoid.Value.kForward);
    }

    public void toggleIntakeDeploy() {
        if (this.intakeSolenoid.get() == DoubleSolenoid.Value.kForward) {
            this.intakeSolenoid.set(DoubleSolenoid.Value.kReverse);
        } else {
            this.intakeSolenoid.set(DoubleSolenoid.Value.kForward);
        }
    }

    public void stopIntakeDeploy() {
        this.intakeSolenoid.set(DoubleSolenoid.Value.kOff);
    }

    public void startIntake() {
        //this.intakeMotor.set(0.1);
    }

    public void stopIntake() {
        //this.intakeMotor.set(0.0);
    }

}
