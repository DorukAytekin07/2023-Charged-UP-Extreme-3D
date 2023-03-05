package frc.robot.subsystems;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.PneumaticsModuleType;
import edu.wpi.first.wpilibj2.command.SubsystemBase;

public class CompressorSubsystem extends SubsystemBase {
  private Compressor compressor = new Compressor(PneumaticsModuleType.CTREPCM);
  
  public CompressorSubsystem() {}

  @Override
  public void periodic() {}

  public void openCompressor(){
    compressor.enableDigital();
  }

  public void closeCompressor(){
    compressor.disable();
  }

  public double getPressure(){
    return compressor.getPressure();
  }

  public double getCurrent(){
    return compressor.getCurrent();
  }

  public boolean pressureSwitchValue(){
    return compressor.getPressureSwitchValue();
  }

}