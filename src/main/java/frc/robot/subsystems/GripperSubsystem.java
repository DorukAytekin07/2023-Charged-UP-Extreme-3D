package frc.robot.subsystems;

import edu.wpi.first.wpilibj.DoubleSolenoid;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj.DoubleSolenoid.Value;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class GripperSubsystem extends SubsystemBase {
  private DoubleSolenoid gripperDoubleSolenoid = new DoubleSolenoid(PneumaticsModuleType.CTREPCM, Constants.Teleop.GripperConstants.FORWARD_SOLENOID, Constants.Teleop.GripperConstants.REVERSE_SOLENOID);
  
  public GripperSubsystem() {
    gripperDoubleSolenoid.set(Value.kOff);
  }

  @Override
  public void periodic() {}

  public void openGripper(){ 
    gripperDoubleSolenoid.set(Value.kForward);
  }

  public void closeGripper(){
    gripperDoubleSolenoid.set(Value.kReverse);
  }

  public void offSoloneid(){
    gripperDoubleSolenoid.set(Value.kOff);
  }

}
