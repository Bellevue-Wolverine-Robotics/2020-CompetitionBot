package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.ConveyorSubsystem;
import frc.robot.subsystems.JamFixSubsystem;

public class ConveyorAndJamCommand extends CommandBase {
  
  private final ConveyorSubsystem conveyorSubsystem;
  private final JamFixSubsystem jamFixSubsystem;

  public ConveyorAndJamCommand(ConveyorSubsystem conveyorSubsystem, JamFixSubsystem jamFixSubsystem) {
    this.conveyorSubsystem = conveyorSubsystem;
    this.jamFixSubsystem = jamFixSubsystem;
    this.addRequirements(this.conveyorSubsystem, this.jamFixSubsystem);
  }

  @Override
  public void initialize() {
    this.jamFixSubsystem.startFix();
    this.conveyorSubsystem.startConveyor();
  }

  @Override
  public void end(boolean interrupted) {
    this.jamFixSubsystem.stopFix();
    this.conveyorSubsystem.stopConveyor();
  }

  @Override
  public boolean isFinished() {
    return false;
  }
}
