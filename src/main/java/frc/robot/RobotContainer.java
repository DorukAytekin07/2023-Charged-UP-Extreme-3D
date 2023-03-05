package frc.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.SequentialCommandGroup;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;
import edu.wpi.first.wpilibj2.command.button.Trigger;
import frc.robot.commands.CompressorCommands;
import frc.robot.commands.DriveTrainCommand;
import frc.robot.commands.ElevatorCommand;
import frc.robot.commands.GripperArmCommand;
import frc.robot.commands.GripperCommand;
import frc.robot.commands.auto.DriveForward;
import frc.robot.subsystems.CompressorSubsystem;
import frc.robot.subsystems.DriveTrainSubsystem;
import frc.robot.subsystems.ElevatorSubsystem;
import frc.robot.subsystems.GripperArmSubsystem;
import frc.robot.subsystems.GripperSubsystem;

public class RobotContainer {
  public static Joystick joystick;
  private DriveTrainSubsystem driveTrainSubsystem = new DriveTrainSubsystem();
  private DriveTrainCommand driveTrainCommand = new DriveTrainCommand(driveTrainSubsystem);
  private ElevatorSubsystem elevatorSubsystem = new ElevatorSubsystem();
  private ElevatorCommand elevatorCommand = new ElevatorCommand(elevatorSubsystem, 2);
  private GripperArmSubsystem gripperArmSubsystem = new GripperArmSubsystem();
  private GripperArmCommand gripperArmCommand = new GripperArmCommand(gripperArmSubsystem, 2);
  private GripperSubsystem gripperSubsystem = new GripperSubsystem();
  private GripperCommand gripperCommand = new GripperCommand(gripperSubsystem, false);
  private CompressorSubsystem compressorSubsystem = new CompressorSubsystem();
  private CompressorCommands compressorCommands = new CompressorCommands(compressorSubsystem, true);
  
  public RobotContainer() {
    joystick = new Joystick(0);
    driveTrainSubsystem.setDefaultCommand(driveTrainCommand);
    elevatorSubsystem.setDefaultCommand(elevatorCommand);
    gripperArmSubsystem.setDefaultCommand(gripperArmCommand);
    gripperSubsystem.setDefaultCommand(gripperCommand);
    compressorSubsystem.setDefaultCommand(compressorCommands);
    configureBindings();
  }

  private void configureBindings() {
    Trigger openGripper = new JoystickButton(joystick, 1);
    Trigger armForward = new JoystickButton(joystick, 3);
    Trigger armBack = new JoystickButton(joystick, 4);
    //Trigger closegripper = new JoystickButton(joystick, 6);
    Trigger elevatorUp = new JoystickButton(joystick, 5);
    Trigger elevatorDown = new JoystickButton(joystick, 6);
    Trigger openCompressor = new JoystickButton(joystick, 11);
    Trigger closeCompressor = new JoystickButton(joystick, 12);
    
    openGripper.toggleOnTrue(new GripperCommand(gripperSubsystem, true));
    
    armForward.whileTrue(new GripperArmCommand(gripperArmSubsystem, 0));
    armBack.whileTrue(new GripperArmCommand(gripperArmSubsystem, 1));
    armForward.whileFalse(gripperArmCommand);
    armBack.whileFalse(gripperArmCommand);

    elevatorUp.whileTrue(new ElevatorCommand(elevatorSubsystem, 0));
    elevatorDown.whileTrue(new ElevatorCommand(elevatorSubsystem, 1));
    elevatorUp.whileFalse(elevatorCommand);
    elevatorDown.whileFalse(elevatorCommand);

    openCompressor.onTrue(compressorCommands);
    closeCompressor.onFalse(new CompressorCommands(compressorSubsystem, false));
  }

  public Command getAutonomousCommand() {
    return new SequentialCommandGroup(
      new DriveForward(0, 0, driveTrainSubsystem)
      );
  }
  
}
