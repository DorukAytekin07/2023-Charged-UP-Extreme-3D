package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_VictorSPX;
import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class ElevatorSubsystem extends SubsystemBase {
  private WPI_VictorSPX elevatorSparkMax = new WPI_VictorSPX(Constants.Teleop.ElevatorConstants.CAN_ELEVATOR_VICTOR_SPX);
  
  public ElevatorSubsystem() {}

  @Override
  public void periodic() {}
  
  public void elevatorMovement(double speed){
    elevatorSparkMax.set(speed);
  }

}
