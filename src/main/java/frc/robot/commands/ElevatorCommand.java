package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.ElevatorSubsystem;

public class ElevatorCommand extends CommandBase {
  private ElevatorSubsystem elevatorSubsystem;
  private int direction;

  public ElevatorCommand(ElevatorSubsystem elevatorSubsystem,int direction) {
    this.direction = direction;
    this.elevatorSubsystem = elevatorSubsystem;
    addRequirements(elevatorSubsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    if(direction == 0){
      elevatorSubsystem.elevatorMovement(Constants.Teleop.ElevatorConstants.ELEVATOR_DOWN);
    }

    else if(direction == 1) {
      elevatorSubsystem.elevatorMovement(Constants.Teleop.ElevatorConstants.ELEVATOR_UP);
    }

    else if (direction == 2){
      elevatorSubsystem.elevatorMovement(0);
    }
    
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
