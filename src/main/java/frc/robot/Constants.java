package frc.robot;

public final class Constants {

  public static final class Teleop{

    public static final class DriveTrainContants {
      public static final int CAN_LEFT_FRONT_VICTOR_SPX = 5;
      public static final int CAN_LEFT_BACK_VICTOR_SPX = 3;
      public static final int CAN_RIGHT_FRONT_VICTOR_SPX = 2;
      public static final int CAN_RIGHT_BACK_VICTOR_SPX = 4;
    }

    public static final class GripperArmContants{
      public static final int CAN_GRIPPER_ARM_SPARK_MAX = 7;
      public static final double GRIPPER_ARM_FORWARD = 0.6;
      public static final double GRIPPER_ARM_REVERSE = -0.8;
    }

    public static final class ElevatorConstants{
      public static final int CAN_ELEVATOR_VICTOR_SPX = 6;
      public static final double ELEVATOR_UP = -1.0;
      public static final double ELEVATOR_DOWN = 0.5 ;
    }

    public static final class GripperConstants{
      public static final int FORWARD_SOLENOID = 0;
      public static final int REVERSE_SOLENOID = 1;
    }

  }
  
  public static final class Auto{

    public static final class DriveForwardConstants{
      public static final double Z_SPEED = 0;
      public static final double Y_SPEED = -0.6;
    }

  }

}

