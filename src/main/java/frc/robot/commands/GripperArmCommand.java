package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.GripperArmSubsystem;

public class GripperArmCommand extends CommandBase {
  private GripperArmSubsystem gripperArmSubsystem;
  private int direction;

  public GripperArmCommand(GripperArmSubsystem gripperArmSubsystem , int direction) {
    this.gripperArmSubsystem = gripperArmSubsystem;
    this.direction = direction;
    addRequirements(gripperArmSubsystem);
  }
 
  @Override
  public void initialize() {}

  @Override
  public void execute() {
    if(direction == 0){
      gripperArmSubsystem.gripperarmMovement(Constants.Teleop.GripperArmContants.GRIPPER_ARM_FORWARD);
    }

    else if(direction == 1){
      gripperArmSubsystem.gripperarmMovement(Constants.Teleop.GripperArmContants.GRIPPER_ARM_REVERSE);

    }

    else if(direction == 2){
      gripperArmSubsystem.gripperarmMovement(0);
    }

  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
