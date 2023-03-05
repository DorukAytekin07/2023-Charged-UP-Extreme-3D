package frc.robot.subsystems;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class GripperArmSubsystem extends SubsystemBase {
  private CANSparkMax gripperArmSparkMax = new CANSparkMax(Constants.Teleop.GripperArmContants.CAN_GRIPPER_ARM_SPARK_MAX,MotorType.kBrushed);
  
  public GripperArmSubsystem() {}

  @Override
  public void periodic() {}

  public void gripperarmMovement(double speed){
    gripperArmSparkMax.set(speed);
  }
  
}
