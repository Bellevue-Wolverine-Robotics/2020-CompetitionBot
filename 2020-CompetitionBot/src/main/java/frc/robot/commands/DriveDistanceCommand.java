package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;

/**
 * A command that drives a {@link DriveTrainSubsystem} a certain distance.
 */
public class DriveDistanceCommand extends CommandBase {

    private final DriveTrainSubsystem driveTrainSubsystem;

    private final double targetDistance;

    private final double initialDistance;

    private boolean isFinished;

    /**
     * Construct a new DriveDistanceCommand using the provided {@link DriveTrainSubsystem} to drive the specified distance in inches.
     * @param driveTrainSubsystem The subsystem
     * @param targetDistance The target distance in inches
     */
    public DriveDistanceCommand(DriveTrainSubsystem driveTrainSubsystem, double targetDistance) {
        this.driveTrainSubsystem = driveTrainSubsystem;
        this.addRequirements(this.driveTrainSubsystem);
        this.targetDistance = targetDistance;
        this.initialDistance = this.driveTrainSubsystem.getLeftEncoderDistance();
        this.isFinished = false;
    }

    @Override
    public void execute() {
        if (!this.isFinished && this.driveTrainSubsystem.getLeftEncoderDistance() - this.initialDistance >= this.targetDistance) {
            this.isFinished = true;
        } else {
            this.driveTrainSubsystem.arcadeDrive(1.0, 0.0);
        }
    }
    
    @Override
    public boolean isFinished() {
        return this.isFinished;
    }

}
