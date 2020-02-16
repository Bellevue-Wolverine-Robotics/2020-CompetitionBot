package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.IntakeSubsystem;

/**
 * Toggles the {@link IntakeSubsystem}'s pneumatic deploy/retract state.
 */
public class ToggleIntakeCommand extends CommandBase {

	private final IntakeSubsystem intakeSubsystem;

	public ToggleIntakeCommand(IntakeSubsystem intakeSubsystem) {
		this.intakeSubsystem = intakeSubsystem;
		this.addRequirements(this.intakeSubsystem);
	}

	@Override
	public void initialize() {
		this.intakeSubsystem.toggleIntakeDeploy();
	}

	@Override
	public boolean isFinished() {
		return true;
	}
	
}
