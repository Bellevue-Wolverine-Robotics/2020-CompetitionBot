package frc.robot.commands;

import edu.wpi.first.wpilibj.GenericHID;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;

/**
 * Default command for the {@link DriveTrainSubsystem}, which arcades the drive using a {@link GenericHID}.
 */
public class DriveTrainArcadeDefaultCommand extends CommandBase {
        
    private final DriveTrainSubsystem driveTrainSubsystem;
    private final GenericHID driveHid;

    public DriveTrainArcadeDefaultCommand(DriveTrainSubsystem driveTrainSubsystem, GenericHID driveHid) {
        this.driveTrainSubsystem = driveTrainSubsystem;
        this.driveHid = driveHid;
        this.addRequirements(this.driveTrainSubsystem);
    }

    @Override
    public void execute() {
        double forwardBack = this.driveHid.getY();
        double leftRight = this.driveHid.getX();

        this.driveTrainSubsystem.arcadeDrive(forwardBack, leftRight);
    }

}
