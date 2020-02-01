package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.revrobotics.*;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ShootSubsystem extends SubsystemBase {

    private final CANSparkMax shootMotor = new CANSparkMax(SHOOT_MOTOR, CANSparkMaxLowLevel.MotorType.kBrushless);

    public ShootSubsystem() {
        
    }

    public void startShoot() {
        this.shootMotor.set(0.1);
    }

    public void stopShoot() {
        this.shootMotor.set(0.0);
    }

}
