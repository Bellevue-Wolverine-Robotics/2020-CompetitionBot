package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShootSubsystem extends SubsystemBase {

    private final CANSparkMax shootMotor = new CANSparkMax(SHOOT_MOTOR, CANSparkMaxLowLevel.MotorType.kBrushless);

    private double targetPower;

    public ShootSubsystem() {
        this.targetPower = -0.85;
    }

    public double getTargetPower() {
        return this.targetPower;
    }

    public double getTargetSpeed() {
        return -4300;
    }

    public double getCurrentSpeed() {
        return this.shootMotor
            .getEncoder()
            .getVelocity();
    }

    public void startShoot() {
        this.shootMotor.set(this.targetPower);
    }

    public void stopShoot() {
        this.shootMotor.set(0.0);
    }

}
