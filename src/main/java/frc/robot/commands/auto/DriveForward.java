package frc.robot.commands.auto;

import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.Constants;
import frc.robot.subsystems.DriveTrainSubsystem;

public class DriveForward extends CommandBase {
  Timer timer = new Timer();
  DriveTrainSubsystem driveTrainSubsystem;
  double zSpeed;
  double ySpeed;
  
  public DriveForward(double zSpeed,double ySpeed,DriveTrainSubsystem driveTrainSubsystem) {
    this.zSpeed = zSpeed;
    this.ySpeed = ySpeed; 
    this.driveTrainSubsystem = driveTrainSubsystem;
    addRequirements(this.driveTrainSubsystem);
  }

  @Override
  public void initialize() {
    timer.reset();
    timer.start();
  }

  @Override
  public void execute() {
    driveTrainSubsystem.autoArcadeDrive(Constants.Auto.DriveForwardConstants.Z_SPEED,Constants.Auto.DriveForwardConstants.Y_SPEED);
  }

  @Override
  public void end(boolean interrupted) {
    if(interrupted){
      timer.stop();
      driveTrainSubsystem.autoArcadeDrive(0, 0);
    }

  }

  @Override
  public boolean isFinished() {
    if(timer.get() >= 3.0){
      return true;
    }

    else{
      return false;
    }

  }

}
