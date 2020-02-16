package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShootSubsystem extends SubsystemBase {

    private final CANSparkMax shootMotor = new CANSparkMax(SHOOT_MOTOR, CANSparkMaxLowLevel.MotorType.kBrushless);

    private double speed;

    public ShootSubsystem() {
        this.speed = -0.65;
    }

    public double getSpeed() {
        return this.speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public void startShoot() {
        this.shootMotor.set(this.speed);
    }

    public void stopShoot() {
        this.shootMotor.set(0.0);
    }

}
