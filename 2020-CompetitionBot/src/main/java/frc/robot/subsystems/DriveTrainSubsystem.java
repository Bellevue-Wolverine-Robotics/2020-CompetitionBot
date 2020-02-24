package frc.robot.subsystems;

import static frc.robot.Constants.*;
import com.ctre.phoenix.motorcontrol.can.*;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.shuffleboard.Shuffleboard;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

/**
 * Drivetrain subsystem that uses an Arcade Drive.
 */
public class DriveTrainSubsystem extends SubsystemBase {

    public static final double GEAR_RATIO = 1 / 10.0;

    /**
     * The distance (IN INCHES) per encoder pulse. Equal to {@value 19.25π / 200 in} multiplied by the {@link GEAR_RATIO};
     */
    public static final double DISTANCE_PER_PULSE = ((19.25 * Math.PI) / 200) * GEAR_RATIO * (48 / 21.89);

    public static final double MOTOR_COEFFICIENT_FORWARDBACK = 1.0;
    public static final double MOTOR_COEFFICIENT_LEFTRIGHT = -1.0;

    private final WPI_TalonSRX l1 = new WPI_TalonSRX(LEFT_FRONT_DRIVE_MOTOR);
    private final WPI_TalonSRX l2 = new WPI_TalonSRX(LEFT_BACK_DRIVE_MOTOR);
    private final WPI_TalonSRX r1 = new WPI_TalonSRX(RIGHT_FRONT_DRIVE_MOTOR);
    private final WPI_TalonSRX r2 = new WPI_TalonSRX(RIGHT_BACK_DRIVE_MOTOR);

    private final Encoder leftEncoder = new Encoder(0, 1);
    private final Encoder rightEncoder = new Encoder(3, 2);
    
    private final SpeedControllerGroup leftControllerGroup = new SpeedControllerGroup(l1, l2);
    private final SpeedControllerGroup rightControllerGroup = new SpeedControllerGroup(r1, r2);
    
    private final DifferentialDrive differentialDrive = new DifferentialDrive(this.leftControllerGroup, this.rightControllerGroup);

    /**
     * Contruct an instance of the drivetrain.
     */
    public DriveTrainSubsystem() {
        this.l1.configFactoryDefault();
        this.l2.configFactoryDefault();
        this.r1.configFactoryDefault();
        this.r2.configFactoryDefault();

        this.leftControllerGroup.setInverted(true);
        this.rightControllerGroup.setInverted(true);

        this.leftEncoder.setDistancePerPulse(DISTANCE_PER_PULSE);
        this.rightEncoder.setDistancePerPulse(DISTANCE_PER_PULSE);

        Shuffleboard.getTab(TAB_KEY)
            .add(DRIVETRAIN_KEY, this.differentialDrive);
    }

    @Override
    public void periodic() {
        
    }

    public void arcadeDrive(double forwardBack, double leftRight) {
        this.differentialDrive.arcadeDrive(MOTOR_COEFFICIENT_FORWARDBACK * forwardBack, MOTOR_COEFFICIENT_LEFTRIGHT * leftRight);
    }

    public void curvatureDrive(double forwardBack, double leftRight, boolean quickTurn) {
        this.differentialDrive.curvatureDrive(MOTOR_COEFFICIENT_FORWARDBACK * forwardBack, MOTOR_COEFFICIENT_LEFTRIGHT * leftRight, quickTurn);
    }

    /**
     * Gets the total distance in inches recorded by the left encoder.
     * @return Returns the total recorded distance
     */
    public double getLeftEncoderDistance() {
        return -this.leftEncoder.getDistance();
    }

    /**
     * Gets the total distance in inches recorded by the right encoder.
     * @return Returns the total recorded distance
     */
    public double getRightEncoderDistance() {
        return -this.rightEncoder.getDistance();
    }

    public double getLeftEncoderRate() {
        return -this.leftEncoder.getRate();
    }

    public double getRightEncoderRate() {
        return -this.rightEncoder.getRate();
    }
    
}
