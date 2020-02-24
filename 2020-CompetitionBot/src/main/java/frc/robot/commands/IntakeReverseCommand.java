package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

public class IntakeReverseCommand extends CommandBase {

    private final IntakeSubsystem intakeSubsystem;

    public IntakeReverseCommand(IntakeSubsystem intakeSubsystem) {
        this.intakeSubsystem = intakeSubsystem;
        this.addRequirements(this.intakeSubsystem);
    }

    @Override
    public void initialize() {
        this.intakeSubsystem.reverseIntake();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        this.intakeSubsystem.stopIntake();
    }

}