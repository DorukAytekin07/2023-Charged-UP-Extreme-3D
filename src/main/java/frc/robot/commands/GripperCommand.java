package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.GripperSubsystem;

public class GripperCommand extends CommandBase {
  private GripperSubsystem gripperSubsystem;
  private boolean isOpen;

  public GripperCommand(GripperSubsystem gripperSubsystem,boolean isOpen) {
    this.gripperSubsystem = gripperSubsystem;
    this.isOpen = isOpen;
    addRequirements(gripperSubsystem);
  }

  @Override
  public void initialize() {
    gripperSubsystem.offSoloneid();
  }

  @Override
  public void execute() {
    if(isOpen){
      gripperSubsystem.openGripper();
    }
    
    else{
      gripperSubsystem.closeGripper();
    }
    
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }

}
