package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.DriveTrainSubsystem;

public class DriveTrainCommand extends CommandBase {
  private DriveTrainSubsystem driveTrainSubsystem;

  public DriveTrainCommand(DriveTrainSubsystem driveTrainSubsystem) {
    this.driveTrainSubsystem = driveTrainSubsystem;
    addRequirements(driveTrainSubsystem);
  }
 
  @Override
  public void initialize() {}
 
  @Override
  public void execute() {
    driveTrainSubsystem.arcadeDrive();
  }
  
  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
