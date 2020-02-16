package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ConveyorSubsystem extends SubsystemBase {

    private final WPI_TalonSRX conveyorMotorBack = new WPI_TalonSRX(FRONT_CONVEYOR_MOTOR);
    private final WPI_TalonSRX conveyorMotorFront = new WPI_TalonSRX(BACK_CONVEYOR_MOTOR);

    private final SpeedControllerGroup motors = new SpeedControllerGroup(this.conveyorMotorFront, this.conveyorMotorBack);

    public ConveyorSubsystem() {
        
    }

    public void startConveyor() {
        this.motors.set(1.0);
    }

    public void stopConveyor() {
        this.motors.set(0.0);
    }

}
