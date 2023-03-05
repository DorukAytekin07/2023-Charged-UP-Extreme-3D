package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.CommandBase;
import frc.robot.subsystems.CompressorSubsystem;

public class CompressorCommands extends CommandBase {
  private CompressorSubsystem compressorSubsystem;
  private boolean open;

  public CompressorCommands(CompressorSubsystem compressorSubsystem ,boolean open) {
    this.compressorSubsystem = compressorSubsystem;
    this.open = open; 
    addRequirements(compressorSubsystem);
  }

  @Override
  public void initialize() {}

  @Override
  public void execute() {
    System.out.println(open);
    if(open){
      compressorSubsystem.openCompressor();
    }

    else{
      
      compressorSubsystem.closeCompressor();
    }
    
  }

  @Override
  public void end(boolean interrupted) {}

  @Override
  public boolean isFinished() {
    return false;
  }
}
