package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.JamFixSubsystem;

public class FixJamCommand extends CommandBase {

	private final JamFixSubsystem jamFixSubsystem;

    public FixJamCommand(JamFixSubsystem jamFixSubsystem) {
        this.jamFixSubsystem = jamFixSubsystem;
        this.addRequirements(this.jamFixSubsystem);
    }

    @Override
    public void initialize() {
        this.jamFixSubsystem.startFix();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        this.jamFixSubsystem.stopFix();
    }

}