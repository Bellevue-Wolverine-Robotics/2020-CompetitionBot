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
        System.out.println("initialize() called");
        this.shootSubsystem.startShoot();
    }

    @Override
    public boolean isFinished() {
        return false;
    }

    @Override
    public void end(boolean interrupted) {
        System.out.println("end(" + interrupted + ") called");
        this.shootSubsystem.stopShoot();
    }

}
