package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.*;

public class AutoRunConveyorToShootNBallsCommand extends CommandBase {

	private final ConveyorSubsystem conveyorSubsystem;
	private final ShootSubsystem shootSubsystem;

	private final int n;

	private double threshold;
	private int counter;
	private boolean isCounted;

	public AutoRunConveyorToShootNBallsCommand(ConveyorSubsystem conveyorSubsystem, ShootSubsystem shootSubsystem, int n) {
		this.conveyorSubsystem = conveyorSubsystem;
		this.shootSubsystem = shootSubsystem;
		this.addRequirements(this.conveyorSubsystem, this.shootSubsystem);
		this.n = n;

		this.threshold = 150;
		this.counter = 0;
		this.isCounted = false;
	}

	@Override
	public void initialize() {
		this.conveyorSubsystem.startConveyor();
	}

	@Override
	public void execute() {
		if (Math.abs(this.shootSubsystem.getTargetSpeed() - this.shootSubsystem.getCurrentSpeed()) >= this.threshold) {
			if (!this.isCounted) {
				this.counter++;
				this.isCounted = true;

				System.out.println("You have been shot");
			}
		} else {
			this.isCounted = false;
		}
	}

	@Override
	public boolean isFinished() {
		return this.counter >= this.n;
	}

	@Override
	public void end(boolean interrupted) {
		this.conveyorSubsystem.stopConveyor();
	}

}
