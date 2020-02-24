package frc.robot.commands;

import static frc.robot.Constants.*;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;

/**
 * Default command for the {@link DriveTrainSubsystem}, which arcades the drive using a {@link GenericHID}.
 */
public class DriveTrainCurvatureDefaultCommand extends CommandBase {
        
    private final DriveTrainSubsystem driveTrainSubsystem;
    private final GenericHID driveHid1;
    private final GenericHID driveHid2;

    private final double initialDistance;

    public DriveTrainCurvatureDefaultCommand(DriveTrainSubsystem driveTrainSubsystem, GenericHID driveHid1, GenericHID driveHid2) {
        this.driveTrainSubsystem = driveTrainSubsystem;
        this.driveHid1 = driveHid1;
        this.driveHid2 = driveHid2;
        this.addRequirements(this.driveTrainSubsystem);

        this.initialDistance = this.driveTrainSubsystem.getLeftEncoderDistance();
    }

    @Override
    public void execute() {
        System.out.println(this.driveTrainSubsystem.getLeftEncoderDistance() - this.initialDistance);
        double forwardBack = this.driveHid1.getY();
        double leftRight = this.driveHid2.getX();

        this.driveTrainSubsystem.curvatureDrive(forwardBack, leftRight, this.driveHid2.getRawButton(QUICKTURN_BUTTON));
    }

}
