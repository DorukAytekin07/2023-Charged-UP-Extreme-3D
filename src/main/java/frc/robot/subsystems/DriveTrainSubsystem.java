package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj.motorcontrol.MotorControllerGroup;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;
import frc.robot.RobotContainer;

public class DriveTrainSubsystem extends SubsystemBase {
  private WPI_VictorSPX leftFrontVictorSPX = new WPI_VictorSPX(Constants.Teleop.DriveTrainContants.CAN_LEFT_FRONT_VICTOR_SPX);
  private WPI_VictorSPX leftBackVictorSPX = new WPI_VictorSPX(Constants.Teleop.DriveTrainContants.CAN_LEFT_BACK_VICTOR_SPX);
  private WPI_VictorSPX rightFrontVictorSPX = new WPI_VictorSPX(Constants.Teleop.DriveTrainContants.CAN_RIGHT_FRONT_VICTOR_SPX);
  private WPI_VictorSPX rightBackVictorSPX = new WPI_VictorSPX(Constants.Teleop.DriveTrainContants.CAN_RIGHT_BACK_VICTOR_SPX);
  private MotorControllerGroup leftMotorControllerGroup = new MotorControllerGroup(leftFrontVictorSPX, leftBackVictorSPX);
  private MotorControllerGroup rightMotorControllerGroup = new MotorControllerGroup(rightFrontVictorSPX, rightBackVictorSPX);
  private DifferentialDrive drive = new DifferentialDrive(leftMotorControllerGroup,rightMotorControllerGroup);
  
  public DriveTrainSubsystem() {}

  @Override
  public void periodic() {}

  public void arcadeDrive(){
    drive.arcadeDrive(RobotContainer.joystick.getZ() * 0.7, RobotContainer.joystick.getY() *0.9);
  }

  public void autoArcadeDrive(double zSpeed,double ySpeed){
    drive.arcadeDrive(zSpeed, ySpeed);
  }

}
  