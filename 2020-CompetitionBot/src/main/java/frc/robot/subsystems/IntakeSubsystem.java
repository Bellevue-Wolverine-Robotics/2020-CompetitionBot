package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class IntakeSubsystem extends SubsystemBase {

    private final WPI_TalonSRX intakeMotor = new WPI_TalonSRX(INTAKE_MOTOR);

    private final DoubleSolenoid intakeSolenoidLeft = new DoubleSolenoid(INTAKE_DEPLOY_LEFT, INTAKE_RETRACT_LEFT);
    private final DoubleSolenoid intakeSolenoidRight = new DoubleSolenoid(INTAKE_DEPLOY_RIGHT, INTAKE_RETRACT_RIGHT);

    public IntakeSubsystem() {
        this.intakeSolenoidLeft.set(DoubleSolenoid.Value.kForward);
        this.intakeSolenoidRight.set(DoubleSolenoid.Value.kForward);
    }

    public void toggleIntakeDeploy() {
        if (this.intakeSolenoidLeft.get() == DoubleSolenoid.Value.kForward) {
            this.intakeSolenoidLeft.set(DoubleSolenoid.Value.kReverse);
            this.intakeSolenoidRight.set(DoubleSolenoid.Value.kReverse);
        } else {
            this.intakeSolenoidLeft.set(DoubleSolenoid.Value.kForward);
            this.intakeSolenoidRight.set(DoubleSolenoid.Value.kForward);
        }
    }

    public void stopIntakeDeploy() {
        this.intakeSolenoidLeft.set(DoubleSolenoid.Value.kOff);
        this.intakeSolenoidRight.set(DoubleSolenoid.Value.kOff);
    }

    public void startIntake() {
        this.intakeMotor.set(0.1);
    }

    public void stopIntake() {
        this.intakeMotor.set(0.0);
    }

}
