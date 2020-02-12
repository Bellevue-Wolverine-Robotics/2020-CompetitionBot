package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ShootSubsystem;

public class ShootCommand extends CommandBase {

    private final ShootSubsystem shootSubsystem;

    public ShootCommand(ShootSubsystem shootSubsystem) {
        this.shootSubsystem = shootSubsystem;
        this.addRequirements(this.shootSubsystem);
    }

    @Override
    public void initialize() {
        this.shootSubsystem.startShoot();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        this.shootSubsystem.stopShoot();
    }

}
