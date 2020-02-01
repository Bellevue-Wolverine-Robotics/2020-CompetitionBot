package frc.robot.subsystems;

import static frc.robot.Constants.*;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class ConveyorSubsystem extends SubsystemBase {

    private final WPI_TalonSRX conveyorMotor = new WPI_TalonSRX(CONVEYOR_MOTOR);

    public ConveyorSubsystem() {
        
    }

    public void startConveyor() {
        this.conveyorMotor.set(1.0);
    }

    public void stopConveyor() {
        this.conveyorMotor.set(0.0);
    }

}
